package by.htp.less.massive;


//  ƒана последовательность целых чисел  a1,a2,...,an. 
//  ќбразовать новую последовательность, выбросив из исходной те члены, которые равны  min(a1,a2,...,an). 

public class Task17 {
	
	public static void main(String[] args) {
		
		int[] a = {9, 8, 7, 5, 9, 3, 7, 9, 8, 5, 6, 3};
		
		int min = a[2];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		int x = a.length;
		int[] b = new int[x];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] != min) {
				b[i] = a[i];
				
				System.out.println(b[i]);
			}
		}
		

	}
}
