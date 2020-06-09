package by.htp.less.massive;

import java.util.Random;

//Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.


public class Task13 {
	
	public static void main(String[] args) {

		int k;          //Создаем переменные со значениями
		k = 10;
		
		int  m;
		m = 5;
		
		int l;
		l = 1;
		
		int n;
		n = 50;
		
		int count;
		count = 0;

		int[] mas = new int[k];

		Random rand = new Random();    // создание рандома чисел

		for (int i = 0; i < mas.length; i++) {  //Тут 1 цикл проходит по длине массива

			mas[i] = rand.nextInt(10);      // приравниваем значение 
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {   //Тут2 цикл проходит по длине массива

			System.out.print(mas[i] + " / ");
		}
		
		for(int i = 0; i < mas.length; i++) {   //Тут 3 цикл проходит по длине массива
			
			if(mas[i] < n && mas[i] > l) {     //Тут условия цикла
				
				if(mas[i] % m == 0) {
					
					count++;
				}
			}
		}
		
		System.out.println("\nКоличество элементов последовательности натуральных чисел, кратных числу " + m + " и \r\n" + 
				" // заключенных в промежутке от " + l + " до " + n + " равно " + count);
	}


}
