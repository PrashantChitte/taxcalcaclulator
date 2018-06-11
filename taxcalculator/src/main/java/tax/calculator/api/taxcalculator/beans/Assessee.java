/**
 * 
 */
package tax.calculator.api.taxcalculator.beans;

/**
 * @author PrashantChitte
 *
 */
public class Assessee {

	private String taxPayerName;
	private double salary;
	private String country;
	public Assessee() {
		super();
	}
	
	public Assessee(String taxPayerName, double salary) {
		super();
		this.taxPayerName = taxPayerName;
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTaxPayerName() {
		return taxPayerName;
	}
	public void setTaxPayerName(String taxPayerName) {
		this.taxPayerName = taxPayerName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Assessee [taxPayerName=" + taxPayerName + ", salary=" + salary + ", country=" + country + "]";
	}
		

}
