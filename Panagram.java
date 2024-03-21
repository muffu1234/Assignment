import java.util.Scanner;
public class Panagram {
	
		public static void allLetter(String str)
		{
			
			str = str.toLowerCase();
			boolean allLetterPresent = true;

			for (char ch = 'a'; ch <= 'z'; ch++) {

				if (!str.contains(String.valueOf(ch))) {
					allLetterPresent = false;
					break;
				}
			}

			if (allLetterPresent)
				System.out.println("Given string is Pangram");
			else
				System.out.println("Given string is Pangram");
		}

		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter the input");
	    	String str=sc.nextLine();
			allLetter(str);
		}
}

