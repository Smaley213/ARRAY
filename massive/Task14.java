package by.htp.less.massive;

import java.util.Random;

// Дан одномерный массив A[N]. Найти: max(a2, a4, ... a2*k) + min(a1, a3, ... a2*k+1 )

public class Task14 {
	
public static void main(String[] args) {
		
		int n = 10; //Создаем переменную со значением

		int[] mas = new int[n];   // приравнивание переменных

		Random rand = new Random();  // наш рандомчик

		for (int i = 0; i < mas.length; i++) {    //Тут 1 цикл проходит по длине массива

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {  //Тут 2 цикл проходит по длине массива

			System.out.print(mas[i] + "/");
		}
		
		int max;
		max = mas[1];
		
		for (int i = 1; i < mas.length; i = i + 2) {  //Тут 3 цикл проходит по длине массива

			if (mas[i] > max) {

				max = mas[i];
				
			}
		}
		
		int min;
		min = mas[0];
		
		for (int i = 0; i < mas.length; i = i + 2) {  //Тут 4 цикл проходит по длине массива

			if (min > mas[i]) {

				min = mas[i];

			}

		}
		
		int sum;
		sum = max + min;
		
		System.out.println("\nmax(a2, a4, ... a2*k) + min(a1, a3, ... a2*k+1) равно " + sum);
	}


}
