package com.xcheng.copy_file;

import java.io.File;
import java.io.FileInputStream;

public class CopyFileCover {
	public static void copyDir(String oPath, String nPath) throws Exception {
		File file = new File(oPath);
		FileInputStream fis = new FileInputStream(file);
		String[] list = file.list();
		String separator = file.separator; // 系统分隔符
		if (!(new File(nPath).exists())) {
			File nfile = new File(nPath);
			nfile.mkdirs();
		}
		for (int i = 0; i < list.length; i++) {
			File file_tmp = new File(oPath + separator + list[i]);
			if (file_tmp.isDirectory()) {

			}
			if (file_tmp.isFile()) {
//				if (!(new File(nPath + separator + list[i]).exists())) {
//
//				}
			}
		}
	}
}
