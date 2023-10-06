package HelloWorld;

public class Array {

	public static void main(String[] args) {
		int a[]= {15,25,5,20};
		int b[]= {};
		       //0  1   2  3
		//char c[]= {'a','b','#'};
		//for(int i=(a.length)-1;i>=0;i--)
		int e=a.length;
		System.out.println(e);
		int d=(a.length-1);
		System.out.println(d);	
	   for(int i=0;i<=(a.length-1);i++)
		{
		   for(int j=1;j<((a.length-1)-1);j++)
		   {
			if(a[i]>a[j])
			{
			 b[i]=a[i];	
			 a[i]=a[j];
			 a[j]=b[i];
			 }
		   }
		}
	}

}
