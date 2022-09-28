import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

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
        double totalBillRounded;
        double totalBillAndTip;
        double totalPerPerson;

        // User Input Request
        System.out.print("Bill Amount: $");
        totalBill = s.nextInt();
        System.out.print("Tip Percentage (as a whole number without % sign): ");
        tipPercentage = s.nextInt();
        System.out.print("Number of People: ");
        numberOfPeople = s.nextInt();

        // Calculations
            // Tip
        tipPercentageConverted = tipPercentage * 0.01;
        totalTip = tipPercentageConverted * totalBill;
                // round the total tip up to nearest cent
        totalTipPerPerson = Math.ceil((totalTip / numberOfPeople) * 100);
                // cast as integer to remove anything after two decimals
        totalTipPerPerson = (int)totalTipPerPerson;
                // reset total tip to double with cents
        totalTipPerPerson = totalTipPerPerson / 100.00;

        totalTip = numberOfPeople * totalTipPerPerson;

            // Bill
                // round the total bill up to nearest cent
        totalBillPerPerson = Math.ceil((totalBill / numberOfPeople) * 100);
                // cast as an integer to remove anything after two decimals
        totalBillPerPerson = (int)totalBillPerPerson;
                // reset total bill to double with cents
        totalBillPerPerson = totalBillPerPerson / 100.00;

        totalBillRounded = totalBillPerPerson * numberOfPeople;

            // Totals
        totalBillAndTip = totalBillRounded + totalTip;

        totalPerPerson = totalBillPerPerson + totalTipPerPerson;

    }
}
