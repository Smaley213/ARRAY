package by.htp.less.massive;

import java.util.Random;

//  ���� ������������������ �������������� ����� a1,a2,...,an . 
//  ������� �� �� ��������, ������� ����������� ������� [�, d]. 


public class Task15 {
	
	
public static void main(String[] args) { 
		
		int n;    // �������� ���������� � �� �������� ,����
		n = 20;
		
		int c;
		c = 2;
		
		int d;
		d = 3;

		int[] mas = new int[n];  // ������������� ����������

		Random rand = new Random();  // ������� ��������� ����������

		for (int i = 0; i < mas.length; i++) {    //��� 1 ���� �������� �� ����� �������

			mas[i] = rand.nextInt(10);
		}

		System.out.println("�������� ������: ");

		for (int i = 0; i < mas.length; i++) {  //��� 2 ���� �������� �� ����� �������

			System.out.print(mas[i] + " / ");
		}
		
		System.out.println("\n����� ��������������� ������� :");
		
		for(int i = 0; i < mas.length; i++) {  //��� 3 ���� �������� �� ����� �������
			
			if(mas[i] <= d && mas[i] >= c) {  // ������� �����
				
				System.out.print(mas[i] + " / " );   // ����� �� �����
			}
		}

	}


}
