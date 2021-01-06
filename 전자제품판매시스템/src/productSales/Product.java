package productSales;

public class Product {

	int price;//제품의 가격
	int bonusPoint;//제품 구매시 제공하는 보너스 점수
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint  = (int)(price/10.0);
	}
}
