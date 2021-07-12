import java.util.Scanner;
public class lengthcal {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation programme");
				int X1,X2,Y1,Y2;
				double length;
				System.out.println("enter X1 value ");
				System.out.println("enter X2 value ");
				System.out.println("enter Y1 value ");
				System.out.println("enter Y2 value ");
				Scanner ref = new Scanner(System.in);
				X1=ref.nextInt();
				X2=ref.nextInt();
				Y1=ref.nextInt();
				Y2=ref.nextInt();
				length=Math.sqrt(((X2-X1)*(X2-X1))+((Y2-Y1)*(Y2-Y1)));
				System.out.println("LENGTH OF LINE "+length);
		
		
		
	}

}
