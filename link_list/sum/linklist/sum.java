package sum.linklist;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method check = new Method() ; 
		
		ListNode insurt  = check.insert() ; 
		check.print(insurt);
		System.out.println("check");
		ListNode re = check.revesing(insurt) ; 
		check.print(re);
		
	}

}
