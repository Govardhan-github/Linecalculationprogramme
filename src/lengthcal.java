import java.util.Scanner;
public class lengthcal {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation programme");
				int X1,X2,Y1,Y2,A1,A2,B1,B2;
				double length1,length2;
				System.out.println("enter X1 value ");
				System.out.println("enter X2 value ");
				System.out.println("enter Y1 value ");
				System.out.println("enter Y2 value ");
				System.out.println("enter A1 value ");
				System.out.println("enter A2 value ");
				System.out.println("enter B1 value ");
				System.out.println("enter B2 value ");
				Scanner ref = new Scanner(System.in);
				X1=ref.nextInt();
				X2=ref.nextInt();
				Y1=ref.nextInt();
				Y2=ref.nextInt();
				A1=ref.nextInt();
				A2=ref.nextInt();
				B1=ref.nextInt();
				B2=ref.nextInt();
				length1=Math.sqrt(((X2-X1)*(X2-X1))+((Y2-Y1)*(Y2-Y1)));
				length2=Math.sqrt(((A2-A1)*(A2-A1))+((B2-B1)*(B2-B1)));
				System.out.println("LENGTH OF LINE1 "+length1);
				System.out.println("LENGTH OF LINE2 "+length2);
				
		
				if (length1 == length2)
					System.out.println("Two lines are equal");
				else if (length1 > length2)
					System.out.println("The LINE1 is greaterthan LINE2");
				else if (length1 < length2)
					System.out.println("The LINE1 is lessthan LINE2");
				else
					System.out.println("The two lines are not equal");
	
	}	

}
