package by.htp.less.massive;

// � ������������� ������������������ ���� ������� ��������. ������� ������ �� ������� ���� ���������.

public class Task02 {
	public static void main(String[]args) {
		
		
		int[] mas = new int []{4 ,2, 9, 0, 5, 1 ,0 , 7, 5};  // �������� �������
		int count;
		count = 0;

   for (int i = 0; i < mas.length; i++) {  // ���� ������� �� ������� � ���� �������
			if ( mas[i] == 0) {
				count = count + 1;
			}
		}
		
		
		int[] index = new int [count];
		
         int j = 0;
         
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				index[j] = i;
              j++;
			}
		}
   
   
		for (int i = 0; i < index.length; i++) {
			
		System.out.println(index[i]);
		}
  }

}
