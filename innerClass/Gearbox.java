package innerClass;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber = 0;

    public Gearbox(ArrayList<Gear> gears, int maxGears, int gearNumber) {
        this.maxGears = maxGears;

        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }


    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }


    }

}
