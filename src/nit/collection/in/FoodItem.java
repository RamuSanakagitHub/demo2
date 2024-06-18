package nit.collection.in;
import java.util.EnumSet;

public enum FoodItem {

	 DOSA(30), PURI(50), IDLY(40);
	private double price;
	FoodItem(double price){
		this.price= price;
		}
	
	public static void main(String[] args) {
		
		EnumSet<FoodItem> es1 = EnumSet.noneOf(FoodItem.class);
		EnumSet<FoodItem> es2 = EnumSet.allOf(FoodItem.class);
		EnumSet<FoodItem> es3 = EnumSet.of(FoodItem.DOSA, FoodItem.IDLY, FoodItem.PURI);
		EnumSet<FoodItem> es4 = EnumSet.copyOf(es3);
		EnumSet<FoodItem> es5 = EnumSet.complementOf(es3);
		EnumSet<FoodItem> es6 = EnumSet.range(FoodItem.DOSA, FoodItem.PURI);
		
		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es3);
		System.out.println(es4);
		System.out.println(es5);
		System.out.println(es6);
		
		System.out.println();
		
		System.out.println("s.no" + "\t item" + "\t price");
		FoodItem[] fd = FoodItem.values();
	    for(int i = 0; i<fd.length; i++) {
	    	FoodItem f = fd[i];
	    	System.out.print("" +f.ordinal() + "\t");
	    	System.out.print("" +f.name()+ "\t");
	    	System.out.println("" +f.price);
	    	
	    }
	}
}
