package by.htp.less.massive;

import java.util.Random;

//���������� ���������� ��������� ������������������ ����������� �����, ������� ����� � � ����������� � ���������� �� L �� N.


public class Task13 {
	
	public static void main(String[] args) {

		int k;          //������� ���������� �� ����������
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

		Random rand = new Random();    // �������� ������� �����

		for (int i = 0; i < mas.length; i++) {  //��� 1 ���� �������� �� ����� �������

			mas[i] = rand.nextInt(10);      // ������������ �������� 
		}

		System.out.println("�������� ������: ");

		for (int i = 0; i < mas.length; i++) {   //���2 ���� �������� �� ����� �������

			System.out.print(mas[i] + " / ");
		}
		
		for(int i = 0; i < mas.length; i++) {   //��� 3 ���� �������� �� ����� �������
			
			if(mas[i] < n && mas[i] > l) {     //��� ������� �����
				
				if(mas[i] % m == 0) {
					
					count++;
				}
			}
		}
		
		System.out.println("\n���������� ��������� ������������������ ����������� �����, ������� ����� " + m + " � \r\n" + 
				" // ����������� � ���������� �� " + l + " �� " + n + " ����� " + count);
	}


}
