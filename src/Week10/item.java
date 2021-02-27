package Week10;

public class item{
	int sequence,price,utility,adventage;
	item(int i,int x,int y){
		sequence=i;
		price=x;
		utility=y;
		adventage=utility/price;
	}
}