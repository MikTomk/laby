import java.util.Scanner;

public class rokPrzestepczy {

	public static void main(String[] args) {
		int rok;
		@SuppressWarnings("resource")
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj rok");
		rok = odczyt.nextInt();
		if(rok % 400 == 0)
		{
			System.out.println("Rok "+ rok + " jest rokiem przestepczym");
		}
		else if (rok % 4 != 0)
		{
			System.out.println("Rok "+ rok + " nie jest rokiem przestepczym");
		}
		else if (rok % 100 == 0)
		{
			System.out.println("Rok "+ rok + " nie jest rokiem przestepczym");
		}
		else
		{
			System.out.println("Rok "+ rok + " jest rokiem przestepczym");
		}
	}
}
