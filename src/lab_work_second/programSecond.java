package lab_work_second;

import java.util.Scanner;

public class programSecond {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int i = 0;
		int j = 0;
		int n = scanner.nextInt();

		while(i < n)
		{
			if(i % 2 != 0)
			{
				j = n;
				while(j - i <= n)
				{
					System.out.print(j - i + " ");
					j++;
				}
			}
			else
			{
				j = n;
				while(j >= n - i)
				{
					System.out.print(j + " ");
					j--;
				}
			}
			System.out.print("\n");
			i++;
		}
		scanner.close();
	}

}
