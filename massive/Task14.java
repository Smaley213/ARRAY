package by.htp.less.massive;

import java.util.Random;

// ��� ���������� ������ A[N]. �����: max(a2, a4, ... a2*k) + min(a1, a3, ... a2*k+1 )

public class Task14 {
	
public static void main(String[] args) {
		
		int n = 10; //������� ���������� �� ���������

		int[] mas = new int[n];   // ������������� ����������

		Random rand = new Random();  // ��� ���������

		for (int i = 0; i < mas.length; i++) {    //��� 1 ���� �������� �� ����� �������

			mas[i] = rand.nextInt(10);
		}

		System.out.println("�������� ������: ");

		for (int i = 0; i < mas.length; i++) {  //��� 2 ���� �������� �� ����� �������

			System.out.print(mas[i] + "/");
		}
		
		int max;
		max = mas[1];
		
		for (int i = 1; i < mas.length; i = i + 2) {  //��� 3 ���� �������� �� ����� �������

			if (mas[i] > max) {

				max = mas[i];
				
			}
		}
		
		int min;
		min = mas[0];
		
		for (int i = 0; i < mas.length; i = i + 2) {  //��� 4 ���� �������� �� ����� �������

			if (min > mas[i]) {

				min = mas[i];

			}

		}
		
		int sum;
		sum = max + min;
		
		System.out.println("\nmax(a2, a4, ... a2*k) + min(a1, a3, ... a2*k+1) ����� " + sum);
	}


}
