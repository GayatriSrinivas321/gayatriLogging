package com.epam.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	//CompoundInterestAndSimpleInterest co = new CompoundInterestAndSimpleInterest();
    	CostCalculation c = new CostCalculation();
    	c.userInputs();
    	HousConstructionCost  cost = new  HousConstructionCost ();
    	cost.estimation(); 
    }
}
