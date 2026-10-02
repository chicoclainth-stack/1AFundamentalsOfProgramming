import javax.swing.JOptionPane;

public class Labquiz3 {
    public static void main(String[] args){
        String grossInput = JOptionPane.showInputDialog("Enter your grossbill:");
        String amountInput = JOptionPane.showInputDialog("Enter the amount:");

        double grossbill = Double.parseDouble(grossInput);
        double amount = Double.parseDouble(amountInput);

        double serviceCharge = grossbill * 0.12;
        double salestax = grossbill * 0.07;
        double netbill = grossbill + serviceCharge + salestax;
        double change = amount - netbill;

        JOptionPane.showMessageDialog(null,"grossbill: " + grossbill + "\nService Charge: " + serviceCharge + "\nSales Tax: " + salestax + "\nNet Bill: " + netbill + "\nchange: " + change);
    }
}
