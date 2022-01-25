

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Welcome extends Movie{
    public Welcome(){
        super("Welcome");
    }
    public String plot(){
        return "Two thugs meet Rajiv, who belongs to a respectable family, and want to fix their " +
                "sister's wedding with him. However, when Rajiv's uncle refuses to the match, a " +
                "series of hilarious situations occur.";
    }
}

class Chhalaang extends Movie{

    public Chhalaang(){
        super("Chhalaang");
    }

    @Override
    public String plot() {

        return "Montu is a lazy physical training instructor who does the bare minimum to stay employed. " +
                "However, a new teacher threatens to take his job and the woman he loves.";

    }
}

class CoolieNo1 extends Movie{

    public CoolieNo1(){
        super("Coolie No. 1");
    }

    @Override
    public String plot() {

        return "When a matchmaker is insulted by Jeffrey Rozario, a rich businessman, " +
                "he vows to exact revenge. As a result, he makes a porter pretend to be a rich man " +
                "and marries him off to Rozario's daughter.";

    }

}

class Pushpa extends Movie{

    public Pushpa() {
        super("Pushpa");
    }

    @Override
    public String plot() {

        return "Violence erupts between red sandalwood smugglers and the police charged with bringing " +
                "down their organisation in the Seshachalam forests of South India.";

    }
}

class Forgetable extends Movie{

    public Forgetable() {
        super("Forgetable");
    }
}


public class PolymorphismExample {

    public static void main(String[] args) {

        // Polymorphism in Java is the ability of an object to take many forms.
        // To simply put, polymorphism in java allows us to perform the same action in many different ways.

        for(int i=1; i< 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie No." + i + " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n" );
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Welcome();

            case 2:
                return new Chhalaang();

            case 3:
                return new CoolieNo1();

            case 4:
                return new Pushpa();

            case 5:
                return new Forgetable();

        }
        return null;
    }

}
