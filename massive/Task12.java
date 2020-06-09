package by.htp.less.massive;

import java.util.Random;

//  Задана последовательность N вещественных чисел.
//  Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task12 {
	
	public static void main(String[] args) {

		int n = 20;             //Создаем переменные со значениями

		double[] mas = new double[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {  //Тут 1 цикл проходит по длине массива и приравнивает значение

			mas[i] = rand.nextDouble();
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {  //   //Тут 2 цикл проходит по длине массива 

			System.out.print(mas[i] + "/");

		}

		System.out.println();

		int temp;              // //Создаем переменные со значениями
		double sum = 0;

		for (int i = 1; i <= mas.length; i++) {  //   //Тут 3 цикл проходит по длине массива 
			
			boolean isPrime = true;   // //Создаем переменные со значениями
			
			for (int j = 2; j <= i / 2; j++) { // //Тут 4 цикл проходит и сравнивает

				temp = i % j;      //небольшая формула

				if (temp == 0) {  // условия формулы

					isPrime = false;

				}
			}

			if (isPrime) {     ///еще условие

				System.out.println(i + " - номер ячейки простое число");
				
				sum = sum + mas[i];    // тут подсчет значений полученных
			}

		}
		System.out.println("Сумма равна " + sum); /// Итог в консоль
	}

}
