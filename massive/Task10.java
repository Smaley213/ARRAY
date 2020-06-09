package by.htp.less.massive;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 


public class Task10 {
	
	public static void main(String[] args) {
	
	int[] mas = new int[] { 7, -22, 0, 44, -2, 10, 20, 45, 125 }; //Создаем массив со значениями

	   System.out.println("Заданный массив: "); // вывод значений массива на экрал

	for (int i = 0; i < mas.length; i++) {  //проходим цикл по всей длине значений

		System.out.print(mas[i] + " / "); // и вывод на экран то ,что нашли в массиве
	}
	          System.out.println("\nЧисла которые больше номера ячейки в которой они расположены :");
	
	for (int i = 0; i < mas.length; i++) {  // еще цикл по всему массиву

		if (mas[i] > i) {   // небольшое условие

			System.out.print(mas[i] + " / ");   // и итоги на экран
		}
	}

  }
}


