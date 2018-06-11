/**
 * 
 */
package tax.calculator.api.taxcalculator.service;

import tax.calculator.api.taxcalculator.beans.Assessee;

/**
 * @author PrashantChitte
 *
 */
public interface Taxable {

	public double calculateTax(Assessee taxPayer);
}
