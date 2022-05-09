public class Mobilephone implements ITelephone {

    private int myNumber;
    private boolean isOn = false;
    private boolean isRinging;


    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
            System.out.println("Mobile phone power switched on!");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on Mobile phone");
        }else {
            System.out.println( "Phone is switched off!");
        }
    }


    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answer the mobile phone!");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody Playing.......");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }


}
