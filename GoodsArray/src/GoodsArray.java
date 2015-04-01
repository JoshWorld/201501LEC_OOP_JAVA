import java.util.Scanner;


class Goods {
	private String name;
	private int price;
	private int numberOfStocks;
	private int sold;
	
	Goods(String sName, int iPrice, int iNStock, int nSold) {
		name = sName;
		price = iPrice;
		numberOfStocks = iNStock;
		sold = nSold;
	}
	public void printGoodsInfo() {
		System.out.println(name+":"+price+"won, "+numberOfStocks+","+sold);
	}
}

public class GoodsArray {
	public static void main(String args[]) {
		Goods[] goodsArray;
		goodsArray = new Goods[3];
		
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0; i<3; i++) {
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
		}
		for(Goods item : goodsArray) {
			item.printGoodsInfo();
		}
		
	}
}
