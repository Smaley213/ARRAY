package by.htp.less.massive;

//  ���� ������������������ ����� �1 ,�2 ,..., �n. 
// ������� ���������� ����� �������� ���, ���������� ��� ��� �����.


public class Task06 {
	
	public static void main(String[] args) {
		
		int[] a = {2, 3, 6, 2, 9, 2, 8}; // �������� ����������
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {  // ������ ����� � �������
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		int sum = max - min;
		
		System.out.println("���������� ����� �������� ��� = " + sum); // ����� � �������
	}

}
