package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name="Tim";
        player.health =20; // class main is able to change PLayer fields directly
        //you need to make the fields private , and call the getter methods
        player.weapon="Sword";

        int damage = 10 ;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());

        damage=11;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());


    }
}
