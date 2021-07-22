import java.util.Scanner;
public class lengthcal {
	/*
	 *Asking User To Calculate The Lengths Of Two Lines
	 *Enter Values Of Point To Calculate The Lengths 
	 *Using Java Equals Method And CompareTo Method
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation programme");
		int X1,X2,Y1,Y2,A1,A2,B1,B2;
		double length1,length2;
		//Ask User Input Values Of Line1 And Line2		
		Scanner ref = new Scanner(System.in);
		System.out.println("enter X1 value ");
		X1=ref.nextInt();
		System.out.println("enter X2 value ");
		X2=ref.nextInt();
		System.out.println("enter Y1 value ");
		Y1=ref.nextInt();
		System.out.println("enter Y2 value ");
		Y2=ref.nextInt();
		System.out.println("enter A1 value ");
		A1=ref.nextInt();
		System.out.println("enter A2 value ");
		A2=ref.nextInt();
		System.out.println("enter B1 value ");
		B1=ref.nextInt();
		System.out.println("enter B2 value ");
		B2=ref.nextInt();
		//Calculation length of line 1
		length1=Math.sqrt(((X2-X1)*(X2-X1))+((Y2-Y1)*(Y2-Y1)));
		System.out.println("LENGTH OF LINE1 "+length1);
		//Calculation length of line2
		length2=Math.sqrt(((A2-A1)*(A2-A1))+((B2-B1)*(B2-B1)));
		System.out.println("LENGTH OF LINE2 "+length2);
		//Converting Double to String
		String str = String.valueOf(length1);//Converting Length1 To String Str
		String str2 = String.valueOf(length2);//Converting Length2 To String Str2
		//Checking Equals Method
		if(str.equals(str2))
		System.out.println("Two lines are equal");
		else
		System.out.println("Two Lines Are Not Equal");
		//Checking CompareTo Method
		System.out.println(str.compareTo(str2));
		if(str.compareTo(str2)<0)//Comparing Str and Str2
		System.out.println("The LINE1 is greaterthan LINE2");
		else if (str.compareTo(str2)>0)
		System.out.println("The LINE2 is greaterthan LINE1");
	}	
}
