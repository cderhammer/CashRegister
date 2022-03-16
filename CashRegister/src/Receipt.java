/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cderh
 */
public class Receipt {

    private final CashRegister cash;

    /**
     *
     * @param c
     */
    public Receipt(CashRegister c) {
        cash = c;
    }

    public CashRegister getCashRegister() {
        return cash;
    }



    public double getTotal() {
        return cash.total;
    }

    public double amountPaid() {
        return cash.paid;
    }

    public double subtotal() {
        return cash.sum;
    }

    public double tax() {
        return cash.tax;
    }
}
