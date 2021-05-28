// TWIN PRIME CONJECTURE
import java.io.*;
class Main
{
	public static int Prime(int a)
	{
		int c=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if (c==2) 
		return 1;
		else
		return 0;
	}
	public static int consec(int a, int b)
	{
		if (b-a==2 || a-b ==2)
		return 1;
		else
		return 0;

	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,checkP1=0,checkP2=0,checkC=0,up=0,low=0,count=0;
		System.out.println("Enter the Lower Bound:");
		low=Integer.parseInt(br.readLine());
		System.out.println("Enter the Upper Bound:");
		up=Integer.parseInt(br.readLine());
		for(int i=low;i<=up;i++)
		{
			 num1=i;
		   num2=i+2;
		   checkC=consec(num1,num2);
		   if (checkC==1)
		    {
			   checkP1=Prime(num1);
			   checkP2=Prime(num2);
		    	if (checkP1==1 && checkP2==1)
			    {
						count++;
				   System.out.print(num1+",");
					 System.out.print(num2+"\n");
			    }
		    } 
		 }
		 System.out.println("TOTAL TWIN PRIMES BETWEEN "+low+" "+up+" ARE:"+ count);
	}
}

/*		System.out.println("Enter a number:");
		num1=Integer.parseInt(br.readLine());
		System.out.println("Enter a number:");
		num2=Integer.parseInt(br.readLine());
		checkC=consec(num1,num2);
		if (checkC==1)
		{
			checkP1=Prime(num1);
			checkP2=Prime(num2);
			if (checkP1==1 && checkP2==1)
			{
				System.out.println("TWIN PRIME");
			}
			else
			{
				System.out.println("CONSECUTIVE BUT NOT PRIME");
			}
		}
		else
		{
			System.out.println("NOT CONSECUTIVE");
		}
*/