package by.htp.less.massive;


//19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них.

public class Task19 {
	
	public static void main(String[] args) { 
		
		int[] a = {2, 5, 3, 4, 3, 6, 5, 8, 4, 5, 4, 2, 2, 3, 6, 8, 6, 4, 3, 2, 9, 5, 4};
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if (a[i] == a[j]) {
					b[i]++;
				}
			}
		}
		int valResult = a[0];
        int popResult = b[0];
        
        for (int i = 0; i < b.length; i++) {
        	
            if (b[i] > popResult) {
                popResult = b[i];
                valResult = a[i];
            }
            if ((popResult == b[i]) && (a[i] < valResult)) {
                valResult = a[i];
            }
        }
        System.out.print(valResult);
	}

}
