
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cderh
 */
public class PaymentType {

    //Set the enumerators.
    public enum Payment {
        CASH, DEBIT_CARD, CREDIT_CARD, CHECK
    }

    private static CashRegister cash;

    public PaymentType(CashRegister b) {
        cash = b;
    }

    /**
     *
     */
    public static void paymentInfo() {
        do{ 

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your payment type");

        System.out.println("1. Cash");

        System.out.println("2. Debit Card");

        System.out.println("3. Credit Card");

        System.out.println("4. Check");
        s.next();

        System.out.println("Please enter amount to pay with this type");
        s.next();
        
        }while(cash.owed != 0.0);

    }

}
