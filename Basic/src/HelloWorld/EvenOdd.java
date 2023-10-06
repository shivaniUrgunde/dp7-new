package HelloWorld;

public class EvenOdd {

	public static void main(String[] args) {
		
		int start,end;
		start=1;
		end=10;
		for( ;start<=end;start++)  //start 1  
		{
		if(start%2==0)
		{
		   System.out.println("even nub are"+start);
		}
		else
		{
			System.out.println("odd nub are"+start);
		}
		}
	}
		
}
