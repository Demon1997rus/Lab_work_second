package lab_work_second;

import java.util.Scanner;

public class programSecondTwo {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int i = 0;
		int j = 0;
		int n = scanner.nextInt();

		do
		{
			if(i % 2 != 0)
			{
				j = 1;
				do {
					System.out.print(j + " ");
					j++;
				} while(j <= i+1);
			}
			else
			{
				j = n; 
				do {
					System.out.print(j-n+i+1 + " ");
					j--;
				} while(j+i >= n);
			}
			System.out.print("\n");
			i++;
		}while(i < n);
		scanner.close();
	}

}
