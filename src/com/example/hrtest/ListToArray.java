package com.example.hrtest;
 
import java.util.LinkedList; 
import java.util.List; 

public class ListToArray
	{
	
		public static void main(String[] args) 
	    { 
	  
	         
	        List<String> list = new LinkedList<String>(); 
	  
	        list.add("Strike"); 
	        list.add("while"); 
	        list.add("the"); 
	        list.add("Iron"); 
	        list.add("is");
	        list.add("hot");
	  
	       
	        String[] arr = new String[list.size()]; 
	  
	        
	        for (int i = 0; i < list.size(); i++) 
	            arr[i] = list.get(i); 
	  
	       
	        for (String x : arr) 
	            System.out.print(x + " "); 
	    } 
	}
		

	


