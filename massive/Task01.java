package by.htp.less.massive;

// � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.

public class Task01 {
	
	public static void main(String[] args) {
		
		int n = 10;
		int k = 2;
		int sum = 0;
		
		double[] a = new double[n];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = 1+Math.random()*10;
			
			if ((int)a[i] % k == 0) {
				sum += (int)a[i];
				
				System.out.println(sum);
			}
			
		}

	}
}
