public class Telephone implements ITelephone{

    private int myNumber;
    private boolean isRinging;


    public Telephone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Your Phone is On");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on Telephone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answer the telephone!");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring.....");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
