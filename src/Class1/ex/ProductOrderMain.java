package Class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu= new ProductOrder();
        dubu.productName="두부";
        dubu.price=2000;
        dubu.quantity=2;

        ProductOrder kimche= new ProductOrder();
        kimche.productName="두부";
        kimche.price=5000;
        kimche.quantity=1;

        ProductOrder coke= new ProductOrder();
        coke.productName="두부";
        coke.price=1500;
        coke.quantity=2;

        int totalAmount=0;
        ProductOrder[] productOrders={dubu,kimche,coke};
        for (ProductOrder p :productOrders ) {
            System.out.println("상품명:"+p.productName+" 가격:"+p.price+" 수량:"+ p.quantity);
            totalAmount+=p.price*p.quantity;

        }
        System.out.println("총 결제 금액:"+totalAmount);
    }
}
