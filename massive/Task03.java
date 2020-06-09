package by.htp.less.massive;

// Дана последовательность целых чисел а1 а2,..., аn . 
// Выяснить, какое число встречается раньше - положительное или отрицательное.

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
				System.out.println("Положительное"); 
			}
			else {
				System.out.println("Отрицательное"); 
			 }
		}
}
