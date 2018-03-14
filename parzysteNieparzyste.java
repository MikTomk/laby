import java.util.Scanner;

public class parzysteNieparzyste {

	public static void main(String[] args) {
		int liczba = 0;
		int zakres;
		@SuppressWarnings("resource")
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj zakres");
		zakres = odczyt.nextInt();
		while(liczba <= zakres)
		{
			if(liczba % 2 == 0)
			{
				System.out.println("Liczba " + liczba + " jest parzysta");
				liczba++;
			}
			else
			{
				System.out.println("Liczba " + liczba + " jest nieparzysta");
				liczba++;
			}
		}
	}
}
