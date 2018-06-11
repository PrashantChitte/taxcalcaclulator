package tax.calculator.api.taxcalculator.beans;

public class TaxSlabRates {

	private double slabFirstRates;
	private double slabSecondRates;
	private double slabThirdRates;
	
	
	public TaxSlabRates() {
		super();
	}
	public double getSlabFirstRates() {
		return slabFirstRates;
	}
	public void setSlabFirstRates(double slabFirstRates) {
		this.slabFirstRates = slabFirstRates;
	}
	public double getSlabSecondRates() {
		return slabSecondRates;
	}
	public void setSlabSecondRates(double slabSecondRates) {
		this.slabSecondRates = slabSecondRates;
	}
	public double getSlabThirdRates() {
		return slabThirdRates;
	}
	public void setSlabThirdRates(double slabThirdRates) {
		this.slabThirdRates = slabThirdRates;
	}
	@Override
	public String toString() {
		return "TaxSlabRates [slabFirstRates=" + slabFirstRates + ", slabSecondRates=" + slabSecondRates
				+ ", slabThirdRates=" + slabThirdRates + "]";
	}
	
	
}
