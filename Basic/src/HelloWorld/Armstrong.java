package HelloWorld;

public class Armstrong {

	public static void main(String[] args) {
		int a=371; //3^3+7^3+1^3=orignal nub
		int temp,b=0,d=0,e;
		temp=a; //temp=371
		e=a;
		while(a!=0)
		{
			//int c=a%10;  //pickup last digit  c=3
			//b+=c*c*c;    //b=1+343=344+27=371
			a/=10;  //to remove last digit a=0
			d++;
		}
		
		System.out.println(d);
		/*
       if(temp==b)
       {
    	   System.out.println("numb is armstrong numb");
       }
       else
       {
    	   System.out.println("numb is not armstrong numb");
       }
       */
       
       
       for(int i=0;i<3;i++)
		{
			int c=e%10;
			b+=Math.pow(c, d);
			e/=10;
		}
      if(temp==b)
      {
   	   System.out.println("numb is armstrong numb");
      }
      else
      {
   	   System.out.println("numb is not armstrong numb");
      }
	
	}

}
