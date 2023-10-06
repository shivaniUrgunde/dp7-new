package HelloWorld;

public class Kamchor {

	public static void main(String[] args) {
		int a=8,b=6,c=9,d=1;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("max a"+a);
				}
				else
				{
					System.out.println("max d"+d);
				}
			}
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println("max b"+b);	
			}
			else
			{
				System.out.println("max d"+d);
			}
		}
		else if(c>d)
		{
			System.out.println("max c"+c);
		}
		else
		{
			System.out.println("max d"+d);
		}

	}

}
