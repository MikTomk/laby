
public class PiramidaPionowa 
{
	public static void main(String[] args) 
	{
		int wysokosc = 7;
		for (int y = (wysokosc - 1); y >= 0; y--)
		{
			for (int x = 1; x < (wysokosc * 2); x++)
			{
				if(y < x && x < (wysokosc * 2 - y))
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
