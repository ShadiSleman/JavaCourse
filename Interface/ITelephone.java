package Interface;

public interface ITelephone {

    //no need for access modifier because you are gonna be doing that in the actual class

     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int PhoneNumber);
     boolean isRinging();




}
