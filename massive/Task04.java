package by.htp.less.massive;

// ���� ������������������ �������������� ����� �1 �2 ,..., �n . ��������, ����� �� ��� ������������.

import java.util.Random;

public class Task04 {
	public static void main(String args[]) {
		
		int n = 10;
		int[] a = new int[n];
		
		
		Random rand = new Random();
		
		for (int i = 0 ; i < a.length; i++){
			a[i] = rand.nextInt(10);
		}
     
    int i; 
		for (i = 0 ; i < a.length - 1; i++){
 			 if (a[i] > a[i+1]) {
     			System.out.println("��������������"); 
          break;
			 }
		}
    if(i == a.length){
      System.out.println("������������");
      }
    
    }

}
