public class Coffee extends HotBeverage {

	//instance variables
	private String beans;
	private String brewType;
	private  int timeSinceBrewed;

	//no args constructor
	public Coffee() {

	}

	//args constructor 
	public Coffee(String beans, String brewType) {
		this.beans = beans; 
		this.brewType = brewType; 
	}

	//getters and setter
	public String getBeans() {
		return this.beans;
	}
	public String getBrewType() {
		return this.brewType;
	}
	public void  setBeans(String beans) {
		this.beans = beans;
	}
	public void setBrewType(String brewType) {
		this.brewType = brewType;
	}

	@Override
	public String toString() {
		return "Coffee: [beans="+this.beans+", brew type="+this.brewType+"]";
	}

	@Override
	public void identify() {
		System.out.println("I am a cup of coffee");
	}
}
