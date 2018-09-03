package com.mystudy.io4_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		//���� ���� �غ�
		//File fileIn = new File("src\\com\\mystudy\\io4_filecopy\\FileCopy.java");
		//File fileIn = new File("src/com/mystudy/io4_filecopy/FileCopy.java");
		File fileIn = new File("����Ʈ_InputStream.png");
		
		//���� ���� ���� �غ�
		//File fileOut = new File("file/FileCopy.java_backup");
		File fileOut = new File("file/����Ʈ_InputStream_backup.png");
		
		//���Ͽ��� �а� ���� ���� ��ü�� ���� ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//���Ͽ��� �а� ���� ���� ��ü ����
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			//�а�, ����
			int value = -999;
			//read() : ���̻� ���� ���� ������ -1�� ����
			while ((value = fis.read()) != -1) {
				//���� ���� ���Ͽ� ����
				fos.write(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//����ڿ� close(�������� ��������)
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}