package com.xcheng.copy_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	private String oldPath;
	private String newPath;

	public CopyFile(String oldPath, String newPath) {
		super();
		this.oldPath = oldPath;
		this.newPath = newPath;
	}

	@Override
	public String toString() {
		return "CopyFile [oldPath=" + oldPath + ", newPath=" + newPath + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((newPath == null) ? 0 : newPath.hashCode());
		result = prime * result + ((oldPath == null) ? 0 : oldPath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CopyFile other = (CopyFile) obj;
		if (newPath == null) {
			if (other.newPath != null)
				return false;
		} else if (!newPath.equals(other.newPath))
			return false;
		if (oldPath == null) {
			if (other.oldPath != null)
				return false;
		} else if (!oldPath.equals(other.oldPath))
			return false;
		return true;
	}

	public String getOldPath() {
		return oldPath;
	}

	public void setOldPath(String oldPath) {
		this.oldPath = oldPath;
	}

	public String getNewPath() {
		return newPath;
	}

	public void setNewPath(String newPath) {
		this.newPath = newPath;
	}

//	复制文件方法
	public static void copyDir(String oPath, String nPath) throws Exception {
		File file = new File(oPath);
		String[] list = file.list();

		if (!(new File(nPath).exists())) {
			File path = new File(nPath);
			path.mkdir();
		}

		for (int i = 0; i < list.length; i++) {
//			System.out.println(new File(nPath + file.separator + list[i]).isDirectory());
			if (new File(oPath + file.separator + list[i]).isDirectory()) {
				copyDir(oPath + file.separator + list[i], nPath + file.separator + list[i]);
			}
			if (new File(oPath + file.separator + list[i]).isFile()) {
				copyFile(oPath + file.separator + list[i], nPath + file.separator + list[i]);
			}
		}
	}

	private static void copyFile(String s1, String s2) throws Exception {
		// TODO Auto-generated method stub
		int buffer = 2097152;
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s1), buffer);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(s2), buffer);
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

}
