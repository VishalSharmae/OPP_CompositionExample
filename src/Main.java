public class Main {

    /**
     *
     * An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
     * An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.
     * The interface in Java is a mechanism to achieve abstraction.
     *
     */


    public static void main(String[] args) {


        ITelephone vishalsPhone;
        vishalsPhone = new Telephone(54321);
        vishalsPhone.powerOn();
        vishalsPhone.callPhone(54321);
        vishalsPhone.answer();

        vishalsPhone = new Mobilephone(123456);
        //vishalsPhone.powerOn();
        vishalsPhone.callPhone(123456);
        vishalsPhone.answer();


    }
}
