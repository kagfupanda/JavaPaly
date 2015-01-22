/**
 * Siddharth Srinivasan
 * Period 4
 * Program 2.27
 * Does samething as 2.25 but in a GUI
 */
package my;

import javax.swing.JOptionPane;

public class Program2_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog(null ,"Enter Employee's:", "Name", JOptionPane.QUESTION_MESSAGE);
		String hours = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
		String pay = JOptionPane.showInputDialog("Enter hourly pay rate:");
		String fedTaxWithHoldRate = JOptionPane.showInputDialog("Enter federal tax witholding rate:");
		String stateTaxWithHoldRate = JOptionPane.showInputDialog("Enter state tax withholding rate:");
		double workHours = Double.parseDouble(hours);
		double payRate = Double.parseDouble(pay);
		double fedTax = Double.parseDouble(fedTaxWithHoldRate);
		double stateTax = Double.parseDouble(stateTaxWithHoldRate);
		double grossPay = payRate * workHours;
		double newFedWith = grossPay * fedTax;
		double newStateWith = grossPay * stateTax;
		double totDeduct = newFedWith + newStateWith;
		double totalDeductions = grossPay - (newStateWith + newFedWith);
		JOptionPane.showMessageDialog(null,"Employee Name: " + name, "Employee name", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hours Worked: " + hours, "Hours worked", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Pay Rate: " + payRate, "Pay Rate", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Gross Pay: " + grossPay, "Gross Pay", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Deductions", "Deductions", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Federal Withholding: " + newFedWith, "Federal Withholding", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "State Withholding: " + newStateWith, "State Withholding", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Total Deductions: " + totDeduct, "Total Deductions", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Net Pay: " + totalDeductions, "Net Pay", JOptionPane.INFORMATION_MESSAGE);
	}

}
