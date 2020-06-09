package by.htp.less.massive;

import java.util.Random;

//  Дана последовательность действительных чисел a1,a2,...,an . 
//  Указать те ее элементы, которые принадлежат отрезку [с, d]. 


public class Task15 {
	
	
public static void main(String[] args) { 
		
		int n;    // создание переменных и их значений ,ниже
		n = 20;
		
		int c;
		c = 2;
		
		int d;
		d = 3;

		int[] mas = new int[n];  // приравнивание переменных

		Random rand = new Random();  // создаем случайные комбинации

		for (int i = 0; i < mas.length; i++) {    //Тут 1 цикл проходит по длине массива

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {  //Тут 2 цикл проходит по длине массива

			System.out.print(mas[i] + " / ");
		}
		
		System.out.println("\nЧисла удовлетворяющие условию :");
		
		for(int i = 0; i < mas.length; i++) {  //Тут 3 цикл проходит по длине массива
			
			if(mas[i] <= d && mas[i] >= c) {  // условия цикла
				
				System.out.print(mas[i] + " / " );   // вывод на экран
			}
		}

	}


}
