package by.htp.less.massive;

// ���� ������������������ ����������� ����� �1 , �2 ,..., ��. 
// ������� ������ �� ������ ����� ���� ������������������.
// ���� ����� ����� ���, �� ������� ��������� �� ���� �����.

public class Task05 {
	
	public static void main(String[] args) {
		
		int[] a = {23, 4, 4, 3, 5, 7, 32, 1, 7}; //�������� ������� �� ���������� � ����� �������� ����������
		int count = 0;
		
		for (int i = 0; i < a.length; i++) { // ������ ����� �� ����� ������� ����������
			
			if (a[i] % 2 == 0) {  // ������� 
				count = count + 1;
			}
		}
		if (count == 0) {    // �������
			
			System.out.println("������ ����� � ������� ���"); 
		}
		int[] index = new int [count];  //�������� 
		int j = 0;
		
		for (int i = 0; i < a.length; i++) {  // ������ ����� �� ����� ������� ����������
			
			if (a[i] % 2 == 0) {   // �������
				index[j] = i;
				
				System.out.println(index[j]); // ����� �������� ������ � �������
				j++;
			}
		}
	}

}
