package com.design.pattern.factory.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
public static void main(String[] args) throws IOException {
	GetPlanFactory getPlanFactory= new GetPlanFactory();
    System.out.print("Enter the name of plan for which the bill will be generated: ");  
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String planName= bufferedReader.readLine();
    
    System.out.print("Enter the number of units for bill will be calculated: ");  
    int unites= Integer.parseInt(planName);
    
    
    Plan plan= getPlanFactory.getPlan(planName);
    //call getRate() method and calculateBill()method of DomesticPaln.  
    System.out.print("Bill amount for "+planName+" of  "+unites+" units is: ");  
    
    plan.calculateBill(unites);
}
}
