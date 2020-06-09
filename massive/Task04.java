package by.htp.less.massive;

// ƒана последовательность действительных чисел а1 а2 ,..., аn . ¬ы€снить, будет ли она возрастающей.

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
     			System.out.println("невозрастающа€"); 
          break;
			 }
		}
    if(i == a.length){
      System.out.println("возрастающа€");
      }
    
    }

}
