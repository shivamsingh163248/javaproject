import learn_recursion_II.string_replacement;

public class test {
	
	public static  String reversing(String world) {
		
		// crating the new string 
		String a ="" ;
		
		for (int i = world.length()-1; i >= 0  ; i--) {
			 a += world.charAt(i);
		}
		
		return a ; 
	}
	
	//
	
	// reversing using recurrsion 
public static  String reversings(String world) {
		
		// crating the new string 
		if (world.length() == 0 ) {
			String a = "" ; 
			return a ; 
		}
		
		// calling the same functuin 
		
		String result = reversings(world.substring(1)) ; 
		            result += world.charAt(0) ; 
		            return result ; 
	}
	
	
 public static void main(String[] args) {
		String c = "s" ; 
		String d = "d" ; 
		System.out.println(c+d) ;
		
		System.out.println(reversing("shivam"));
		System.out.println(reversings("itisha"));
		System.out.println(" "+c);
		System.out.println('c'+"d ");
		System.out.println( '\u0022'+"shivam"+'\u0022');
		
		
		int gau[][] = new int[1][0] ;
		
		// creating the lenght of the array
		System.out.println(gau.length);
		System.out.println(gau[0].length);
		
//		 gau[0] = new int[5] ; 
//		 System.out.println(gau[0].length);
//	
		 
		 // now printing the length 
		 // creating the loop 
		 for (int i = 0; i < gau.length; i++) {
			for (int j = 0; j < gau[i].length; j++) {
				System.out.println("check"+gau[i][j]);
			}
		}
			 
			
			 
		}
				 
		 
		
		
		
		
}


