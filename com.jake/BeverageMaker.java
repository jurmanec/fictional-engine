public class BeverageMaker {

	public static void main(String[] args) {
		makeDrinks();
	}

	public static void  makeDrinks() {

	Coffee coffeeOne = new Coffee();
	coffeeOne.setBeans("Columbian");
	coffeeOne.setBrewType("drip brew");

	Coffee coffeeTwo = new Coffee("Mexican", "chemex");

	Coffee coffeeThree = new Coffee("PNG", "drip brew");



	//beverage one
	System.out.println("Beverage one:");

	coffeeOne.setTimeSinceBrewed(20);

	try {
		coffeeOne.identify(); //test of identify method
	} catch (NotHotBevException e) {
		e.printStackTrace();
	}
	System.out.println(coffeeOne + "\n");

	//bevage two 
	System.out.println("Beverage two:");

	coffeeTwo.setTimeSinceBrewed(20);

	try {
        	coffeeTwo.identify();
        } catch (NotHotBevException e) {
                 e.printStackTrace();
        }

	System.out.println(coffeeTwo + "\n");
	

	//bevage three
	System.out.println("Beverage three:");
	coffeeThree.setTimeSinceBrewed(90);
  	try {
                coffeeThree.identify();
        } catch (NotHotBevException e) {
                 e.printStackTrace();
        }

        System.out.println(coffeeThree + "\n");


	}
}
