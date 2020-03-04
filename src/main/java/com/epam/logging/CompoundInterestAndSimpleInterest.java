package com.epam.logging;


public class CompoundInterestAndSimpleInterest {
	public static double compoundInterest(double principle, double interest, double numberOfYears, double interestIsCompounded) {
		double compoundInterest;
		compoundInterest = (1 + (interest/100));
		while(interestIsCompounded != 0) {
			compoundInterest = compoundInterest * (1 + (interest/100));
			interestIsCompounded--;
		} compoundInterest = compoundInterest * principle;
		return compoundInterest;
	}
		
	public static double simpleIntrest(double moneyBorrowed, double interest, double timePeriod) {
		double simpleIntrest;
		simpleIntrest = (moneyBorrowed * interest * timePeriod) / 100;
		return simpleIntrest;
	}
}
