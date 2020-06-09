package by.htp.less.massive;

// ƒана последовательность действительных чисел а1 ,а2 ,..., аn. 
// «аменить все ее члены, большие данного Z, этим числом.ѕодсчитать количество замен.


public class Task07 {
	
	public static void main(String[] args) {
		
		int[] a = {2, 4, 6, 5, 2, 5, 8, 6, 5, 7, 3, 5, 9, 8}; // создание массива и переменных
		int z = 4;
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {  // запуск цикла и услови€
			
			if (a[i] > z) {
				a[i] = z;
				count += count;
			}
		}
		System.out.println(" оличество замен = " + count); // вывод в консоль итогов

	}

}
