package by.htp.less.massive;

import java.util.Random;

//  ������ ������������������ N ������������ �����.
//  ��������� ����� �����, ���������� ������ ������� �������� �������� �������.

public class Task12 {
	
	public static void main(String[] args) {

		int n = 20;             //������� ���������� �� ����������

		double[] mas = new double[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {  //��� 1 ���� �������� �� ����� ������� � ������������ ��������

			mas[i] = rand.nextDouble();
		}

		System.out.println("�������� ������: ");

		for (int i = 0; i < mas.length; i++) {  //   //��� 2 ���� �������� �� ����� ������� 

			System.out.print(mas[i] + "/");

		}

		System.out.println();

		int temp;              // //������� ���������� �� ����������
		double sum = 0;

		for (int i = 1; i <= mas.length; i++) {  //   //��� 3 ���� �������� �� ����� ������� 
			
			boolean isPrime = true;   // //������� ���������� �� ����������
			
			for (int j = 2; j <= i / 2; j++) { // //��� 4 ���� �������� � ����������

				temp = i % j;      //��������� �������

				if (temp == 0) {  // ������� �������

					isPrime = false;

				}
			}

			if (isPrime) {     ///��� �������

				System.out.println(i + " - ����� ������ ������� �����");
				
				sum = sum + mas[i];    // ��� ������� �������� ����������
			}

		}
		System.out.println("����� ����� " + sum); /// ���� � �������
	}

}
