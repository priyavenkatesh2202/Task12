package com.example.hrtest;
import java.util.*;

public class TreeMapOutput {

	public static void main(String[] args) {
		
		
		Map<String, String> treemap =  
	               new TreeMap<String, String>(Collections.reverseOrder()); 
	  
	        
	        treemap.put("1", "Better"); 
	        treemap.put("2", "late"); 
	        treemap.put("3", "than"); 
	        treemap.put("4", "never"); 
	         
	  
	        Set set = treemap.entrySet(); 
	        Iterator i = set.iterator(); 
	  
	        
	        while (i.hasNext()) { 
	            Map.Entry me = (Map.Entry)i.next(); 
	            System.out.print(me.getKey() + ": "); 
	            System.out.println(me.getValue()); 
	        } 
	    } 
		

	}


