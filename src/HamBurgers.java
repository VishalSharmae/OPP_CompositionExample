public class HamBurgers {
    private String burgerName;
    private String breadRollType;
    private boolean meat;
    private int meatRate;
    private boolean lettuce;
    private int lettuceRate;
    private boolean tomato;
    private int tomatoRate;
    private boolean carrot;
    private int carrotRate;
    private boolean cheese;
    private int cheeseRate;
    private boolean fries;
    private int friesRate;
    private boolean drinks;
    private int drinksRate ;
    private int priceOfBurger;

    public HamBurgers(String burgerName, String breadRollType, boolean meat, boolean lettuce, boolean tomato,
                      boolean carrot, boolean cheese, boolean fries, boolean drinks) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.meatRate = 50;
        this.lettuce = lettuce;
        this.lettuceRate = 10;
        this.tomato = tomato;
        this.tomatoRate = 30;
        this.carrot = carrot;
        this.carrotRate = 20;
        this.cheese = cheese;
        this.cheeseRate = 50;
        this.fries = fries;
        this.drinks =drinks;
        this.drinksRate= 20;
        this.friesRate= 20;
        priceOfBurger = 50;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public int getPriceOfBurger() {
        priceOfBurger += (meat) ? meatRate : 0; // Checking is meat included in burger and incrementing price accordingly using ternary operator
        priceOfBurger += (lettuce) ? lettuceRate : 0; // Checking is lettuce included in burger and incrementing price accordingly using ternary operator
        priceOfBurger += (tomato) ? tomatoRate : 0;  // Checking is tomato included in burger and incrementing price accordingly using ternary operator
        priceOfBurger += (carrot) ? carrotRate : 0;  // Checking is carrot included in burger and incrementing price accordingly using ternary operator
        priceOfBurger += (cheese) ? cheeseRate : 0; // Checking is cheese included in burger and incrementing price accordingly using ternary operator
        priceOfBurger += (drinks) ? drinksRate : 0; // same as above
        priceOfBurger += (fries) ? friesRate : 0;// same as above (amended later)

        return priceOfBurger;
    }

    public void getBurgerDetails(){
        System.out.println("Thank you for ordering from King's Burgers!\nYou have ordered " + burgerName +
                            " with following additions:-" );

        if (meat){
            System.out.println("Addition Name = Meat ; Addition Price = " +meatRate);
        }
        if (lettuce){
            System.out.println("Addition Name = Lettuce ; Addition Price = " +lettuceRate);
        }
        if (tomato){
            System.out.println("Addition Name = Tomato ; Addition Price = " +tomatoRate);
        }
        if (carrot){
            System.out.println("Addition Name = Carrot ; Addition Price = " +carrotRate);
        }
        if (cheese){
            System.out.println("Addition Name = Cheese ; Addition Rate = " + cheeseRate);
        }
        if (fries){
            System.out.println("Addition Name = Fries ; Addition Price = " +friesRate);
        }
        if (drinks){
            System.out.println("Addition Name = Drinks ; Addition Price = " +drinksRate);
        }
        System.out.println("Your total is Rs." + getPriceOfBurger() + "\n");
    }
}

class HealthyBurger extends HamBurgers{

    public HealthyBurger() {
        super("HealthyBurger","Brown Rye Bread", false, true, true,
                true, false, false, false);

    }

    @Override
    public void getBurgerDetails() {
        super.getBurgerDetails();
    }

    @Override
    public int getPriceOfBurger() {
        return super.getPriceOfBurger();
    }
}

class DeluxeBurger extends HamBurgers{

    public DeluxeBurger() {
        super("Deluxe Burger", "Italian Bread", true, true, true,
                true, true, true, true);
    }

    @Override
    public int getPriceOfBurger() {
      return  super.getPriceOfBurger() ;
    }

    @Override
    public void getBurgerDetails() {
        super.getBurgerDetails();
    }
}


