package by.htp.less.massive;

// ���� ������������������ ����� ����� �1 �2,..., �n . 
// ��������, ����� ����� ����������� ������ - ������������� ��� �������������.

import java.util.Random;

public class Task03 {
	public static void main(String[]args) {
	
		int n = 10;
		int [] a = new int [n];
		
		
		Random rand = new Random();
		
		for (int i = 0 ; i < a.length; i++){
			a[i] = rand.nextInt(10);
		}
		
   
			if (a[0] >= 0) {
				System.out.println("�������������"); 
			}
			else {
				System.out.println("�������������"); 
			 }
		}
}
