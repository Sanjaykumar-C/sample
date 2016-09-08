package logic;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("nagative");
		}
	}
}
