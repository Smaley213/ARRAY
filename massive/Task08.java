package by.htp.less.massive;

// ��� ������ �������������� �����, ����������� �������� N. 
// ����������, ������� � ��� �������������, ������������� � ������� ���������.

public class Task08 {
	
	public static void main(String[] args) {
		
		int[] a = {2, 4, -4, 3, -9, 3, -9, 6, 0, -3, 0, 4, 5, 0, -4}; // �������� ������� � ����������
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i = 0; i < a.length; i++) { // ������ ����� � ��� ������� 
			if (a[i] > 0) {
				count1++;
			}
			if (a[i] < 0) {
				count2++;
			}
			if (a[i] == 0) {
				count3++;
			}
		}
		System.out.println("������������� ���������: " + count1); // ����� ����������� � �������
		System.out.println("������������� ���������: " + count2);
		System.out.println("������ 0 ���������: " + count3);
	}

}
