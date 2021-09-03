package Interface;

public class DeskPhone implements ITelephone {
//The class DeskPhone should implements all the methods
    private int myNumber ;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

        System.out.println("No action taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        System.out.println("Answering the desk phone");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
