package com.epam.logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CostCalculation {
	private static Logger LOGGER = LogManager.getLogger(App.class);
	static Scanner sc = new Scanner(System.in);
	public void userInputs() {
		// TODO Auto-generated method stub
		boolean flag = true;
		CostCalculation test = new CostCalculation();
		while(flag) {
			LOGGER.error("Enter an option 1.Calculate Simple Interest 2.Calculate Compound Interest 3.exit");
			int val = sc.nextInt();
			switch(val) {
			case 1:
				test.takeInputForSimpleInterest();
				break;
			case 2:
				test.takeInputForCompoundInterest();
				break;
			case 3:
				flag = false;
				break;
			default:
				LOGGER.info("Enter valid input");	
				break;
			}
		}
	}
	private void takeInputForCompoundInterest() {
		LOGGER.error("Enter  principle amount");
		double principle = sc.nextDouble();
		LOGGER.error("Enter interest");
		double interest = sc.nextDouble();
		LOGGER.error("Enter time ");
		double numberOfYears = sc.nextDouble();
		LOGGER.error("Enter the value  of interest compounded per unit time ");
		double interestIsCompounded = sc.nextDouble();
		CompoundInterestAndSimpleInterest cost = new CompoundInterestAndSimpleInterest();
		LOGGER.error("Compound Interest = " + cost.compoundInterest(principle, interest, numberOfYears, interestIsCompounded)); 
	}
	private void takeInputForSimpleInterest() {
		LOGGER.error("Enter the amount of money borrowed");
		double money = sc.nextDouble();
		LOGGER.error("Enter rate of interest");
		double interest = sc.nextDouble();
		LOGGER.error("Enter  time ");
		double timePeriod = sc.nextDouble();
		CompoundInterestAndSimpleInterest cost = new CompoundInterestAndSimpleInterest();
		LOGGER.error("Simple Interest = " +cost.simpleIntrest(money, interest, timePeriod));
	}	
}