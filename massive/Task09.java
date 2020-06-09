package by.htp.less.massive;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task09 {
	
	public static void main(String[] args) {
		
		int[] a = {9, 3, 6, 2, 1, 2, 3, 8, 4, 9, 8, 10}; // Создание массива. Присвоение значиений.
		int max = a[0];
		int countMax = 0;
		int min = a[0];
		int countMin = 0;
		
		for (int i = 0; i < a.length; i++) {  // Запуск цикла который проходит по всему массиву.
			if (a[i] > max) { // условия
				max = a[i];
				countMax = i;
			}
			if (a[i] < min) { // условия
				min = a[i];
				countMin = i;
			}
		}
		
		for (int i = 0; i < a.length; i++) {  // Запуск цикла который проходит по всему массиву.
			a[countMin] = max;
			a[countMax] = min;
			System.out.print(a[i]);  // вывод в консоль итогов
		}
		
		

	}

}
