import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collect {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Noida");//
	      city.add("Pune");    	   
	      System.out.println(city);  
		
		//Creating Vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector<Integer>();
	      vec.addElement(34); 
	      vec.addElement(56); 
	      System.out.println(vec);
		
		//creating LinkedList
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Kavi");  
	      names.add("Kani");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating HashSet
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(30);  
	       set.add(50);
	       set.add(90);
	       System.out.println(set);
	       
	       //creating LinkedHashSet
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(45);  
	       set2.add(67);  
	       set2.add(89);
	       set2.add(170);	       
	       System.out.println(set2);
	      	} 
	      }  

	}

