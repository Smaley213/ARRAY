package by.htp.less.massive;

// ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ��� ������� �i > i. 


public class Task10 {
	
	public static void main(String[] args) {
	
	int[] mas = new int[] { 7, -22, 0, 44, -2, 10, 20, 45, 125 }; //������� ������ �� ����������

	   System.out.println("�������� ������: "); // ����� �������� ������� �� �����

	for (int i = 0; i < mas.length; i++) {  //�������� ���� �� ���� ����� ��������

		System.out.print(mas[i] + " / "); // � ����� �� ����� �� ,��� ����� � �������
	}
	          System.out.println("\n����� ������� ������ ������ ������ � ������� ��� ����������� :");
	
	for (int i = 0; i < mas.length; i++) {  // ��� ���� �� ����� �������

		if (mas[i] > i) {   // ��������� �������

			System.out.print(mas[i] + " / ");   // � ����� �� �����
		}
	}

  }
}


