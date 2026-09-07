package Tutorial6;

interface payment{
    void pay(double amount);
}
class creditPay implements payment{
    @Override
    public void pay(double amount){
        System.out.println("amount paid: "+ amount+" using credit card");
    }
}
class UpiPay implements payment{
    @Override
    public void pay(double amount){
        System.out.println("amount paid: "+ amount+" using upi payment");
    }
}
class NetBankingPay implements payment{
    @Override
    public void pay(double amount){
        System.out.println("amount paid: "+ amount+" using NetBanking");
    }
}
public class OnlineShopping {
    public static void main(String[] args) {

        payment c;

        c = new creditPay();
        c.pay(500.0);

        payment u;
        u = new UpiPay();
        u.pay(1000.0);

        payment n;
        n = new NetBankingPay();
        n.pay(50000.0);
    }
}
