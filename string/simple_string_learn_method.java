import java.util.Iterator;
import java.util.Scanner;

public class simple_string_learn_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// make the scanner function for the learning string 
		// fist make the 
		Scanner input = new Scanner(System.in);
		// something is the print to the user for the some massage 
		System.out.println(" enter the string chack the uses the all of the method ");
		String str1 = input.next();
		// find the number of the string and find the contain of the string 
		// find the compare of the string 
		//using the for loop print all the string
		// also string are the storing in the form of the char 
		System.out.println("enter the single char for the priting the loop 'Y'  ");
		char ch1 = input.next().charAt(0);
		// we can also the test of the char upper case and lower case 
		char ch =  Character.toUpperCase(ch1);
		  if (ch == 'Y') {
			
		
		
		for (int i = 0; i < str1.length() ; i++) {
			System.out.print(str1.charAt(i));
		}
		  }
		  // NOW AGAIN testing the the input.next method that are the use in the 
		  System.out.println(" chack the string the [resent any world or not ");
		  // this is the  given result in the form of the boolean
		  // take the input form the user for the result print in the form of the boolean 
		  String str3 = input.next();
		  System.out.println(str1.contains(str3));
		  // now check  the compair between the two string 
		  System.out.println(str1.compareTo(str3));
		  // find the length  of the string 
		  String str5 = input.nextLine();
		  // printing the string and also printing the 
		  System.out.println(str5);
		  // now printing the length 
		  System.out.println(str5.length());
		  
		  // check the print of the blank of the string 
		  String lo = " shivam yellow am is the my name is khan";
		  String lc = " " ; 
		  // fist find the length of the both string so 
		  System.out.println(lo.length());
		  System.out.println(lc.length());
		  if (lo.equals(lc)) {
			System.out.println("this is the equal ");
		}
		  // check the character length 
		  // check the printing of the substring 
		  String shiva = "shi";
		  System.out.println(shiva.subSequence(0,1));
		  System.out.println(shiva.length());
		  for (int i = 0; i < shiva.length(); i++) {
			for (int j = i+1; j <= shiva.length(); j++) {
				System.out.println(shiva.substring(i, j));
			}
				
			}
		}
		  
		   

	}


