package by.htp.less.massive;

// ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������.

public class Task09 {
	
	public static void main(String[] args) {
		
		int[] a = {9, 3, 6, 2, 1, 2, 3, 8, 4, 9, 8, 10}; // �������� �������. ���������� ���������.
		int max = a[0];
		int countMax = 0;
		int min = a[0];
		int countMin = 0;
		
		for (int i = 0; i < a.length; i++) {  // ������ ����� ������� �������� �� ����� �������.
			if (a[i] > max) { // �������
				max = a[i];
				countMax = i;
			}
			if (a[i] < min) { // �������
				min = a[i];
				countMin = i;
			}
		}
		
		for (int i = 0; i < a.length; i++) {  // ������ ����� ������� �������� �� ����� �������.
			a[countMin] = max;
			a[countMax] = min;
			System.out.print(a[i]);  // ����� � ������� ������
		}
		
		

	}

}
