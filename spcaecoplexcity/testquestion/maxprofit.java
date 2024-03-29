package testquestion;



public class maxprofit {
	// creating the variable in the class 
	private String saller_name ; 
	private int[]arr ; 
	private int total_profit = Integer.MIN_VALUE ; 
	private int seller_priese ;
	 
	
	
	// creating the constructor with variable 
	
	public  maxprofit(String seller_name ) {
		 this.saller_name  = seller_name; 
	}
	public maxprofit(String seller_name , int total_profit ) {
	        this(seller_name) ; 
		 this.total_profit = total_profit ; 
			
	}
	public maxprofit (String seller_name , int total_profit , int seller_prise) {
		// calling the above constructor using the this keyword 
		this(seller_name , total_profit) ; 
		this.seller_priese = seller_prise ; 
	}
	// now again the creating the constructor 
	public maxprofit(String saller_name, int[] arr, int total_profit, int seller_priese) {
		
		this(saller_name , total_profit , seller_priese) ; 
		this.arr = arr;
		
	}
	// now creating the getter and setter function for the set value and get the value 
	public String getSaller_name() {
		return saller_name;
	}
	public void setSaller_name(String saller_name) {
		this.saller_name = saller_name;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getTotal_profit() {
		return total_profit;
	}
	public void setTotal_profit(int total_profit) {
		this.total_profit = total_profit;
	}
	public int getSeller_priese() {
		return seller_priese;
	}
	public void setSeller_priese(int seller_priese) {
		this.seller_priese = seller_priese;
	}
	// now creating the function of the profit 
	
	public void printseller_name() {
		System.out.println("the name of the saller is "+getSaller_name());
	}
	public void printTotal_profit() {
		System.out.println("the total value of the profit "+getTotal_profit());
	}
	
	// creating the shorting function using the quickshort
	
	
	private  int quick_Short_Sweping (int[]arr , int staritng_Index , int Last_index) {
		//frist taking the value of the poit element 
		int poietment = arr[staritng_Index] ; 
		int countvalue = 0 ; 
		// now find the right position of the poiet element 
		// using the for loop solved 
		for (int i = staritng_Index+1; i <= Last_index; i++) {
			if (poietment > arr[i]) {
				countvalue++ ; 
			}
		}
		
		// now perfor the sweping 
		int temp = arr[staritng_Index +  countvalue] ; 
		arr[staritng_Index +  countvalue] = poietment ; 
		arr[staritng_Index] =  temp ; 
		
		
		// now sweping bigger element in right side and smaller element and right side 
		int i = staritng_Index ; 
		int j = Last_index  ; 
		// now creating the while loop 
		while (i<j) {
			// now writing the condation 
			if (arr[i]< poietment) {
				i++ ; 
			}else if (arr[j]> poietment) {
				j-- ; 
			}else {
				// now sewping the 
				temp = arr[i] ; 
				arr[i] = arr[j] ; 
				arr[j] = temp ; 
				i++ ;
				j-- ; 
			}
		}
		
		return staritng_Index+countvalue ; 
		 
	}
	
	
	
	
	
	public  void  quickshort(int[]arr , int starting_index , int last_index ) {
		// using the recursion solved the shorting function 
		// fist write the base condition of the quick shoritng 
		
		if (starting_index >= last_index ) {
			return  ; 
		}
		
		// fist making the function sweping 
		int poitIndex = quick_Short_Sweping(arr, starting_index, last_index) ; 
		// calling the same function 
		
		quickshort(arr, starting_index, poitIndex-1);
		quickshort(arr, poitIndex+1, last_index);
		
		
		
	}
	
	
	

	// now getter and setter function for the quickshort
	
	public void quick() {
		quickshort(getArr(), 0, this.arr.length-1);
	}
	
	
	
	
	public void printarray() throws Exception  {
		// using the for loop for the printing the array 
	
		if (this.arr == null) {
		Exception NullPointerException = null; // using the local variable to solved this problem 
		
		throw NullPointerException ; // also you can write the variable int the global  at the  top 
		
		}
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	// creating the function of the max_profit 
	public  void maxprofit()  {
		// using the while loop 
		int i = 0 ; 
		
		while (i<this.arr.length) {
			this.total_profit = Math.max(this.total_profit, this.arr[i]*(this.arr.length - i)) ;
		//	System.out.println(this.total_profit+" "+ this.arr[i]+" " + this.arr.length +" " +i +" "+ this.arr[i]*(this.arr.length - i));
		//	System.out.println(getTotal_profit());
			
			
			if (this.total_profit == this.arr[i]*(this.arr.length - i)) {
				this.seller_priese = this.arr[i] ; 
			}
				i++ ; 	
		}
		
	}
	
	
	// creating the function printing overall value for the printing value 
	
	public void printOverAllValue() {
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("PRINTING DETEALI");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BUYER BUDEGET"); 
		// CALLING THE FUBNCTION OF THE PRINTING 
		try {
			printarray();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" you given the null input ");
		}
		System.out.println("SELLER NAME : "+this.saller_name+"  "+"SELLER PREISE :"+this.seller_priese+" "+"TOTAL PROFIT :- "+this.total_profit);
	}

}
