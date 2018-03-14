import java.util.Random;


public class Hejka 
{

	public static void main(String[] args) 
	{
		Random r = new Random(); 
		int[] tab = new int[5];
		for(int i = 0; i<5; i++)
		{
			tab[i] = r.nextInt(300)+1;
			System.out.println(tab[i]);
		}
		
	}

}
