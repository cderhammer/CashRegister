

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cderh
 */
public class Main {

    static PaymentType b;
    static CashRegister a;
    static Receipt c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        a = new CashRegister();
        b = new PaymentType(a);
        PaymentType.paymentInfo();
        c = new Receipt(a);
        a.receipt();

    }

}
