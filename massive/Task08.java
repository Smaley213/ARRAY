package by.htp.less.massive;

// Дан массив действительных чисел, размерность которого N. 
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task08 {
	
	public static void main(String[] args) {
		
		int[] a = {2, 4, -4, 3, -9, 3, -9, 6, 0, -3, 0, 4, 5, 0, -4}; // создание массива и переменных
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i = 0; i < a.length; i++) { // Запуск цикла и его условия 
			if (a[i] > 0) {
				count1++;
			}
			if (a[i] < 0) {
				count2++;
			}
			if (a[i] == 0) {
				count3++;
			}
		}
		System.out.println("Положительных элементов: " + count1); // Вывод результатов в консоль
		System.out.println("Отрицательных элементов: " + count2);
		System.out.println("Равных 0 элементов: " + count3);
	}

}
