package tax.calculator.api.taxcalculator.beans;

public class TaxSlabsRanges {

	private double slabFirstRange;
	private double slabSecondRange;
	private double slabThirdRange;
	
	
	public TaxSlabsRanges() {
		super();
	}
	public double getSlabFirstRange() {
		return slabFirstRange;
	}
	public void setSlabFirstRange(double slabFirstRange) {
		this.slabFirstRange = slabFirstRange;
	}
	public double getSlabSecondRange() {
		return slabSecondRange;
	}
	public void setSlabSecondRange(double slabSecondRange) {
		this.slabSecondRange = slabSecondRange;
	}
	public double getSlabThirdRange() {
		return slabThirdRange;
	}
	public void setSlabThirdRange(double slabThirdRange) {
		this.slabThirdRange = slabThirdRange;
	}
	@Override
	public String toString() {
		return "TaxSlabsRanges [slabFirstRange=" + slabFirstRange + ", slabSecondRange=" + slabSecondRange
				+ ", slabThirdRange=" + slabThirdRange + "]";
	}
	
	
}
