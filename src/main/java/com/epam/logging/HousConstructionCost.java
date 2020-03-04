package com.epam.logging;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HousConstructionCost {
private static Logger LOGGER = LogManager.getLogger(App.class);
	public static void estimation() {
    	Scanner sc = new Scanner(System.in);
    	LOGGER.info("Enter the area of the house");
    	
    	double area = sc.nextDouble();
    	double totalCost;
    	
    	LOGGER.info("Enter your choice 1.Standard materials 2.Above standard materials 3.High standard materials "
    			+ "4.High standard material and fully automated home 5.");
    	int choice = sc.nextInt();
    	double cost[] = {1200, 1500, 1800, 2500};
    	totalCost = area * cost[choice - 1];
    	
    	LOGGER.info("The total amount to construct a house is " + totalCost);
    	
    }
}
