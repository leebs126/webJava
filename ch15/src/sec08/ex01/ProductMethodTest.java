package sec08.ex01;

public class ProductMethodTest {

	public static int calcProdQty(Product[] prod) {
		int total = 0; // 총 제품 수량
		for (int i = 0; i < prod.length; i++) {
			total += prod[i].getQty();
		}
		return total;
	}

	public static void main(String[] args) {
		int totProd = 0;
		Product[] product = new Product[3];
		product[0] = new Product();
		product[1] = new Product("0002", "스마트 TV", "흰색", 200);
		product[2] = new Product("0003", "노트북", "은색", 100);
		totProd = calcProdQty(product);
		System.out.println("총 제품 수량은 " + totProd);
	}

}
