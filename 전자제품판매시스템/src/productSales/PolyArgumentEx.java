package productSales;

public class PolyArgumentEx {

	public static void main(String[] args) {
		
		/*필드의 다형성 
		 * Product p1 = new TV(); Product p2 = new Computer(); Product p3 = new Audio();
		 * Product[] pArray = new Product[10];
		 */ 
		
		Buyer buyer = new Buyer();
		buyer.buy(new TV());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		buyer.buy(new Apple());
		System.out.println("현재남은돈:"+ buyer.money + "만원입니다");
	    System.out.println("현재포인트:"+buyer.bonusPoint);
	}

}
