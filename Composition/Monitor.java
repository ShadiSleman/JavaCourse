package Composition;

public class Monitor {

    private String model;
    private String manudacturer;
    private int size;
    private Resolution nativeResolution; // This is the composition . Monitor "has a" Resolution

    public Monitor(String model, String manudacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manudacturer = manudacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x , int y , String color ){
        System.out.println("Drawing pixel at " + x +","+y + "in color "+color);
    }

    public String getModel() {
        return model;
    }

    public String getManudacturer() {
        return manudacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
