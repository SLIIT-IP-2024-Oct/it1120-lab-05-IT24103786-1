import java.util.Scanner;

	public class IT24103786Lab5Q2{
		public static void main (String []args){
		
		Scanner Input = new Scanner(System.in);
			System.out.print("Enter the number of new menbers introduced : ");
			int no = Input.nextInt();
			
			if (no<0) {
				System.out.print("Input must be number 0 or greatr");
			return;}
				
			switch (no){
			case 0 :
				System.out.print("No prize");
				break;
			case 1 :
				System.out.print("Pen");
				break;	
			case 2 :
				System.out.print("Umbrella");
				break;	
			case 3 :
				System.out.print("Bag");
				break;
			case 4 :
				System.out.print("Travelling Chair");
				break;
			default :
				System.out.print("Headphone");
				}
 		}}