package by.htp.less.massive;

import java.util.Random;

// ���� ����������� ����� �1 ,�2 ,..., �n . 
// ������� �� �� ���, � ������� ������� �� ������� �� � ����� L (0 < L < �-1). 


public class Task11 {
	
	public static void main(String[] args) {

		int m;       //������� ���������� �� ����������
		m = 5;

		int l;
		l = 2;

		int n = 10;

		int[] mas = new int[n];

		Random rand = new Random();  // ������ ��������

		for (int i = 0; i < mas.length; i++) {  // �������� 1 ���� �� ���� ����� �������

			mas[i] = rand.nextInt(10);
		}

		System.out.println("�������� ������: ");

		for (int i = 0; i < mas.length; i++) { // �������� 2 ���� �� ���� ����� �������

			System.out.print(mas[i] + " / ");
		}

		System.out.println("\n���������� ������: ");

		for (int i = 0; i < mas.length; i++) { // �������� 3 ���� �� ���� ����� �������

			if (mas[i] % m == l) {   // �������

				System.out.println(mas[i] + " / ");  // ����� ����� �� �����
			}
		}
	}

}
