package HelloWorld;

public class Mock {
	
	public void add()
	{
		System.out.println("nonstatic");
	}
	public static void add1()
	{
		Mock m= new Mock();
		m.add();
		System.out.println("static");
	}

	public static void main(String[] args) {
		
		
	}

}
