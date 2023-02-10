package com.lab4assignementfloorbuilding.services;

import java.util.Scanner;

public class FloorConstructionCalculation {

	public static void main(String[] args) {
		
		Scanner floor = new Scanner(System.in);   
        System.out.println("Enter the total number floors in the building : "); 
	       int nFloor = floor.nextInt(); 
	       int day[] = new int[nFloor+1]; 
	        
	       		
		        for(int i=1;i<=nFloor;i++)
		        { 
		            System.out.println("Enter the floor size given on day : "+i);             
		            int size = floor.nextInt(); 
		            day[size]=i; 
		        }
		        
	        int temp = nFloor;  
	        int flag;        
	        System.out.println("The order of construction is as follows ");
	        for(int i=1;i<=nFloor;i++)
	        {
	            flag=0;             
	            System.out.println("Day "+i+" :"); 

			// Arranging the user data for the floor with the highest size
	            while( temp >=1 && day[temp] <= i)
	            {
	                flag = 1; 
	                System.out.print(temp +" ");
	                temp--;             
	            }
	            if(flag==1)
	                    System.out.println();             
	        }     
        
    } 
    
}

