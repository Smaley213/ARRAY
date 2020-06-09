package by.htp.less.massive;

//  ƒана последовательность чисел а1 ,а2 ,..., аn. 
// ”казать наименьшую длину числовой оси, содержащую все эти числа.


public class Task06 {
	
	public static void main(String[] args) {
		
		int[] a = {2, 3, 6, 2, 9, 2, 8}; // создание переменных
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {  // запуск цикла и услови€
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		int sum = max - min;
		
		System.out.println("Ќаименьша€ длина числовой оси = " + sum); // вывод в консоль
	}

}
