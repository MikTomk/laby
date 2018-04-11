package javaKolo;

import java.util.Scanner;

public class slupki 
{
	public static void main(String[] args) 
	{
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj wysokosc pierwszego slupka");
		int wysokosc_a = odczyt.nextInt();
		System.out.println("Podaj wysokosc drugiego slupka");
		int wysokosc_b = odczyt.nextInt();
		if(wysokosc_a > 20 || wysokosc_b > 20)
		{
			System.out.println("Wysokosc musi byc mniejsza od 20");
			return;
		}
		if(wysokosc_a == 0 || wysokosc_b == 0)
		{
			System.out.println("Wysokosc musi byc wieksza od 0");
			return;
		}
		int wysokosc_c = (int)((wysokosc_a+wysokosc_b)/2);
		int max;
		if(wysokosc_a > wysokosc_b)
		{
			max = wysokosc_a;
		}
		else
		{
			max = wysokosc_b;
		}
		System.out.println();
		rysuj(wysokosc_a, max);
		rysuj(wysokosc_c, max);
		rysuj(wysokosc_b, max);
		for (int i = 0; i < max + 1; i++)
		{
			System.out.print(" ");
		}
		System.out.print("|");
	}

	private static void rysuj(int wysokosc, int max)
	{
		for(int i = 0; i < max + 1; i++)
		{
			System.out.print(" ");
		}
		System.out.print("|\n");
		if(wysokosc == max)
		{
			System.out.print("+");
			for(int i = 0; i < wysokosc; i++)
			{
				System.out.print("-");
			}	
		}
		else
		{
			for(int i = 0; i < max - wysokosc; i++)
			{
				System.out.print(" ");
			}
			System.out.print("+");
			for(int i = 0; i < wysokosc; i++)
			{
				System.out.print("-");
			}
		}
		System.out.print("+\n");
		if (wysokosc == max)
		{
			System.out.print("|");
			for(int i = 0; i < wysokosc; i++)
			{
				System.out.print(" ");
			}
		}
		else
		{
			for(int i = 0; i < max - wysokosc; i++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			for(int i = 0; i < wysokosc; i++)
			{
				System.out.print(" ");
			}
		}
		System.out.print("|\n");	
		if(wysokosc == max)
		{
			System.out.print("+");
			for(int i = 0; i < wysokosc; i++)
			{
				System.out.print("-");
			}	
		}
		else
		{
			for(int i = 0; i < max - wysokosc; i++)
			{
				System.out.print(" ");
			}
			System.out.print("+");
			for(int i = 0; i < wysokosc; i++)
			{
				System.out.print("-");
			}	
		}
		System.out.print("+\n");
	}
}
