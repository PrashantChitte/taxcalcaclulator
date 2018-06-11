package tax.calculator.api.taxcalculator.service;

import tax.calculator.api.taxcalculator.beans.Assessee;
import tax.calculator.api.taxcalculator.beans.TaxSlabRates;
import tax.calculator.api.taxcalculator.beans.TaxSlabsRanges;

public class TaxImplementation implements Taxable{

	public double taxableAmount=0;
	TaxSlabRates taxRate;
	TaxSlabsRanges taxRange;
	public double calculateTax(Assessee taxPayer) {
		return 0;
	}
	private double calculateTaxRangeFirst(Assessee taxPayer){
		if(taxRange.getSlabFirstRange()>=taxPayer.getSalary()){
			taxableAmount=taxRate.getSlabFirstRates()*taxPayer.getSalary()/100;
		}
		return 0;
		
	}
	private double calculateTaxRangeSecond(Assessee taxPayer){
		return 0;
		
	}
	private double calculateTaxRangeThird(Assessee taxPayer){
		return 0;
		
	}
}
