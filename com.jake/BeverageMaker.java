public class BeverageMaker {

	public static void main(String[] args) {
		makeDrinks();
	}

	public static void  makeDrinks() {

	Coffee coffeeOne = new Coffee();
	coffeeOne.setBeans("Columbian");
	coffeeOne.setBrewType("drip brew");

	Coffee coffeeTwo = new Coffee("Mexican", "chemex");

	System.out.println(coffeeOne);

	}

}
