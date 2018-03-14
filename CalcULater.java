import java.util.Scanner;

public class CalcULater {

	public static void main(String[] args)
	{
	double liczba_a;
	double liczba_b;
	@SuppressWarnings("resource")
	Scanner odczyt = new Scanner(System.in);
	System.out.println("Podaj liczbe a");
	liczba_a = odczyt.nextDouble();
	System.out.println("Podaj liczbe b");
	liczba_b = odczyt.nextDouble();
	System.out.println(liczba_a+liczba_b);
	System.out.println(liczba_a-liczba_b);
	System.out.println(liczba_a*liczba_b);
	System.out.println(liczba_a/liczba_b);
	}

}
