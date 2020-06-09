package by.htp.less.massive;

import java.util.Random;

//  ���� �������������� �����  a1,a2,...,a(2*n).
//  ����� max(a1 + a2 * n, a2 + a(2*n - 1),..., an + a(n+1)).


public class Task16 {
	
	public static void main(String[] args) {

		int n;   // �������� ���������� � �� �������� ,����
		n = 15;

		int[] mas;
		mas = new int[n];  // ������������� ����������
		int[] mas1;
		mas1 = new int[n / 2];

		Random rand = new Random();  //��� �����������

		for (int i = 0; i < mas.length; i++) {     //��� 1 ���� �������� �� ����� �������

			mas[i] = rand.nextInt(10);
		}

		System.out.println("�������� ������: ");

		for (int i = 0; i < mas.length; i++) {    //��� 2 ���� �������� �� ����� �������

			System.out.print(mas[i] + "/");
		}

		for (int i = 0; i < mas1.length; i++) {    //��� 3 ���� �������� �� ����� �������

			mas1[i] = mas[i] + mas[(mas.length - 1) - i]; // ������� ������� ��������
		}

		int max;
		max = mas1[0];

		for (int i = 0; i < mas1.length; i++) {    //��� 4 ���� �������� �� ����� �������

			if (max < mas1[i]) {   // ������� �����

				max = mas1[i];
			}
		}

		System.out.println("\n���������� ������ ");

		for (int i = 0; i < mas1.length; i++) {    //��� 5 ���� �������� �� ����� �������

			System.out.print(mas1[i] + "/");
		}

		System.out.println("\n������������ ������� �����: "); // ����� �� �����

		System.out.print(max);

	}

}
