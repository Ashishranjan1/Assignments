import java.util.Scanner;

public class GradesAverage {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{	
		System.out.println("Enter the number of students:") ;
		int numStudents = sc.nextInt();
		
		double avg=0;
		int grades[]=new int[numStudents];
		
        for(int i=0;i<numStudents;i++)
        {
		System.out.println("Enter the grade for student "+ (i+1));
		grades[i]=sc.nextInt();
		while(grades[i]>100)
		{
			System.out.println("Invalid grade, try again...");
			grades[i]=sc.nextInt();
		}
		avg+=grades[i];
        }
	
		System.out.println("The average is: :"+avg/numStudents);
		
	}

}
