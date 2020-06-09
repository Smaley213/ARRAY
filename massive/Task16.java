package by.htp.less.massive;

import java.util.Random;

//  Даны действительные числа  a1,a2,...,a(2*n).
//  Найти max(a1 + a2 * n, a2 + a(2*n - 1),..., an + a(n+1)).


public class Task16 {
	
	public static void main(String[] args) {

		int n;   // создание переменных и их значений ,ниже
		n = 15;

		int[] mas;
		mas = new int[n];  // приравнивание переменных
		int[] mas1;
		mas1 = new int[n / 2];

		Random rand = new Random();  //наш рандомайзер

		for (int i = 0; i < mas.length; i++) {     //Тут 1 цикл проходит по длине массива

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {    //Тут 2 цикл проходит по длине массива

			System.out.print(mas[i] + "/");
		}

		for (int i = 0; i < mas1.length; i++) {    //Тут 3 цикл проходит по длине массива

			mas1[i] = mas[i] + mas[(mas.length - 1) - i]; // формула решения сложения
		}

		int max;
		max = mas1[0];

		for (int i = 0; i < mas1.length; i++) {    //Тут 4 цикл проходит по длине массива

			if (max < mas1[i]) {   // условие цикла

				max = mas1[i];
			}
		}

		System.out.println("\nПолученный массив ");

		for (int i = 0; i < mas1.length; i++) {    //Тут 5 цикл проходит по длине массива

			System.out.print(mas1[i] + "/");
		}

		System.out.println("\nМаксимальный элемент равен: "); // вывод на экран

		System.out.print(max);

	}

}
