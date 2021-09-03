package Interface;

//Interface - Common behavior can be used by several classes by having them all implement the same interface
public class Main {

    public static void main(String[] args) {


        ITelephone timsPhone ;
        timsPhone = new DeskPhone(12345); // The way to create instance of class implements interface
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();


        timsPhone = new MobilePhone(23456); // same instance name because it's type of Interface ITelephone
        //timsPhone.powerON()
        timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
