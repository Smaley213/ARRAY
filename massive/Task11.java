package by.htp.less.massive;

import java.util.Random;

// Даны натуральные числа а1 ,а2 ,..., аn . 
// Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 


public class Task11 {
	
	public static void main(String[] args) {

		int m;       //Создаем переменные со значениями
		m = 5;

		int l;
		l = 2;

		int n = 10;

		int[] mas = new int[n];

		Random rand = new Random();  // рандом значений

		for (int i = 0; i < mas.length; i++) {  // проходим 1 цикл по всей длине массива

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) { // проходим 2 цикл по всей длине массива

			System.out.print(mas[i] + " / ");
		}

		System.out.println("\nПолученный массив: ");

		for (int i = 0; i < mas.length; i++) { // проходим 3 цикл по всей длине массива

			if (mas[i] % m == l) {   // условие

				System.out.println(mas[i] + " / ");  // вывод итога на экран
			}
		}
	}

}
