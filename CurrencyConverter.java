import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double USDtoINR = 84.38;     // 1 USD = 84.38 INR
        double USDtoEUR = 0.93;      // 1 USD = 0.93 EUR
        double USDtoJPY = 152.69;    // 1 USD = 152.69 JPY
        double INRtoUSD = 0.012;     // 1 INR = 0.012 USD
        double INRtoEUR = 0.011;     // 1 INR = 0.011 EUR
        double INRtoJPY = 1.80;      // 1 INR = 1.80 JPY
        double EURtoUSD = 1.07;      // 1 EUR = 1.07 USD
        double EURtoINR = 90.46;     // 1 EUR = 90.46 INR
        double EURtoJPY = 163.73;    // 1 EUR = 163.73 JPY
        double JPYtoUSD = 0.0065;    // 1 JPY = 0.0065 USD
        double JPYtoINR = 0.56;      // 1 JPY = 0.56 INR
        double JPYtoEUR = 0.0061;    // 1 JPY = 0.0061 EUR

        /* 
        USD = United States Dollar
        INR = Indian Rupee
        EUR = Euro
        JPY = Japanese Yen
        */ 

        // User Select Base Currency
        System.out.println("Select base currency: 1.USD, 2.INR, 3.EUR, 4.JPY");
        int BaseCurrency = sc.nextInt();

        // User Select Target Currency
        System.out.println(" Select target currency: 1.USD, 2.INR, 3.EUR, 4.JPY");
        int TargetCurrency = sc.nextInt();
        
        // Amount to Convert
        System.out.println("Enter the amount to convert:");
        double amount = sc.nextDouble();

        double convertedAmount = 0;

        if(BaseCurrency == 1 && TargetCurrency == 2){
            convertedAmount = amount * USDtoINR;
            System.out.println("Converted Amount: " + convertedAmount + " INR");
        } else if(BaseCurrency == 1 && TargetCurrency == 3){
            convertedAmount = amount * USDtoEUR;
            System.out.println("Converted Amount: " + convertedAmount + " EUR");
        } else if(BaseCurrency == 1 && TargetCurrency == 4){
            convertedAmount = amount * USDtoJPY;
            System.out.println("Converted Amount: " + convertedAmount + " JPY");
        } else if(BaseCurrency == 2 && TargetCurrency == 1){
            convertedAmount = amount * INRtoUSD;
            System.out.println("Converted Amount: " + convertedAmount + " USD");
        } else if(BaseCurrency == 2 && TargetCurrency == 3){
            convertedAmount = amount * INRtoEUR;
            System.out.println("Converted Amount: " + convertedAmount + " EUR");
        } else if(BaseCurrency == 2 && TargetCurrency == 4){
            convertedAmount = amount * INRtoJPY;
            System.out.println("Converted Amount: " + convertedAmount + " JPY");
        } else if(BaseCurrency == 3 && TargetCurrency == 1){
            convertedAmount = amount * EURtoUSD;
            System.out.println("Converted Amount: " + convertedAmount + " USD");
        } else if(BaseCurrency == 3 && TargetCurrency == 2){
            convertedAmount = amount * EURtoINR;
            System.out.println("Converted Amount: " + convertedAmount + " INR");
        } else if(BaseCurrency == 3 && TargetCurrency == 4){
            convertedAmount = amount * EURtoJPY;
            System.out.println("Converted Amount: " + convertedAmount + " JPY");
        } else if(BaseCurrency == 4 && TargetCurrency == 1){
            convertedAmount = amount * JPYtoUSD;
            System.out.println("Converted Amount: " + convertedAmount + " USD");
        } else if(BaseCurrency == 4 && TargetCurrency == 2){
            convertedAmount = amount * JPYtoINR;
            System.out.println("Converted Amount: " + convertedAmount + " INR");
        } else if(BaseCurrency == 4 && TargetCurrency == 3){
            convertedAmount = amount * JPYtoUSD;
            System.out.println("Converted Amount: " + convertedAmount + " EUR");
        } else {
            System.out.println("Invalid Currency selection or Same Base Currency and Target Currency.");
        }
    }
}
