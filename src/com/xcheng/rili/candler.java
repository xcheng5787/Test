package com.xcheng.rili;

/*
��������ҵ��
       ����һ��ʱ���磺 2016-11
       ����ʾ2016��11�µ�������ʾ
*/

import java.util.*;

class candler {
    public static void main(String[] args){
        
        System.out.print("��ѡ�����(����1990��)��");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.print("��ѡ�������·ݣ�");
        int month = input.nextInt();
        // ���ж�year�Ƿ�������
        boolean Renyear;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "������");
            Renyear = true;
        } else {
            System.out.println(year + "��ƽ��");
            Renyear = false;
        }
        //��¼���µ�����
        int day = 0;
        switch (month){
            case 1:
                day = 31;
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
            case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 9:
                day = 30;
                break;
            case 10:
                day = 31;
                break;
            case 11:
                day = 30;
                break;
            case 12:
                day = 31;
                break;
            default:
                if (Renyear) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
        }
        System.out.println(year + "��" + month + "��" + "��" + day + "��" + "\t");
        System.out.println(month + "�·ݵ��������£�");
        // ��1990�굽ָ�����ڵ�������1990��1��1��Ϊ����һ��
        int sum = 0;
        for(int i = 1990;i < year; i++) {
            // �ж��Ƿ�������
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                sum = sum + 366;
            } else {
                sum = sum + 365;
            }
        }
        // ͳ���·ݵ�����
        for (int i = 1; i < month; i++) {
            
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) { // ����
                sum = sum + 31;

            } else if (i == 4 || i == 6 || i == 9 || i == 11){  // С��
                sum = sum + 30;
            } else {
                 // ����
                if (Renyear) {
                    sum = sum + 29;
                } else {
                    sum = sum + 28;
                }
            }   
        }
     
        int blank = sum % 7 + 1;//blank��ʼ����Ŀո��� +1�Ǵ������쿪ʼ��
        System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
         
        int temp = 1;
        for (int i = 0; i < blank; i++) {
            System.out.print("\t");
            temp++;
        }
        if (temp > 7){
            System.out.println("");
            temp = 1;
        }
        for (int i = 1; i <= day; i++) {
            if (temp % 7 == 0){
                System.out.print(i + "\n");//���ƻ���
                temp = 1;
            }
            else{
                System.out.print(i + "\t");
                temp++;
            }
        }
         
    }
}