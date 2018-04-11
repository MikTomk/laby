package javaKolo;

import java.util.Random;
import java.util.Scanner;

public class ruchyAkcje {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double konto = 0;
		double iloscAkcji = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj kwote wplacana co miesiac: ");
		double kwota = in.nextDouble();
		System.out.print("Podaj ilosc lat oszczedzania: ");
		int okres = in.nextInt()*12;
		if(kwota < 0 || okres < 0)
		{
			System.out.println("Wartosci ujemne! Koniec programu!");
		}
		else
		{
			String max = "Aktualna wartosc konta akcji";
			int lmax = max.length();
			System.out.println(lmax);
			wypisz();
			obliczanie(iloscAkcji, kwota, okres, lmax);
		}
	}

	private static void wypisz() {
		String max = "Aktualna wartosc konta akcji";
		int lmax = max.length();
		String miesiac = "Miesiac";
		String cena = "Cena";
		String ilosck = "Ilosc kupionych akcji";
		String ogolnail = "Ogólna ilosc kupionych akcji";
		System.out.print("|"+miesiac);
		for(int i = 0; i<lmax-miesiac.length();i++) 
		{
			System.out.print(" ");
		}
		System.out.print("|"+cena);
		for(int i = 0; i<lmax-cena.length();i++) 
		{
			System.out.print(" ");
		}
		System.out.print("|"+ilosck);
		for(int i = 0; i<lmax-ilosck.length();i++) 
		{
			System.out.print(" ");
		}
		System.out.print("|"+ogolnail);
		for(int i = 0; i<lmax-ogolnail.length();i++) 
		{
			System.out.print(" ");
		}
		System.out.print("|"+max+"|\n");
	}

	private static void obliczanie(double iloscAkcji, double kwota, int okres, int max) {
		for(int i = 1; i<=okres; i++)
		{
			Random rand = new Random(); 
			double cenaAkcji = 80 + (20) * rand.nextDouble();
			iloscAkcji += kwota/cenaAkcji;
			double AktualnaKwota = iloscAkcji * cenaAkcji;
			System.out.printf("|%d", i);
			for(int j = 0; j<max-String.valueOf(i).length();j++) 
			{
				System.out.print(" ");
			}
			System.out.printf("|%.2f zl", cenaAkcji);
			for(int j = 0; j<max-String.valueOf(cenaAkcji).length()+9;j++) 
			{
				System.out.print(" ");
			}
			System.out.printf("|%.2f j", kwota/cenaAkcji);
			for(int j = 0; j<max-String.valueOf(kwota/cenaAkcji).length()+9;j++) 
			{
				System.out.print(" ");
			}
			System.out.printf("|%.2f j", iloscAkcji);
			for(int j = 0; j<max-String.valueOf(iloscAkcji).length()+9;j++) 
			{
				System.out.print(" ");
			}
			System.out.printf("|%.2f zl\n", AktualnaKwota);
		}
	}

}
