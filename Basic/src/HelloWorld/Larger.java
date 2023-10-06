package HelloWorld;

public class Larger {

	public static void main(String[] args) {
		
		int a,b,c,d;
		a=1000;
		b=4000;
		c=4000;
		d=3000;
		
		System.out.println("START");
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is larger ");
					System.out.println(a);
				}
				else
				{
					System.out.println("d is larger");
					System.out.println(d);
				}
			}
			else if(c>d)
			{
				System.out.println("c is larger");
				System.out.println(c);
			}
			else
			{
				System.out.println("d is larger");
				System.out.println(d);
			}
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println("b is greater");
				System.out.println(b);
			}
			else
			{
				System.out.println("d is larger");
				System.out.println(d);
			}
		}
		else if(c>d)
		{
			System.out.println("c is larger");
			System.out.println(c);
		}
		else
		{
			System.out.println("d is larger");
			System.out.println(d);
		}
		
	}

}
