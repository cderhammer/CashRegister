
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
public class CashRegister {

    Scanner s = new Scanner(System.in);

    private final double apple = .5;
    private final double beer = 10.0;
    private final double Ramen = 2.00;

    private final double itemOne;
    private final double itemTwo;
    private final double itemThree;

    double sum = beer + apple + Ramen;
    double tax = sum * .07;
    double total = sum + tax;
    double paid = s.nextDouble();
    double owed = total - paid;

    /**
     *
     */
    public CashRegister() {

        this.itemOne = apple;
        this.itemTwo = beer;
        this.itemThree = Ramen;

        System.out.println("Item: apple: " + apple);
        System.out.println("Item: beer: " + beer);
        System.out.println("Item: Ramen: " + Ramen);
        System.out.println("Total: " + total);
        
        System.out.println("Amount owed: " + owed);
        
        
    }

    /**
     *
     * @return
     */
    public double getTotal() {

        return total;
    }

    public double amountPaid() {
        return paid;
    }

    public double subtotal() {
        return sum;
    }

    public double tax() {
        return tax;
    }
    
    public void receipt(){
        
        System.out.println("\n");
        System.out.println("------------------------------------------------");
        System.out.println("Subtotal: \t" + sum);
        System.out.println("Tax: \t" + tax);
        System.out.println("Total: \t" + total);
        System.out.println("Amount paid: \t" + paid);
    }

}
