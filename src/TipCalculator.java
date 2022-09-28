import java.text.DecimalFormat;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Variables
            // User Input Variables
        int numberOfPeople;
        double totalBill;
        int tipPercentage;

            // Calculation Variables
        double tipPercentageConverted;
        double totalTip;
        double totalTipPerPerson;
        double totalBillPerPerson;
        double totalBillAndTip;
        double totalPerPerson;

        // User Input Request
        System.out.print("Bill Amount: $");
        totalBill = s.nextDouble();
        System.out.print("Tip Percentage (as a whole number without % sign): ");
        tipPercentage = s.nextInt();
        System.out.print("Number of People: ");
        numberOfPeople = s.nextInt();

        // Calculations
            // Tip
        tipPercentageConverted = tipPercentage * 0.01;
        totalTip = tipPercentageConverted * totalBill;
                // round the total tip up to nearest cent
        totalTipPerPerson = (totalTip / numberOfPeople) * 1000;
                // cast as integer to truncate anything after three decimal places
        totalTipPerPerson = (int)totalTipPerPerson;
                // divide by 10.0 to double and allow to round up if leftover decimal
        totalTipPerPerson = Math.ceil(totalTipPerPerson / 10.0);
                // reset total tip to double with cents
        totalTipPerPerson = totalTipPerPerson / 100.00;

        totalTip = numberOfPeople * totalTipPerPerson;

            // Bill
                // round the total bill up to nearest cent
        totalBillPerPerson = (totalBill / numberOfPeople) * 1000;
                // cast as an integer to truncate anything after three decimal places
        totalBillPerPerson = (int)totalBillPerPerson;
                // divide by 10.0 to double and allow to round up if leftover decimal
        totalBillPerPerson = Math.ceil(totalBillPerPerson / 10.0);
                // reset total bill to double with cents
        totalBillPerPerson = totalBillPerPerson / 100.00;

            // Totals
        totalBillAndTip = totalBill + totalTip;

        totalPerPerson = totalBillPerPerson + totalTipPerPerson;

        // User Display
        System.out.println();
        // Total tip amount will ALWAYS reflect the amount of total not including the bill
        System.out.println("Total Tip Amount: $" + df.format(totalTip));
        System.out.println("Final Bill Amount (Bill + Tip): $" + df.format(totalBillAndTip));
        System.out.println("Total Tip Per Person: $" + df.format(totalTipPerPerson));
        // Amount paid per person will ALWAYS cover the final bill amount when totaled
        System.out.print("Amount To Be Paid Per Person (Bill + Tip): $" + df.format(totalPerPerson));
    }
}
