package Implemantation.hasmap;

import java.util.ArrayList;

public class map<T ,V>{
	
  // creating the arry list for the taking the arry 
	// now creating the arry list 
	ArrayList<mapnode<T, V> >bucket ; 
	// creating the count 
	 int count ; 
	 int numbacket ; 
	 
	 // now creating the constrocter 
	 public map() {
		// creating the new 
		bucket = new ArrayList<>() ; 
		// now creating the the size of the bucket 
		numbacket = 20 ; 
		// creating the for loop inisalization of the all is the null 
		for (int i = 0; i < numbacket; i++) {
			// now inisilation the null all the bucket 
			bucket.add(null) ; 
		}
	}
	 
	 
	 //  creating the insert function 
	 public  void insret(T key  , V value) {
		 
		 // fist getting the bucket index 
		 int bucketIndex = getbucketIndex(key) ;
		 // after the finding the index check it is or null or not 
		 // finding the head node in the bucket 
		 mapnode<T, V>head = bucket.get(bucketIndex) ; 
		 // now creating the loop if the not null head then update the value in the hasnode 
		 while (head != null) {
			// now finding the proper key for the update the value 
			 if (key.equals(head.key)) {
				// now updating the value 
				 head.value = value ;
				 
				 // after the update new we are the return 
				 
				 return  ;
			}
			 // for the continue loop we are the using the head next in the next loop 
			 head = head.next ; 
		}
		 
		 
		 
		 head = bucket.get(bucketIndex) ; 
		 // if the value is null then updating the vlaue 
		 
		 mapnode<T, V>newNode = new mapnode<>(key, value) ; 
		 newNode.next = head ; 
		 // for the making the heading using the bucket set value 
		 bucket.set(bucketIndex, newNode);
		 // now count for the finding the number of element in the link list 
		 count++ ; 
		 
		 // creating the finding the lode factor 
		 // formula of the lode factor 
		 // number of the hastable divide 
		 double lode_factor = (1.0*count)/numbacket ; 
		 // creating the if condition 
		 if (lode_factor > 0.7) {
			// calling the rehasing function 
			 rehas() ; 
		}
		 
		 
	 }


	private void rehas() {
		// creating the arry list for the rebashing 
		// bucket copy address in the temp 
		ArrayList<mapnode<T, V>>temp  = bucket ; 
		bucket = new ArrayList<>() ; 
		// now creating all the element in the bucket 
		// creating the for loop for the elenment
		
		for (int i = 0; i < 2*numbacket; i++) {
			bucket.add(null) ; 
		}
		count = 0 ; 
		numbacket = numbacket*2 ; 
		for (int i = 0; i < temp.size(); i++) {
			
			
		mapnode<T, V>head = temp.get(i) ; 
		// crating the condition if not null 
		 while (head != null) {
			T key = head.key ; 
			V value = head.value ; 
			insret(key, value);
			head = head.next ; 
		}
		}
		
	}


	private int getbucketIndex(T key) {
		
		// key are changing to hasmap and then creating the module for the return 
		int index = key.hashCode(); 
		int finalIndex = index%numbacket ; 
		return finalIndex ; 
		
		
	
	}
	
	// creating the function of the size 
	public int size() {
		return count ; 
	}
	 
	
	// now creating the function of the get value 
	public V getValue(T key) {
		// fist finding the value if the bucket index 
		int bucketindex = getbucketIndex(key);
		// now finding the head 
		mapnode<T, V>head = bucket.get(bucketindex) ; 
		// now finding it is the null or not if not null then the trevencing the value 
		// if null then the return the value 
		while (head != null) {
			
			// now creating the condition if the key are the same 
			if (key.equals(head.key)) {
				// now the value return the value 
				return head.value ; 
			}
			// if can not find the key 
			head = head.next ; 
			
		}
		return null ; 
	}
	
	// now creating the function of the size 
	public V removekey(T key) {
		
	// fist finding the index 
		int bucketIndex = getbucketIndex(key) ; 
		mapnode<T, V>head = bucket.get(bucketIndex) ; 
		// now creating the priveus 
		mapnode<T, V>privious = null ; 
		
		// now check the head or null or not if not null then check key are not present at fist 
		// now travensing all the node 
		while (head != null) {
			
			if (head.key.equals(key)) {
				  
				if (privious != null) {
					// now rprivious linking the head next 
					privious.next = head.next ; 
				}else {
					// it means node are the present at the frist of the link list 
					bucket.set(bucketIndex, head.next) ; 
				}
				
				// now privious should be head 
				count-- ; 
				return head.value ; 
				
			}
			privious = head ; 
			head = head.next ; 
			
		}
		return null ; 
		
	}
	
}
