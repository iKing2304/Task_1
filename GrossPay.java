import java.text.DecimalFormat;
import java.util.Scanner;

public class GrossPay {
    
    public static void main(String[] args) {
        
        int Rate, Days;
        int a = 2350; // combined SSS, HDMF, and PhilHealth.
        double GrossPay, NetPay, Deductions, Tax, TaxRate = 0.0;
        DecimalFormat dc = new DecimalFormat("0.00"); // Defined for the gross pay to have two decimal places.
        Scanner sc = new Scanner (System.in);
        
            System.out.print("Enter Rate per day:");
            Rate = sc.nextInt();

            System.out.print("Enter Number of days worked:");
            Days = sc.nextInt();
            sc.close();

            GrossPay = Rate * Days;
            
            //Tax
                if (GrossPay >= 50001) {
                    TaxRate = 0.32;
                }
                else if (GrossPay >= 30001 ) {
                    TaxRate = 0.25;
                }
                else if (GrossPay >= 20001) {
                    TaxRate= 0.12;
                }
                else {
                    TaxRate= 0.0;
                }
        
            
            Tax = GrossPay * TaxRate;
            Deductions = a + Tax;
            NetPay = GrossPay - Deductions;
            
            System.out.println("Your Gross Pay is " + dc.format(GrossPay));
            System.out.println("");
            System.out.println("Deductions:");
            System.out.println("SSS = 850.00");
            System.out.println("HDMF = 1000.00");
            System.out.println("PhilHealth = 500.00");
            System.out.println("Tax Due = " + dc.format(Tax));
            System.out.println("TOTAL DEDUCTION: " + dc.format(Deductions));
            System.out.println("");
            System.out.println("Your NET PAY is: " + dc.format(NetPay));
        
    }
}

// Compiled by Earl David Ong. 03/02/2021. 23.10.