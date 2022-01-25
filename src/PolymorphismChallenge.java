class Car{
    private String name;
    private String engine;
    private int cylinder;
    private String carType;
    private int speed;

    public Car(String name, String engine, int cylinder, String carType, int speed) {
        this.name = name;
        this.engine = engine;
        this.cylinder = cylinder;
        this.carType = carType;
        this.speed = speed;
    }

    public void getCarDetails(){
        System.out.println("Car name is " + getName() + ".\nIt is running on " + getEngine()+ "cc engine and " + getCylinder() + " cylinders. \n"
                            + "It is a " + getCarType() + " car. \n" + "running at speed " + getSpeed() +"km/h.\n\n");
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getCarType() {
        return carType;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(){
        this.speed +=5;
    }

    public void brake(){
        this.speed -= 5;
    }
}

class Swift extends Car{
    public Swift() {
        super("Swift", "1299", 4, "Hatchback", 50);
    }


    @Override
    public void getCarDetails() {
        super.getCarDetails();
    }
}

class Baleno extends Car{
    public Baleno() {
        super("Baleno", "1197", 4, "Hatchback", 80);
    }

    @Override
    public void getCarDetails() {
        super.getCarDetails();
    }
}

class Ciaz extends Car{
    public Ciaz() {
        super("Ciaz", "1462", 4, "Sedan", 100);
    }

    @Override
    public void getCarDetails() {
        super.getCarDetails();
    }
}

class AudiQ7 extends Car{
    public AudiQ7() {
        super("Audi Q7", "2967", 4, "SUV", 120);
    }
}

public class PolymorphismChallenge {

    public static void main(String[] args) {

        for (int i = 1; i <= 8 ; i++){
            Car car = randomCar();
            System.out.println("Random Car No. " + i + ":");
            car.getCarDetails();
        }

        Swift swift = new Swift();
        swift.accelerate();
        System.out.println(swift.getSpeed());

    }

// I will select a random car and display its details in output
    public static Car randomCar(){
        int randomNumber = (int) ((Math.random() *4) +1);

        switch (randomNumber){
            case 1 :
                return new Swift();

            case 2:
                return new Baleno();

            case 3:
                return new Ciaz();

            case 4:
                return new AudiQ7();

        }
        return null;
    }

}
