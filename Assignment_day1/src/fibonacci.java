
public class fibonacci {

	public static void main(String[] args) {
		
		int fibb[]=new int[20];
		fibb[0]=1;
		fibb[1]=1;
	System.out.println("The first 20 Fibonacci numbers are :");
	for(int i=2;i<20;i++)
	{
		fibb[i]=fibb[i-1]+fibb[i-2];
		
	}
	double sum=0;
	for(int i=0;i<20;i++)
	{   sum+=fibb[i];
		System.out.print(fibb[i] +" ");
	}
	System.out.println();
	System.out.print("The average is " + sum/20);
	
	}

}
