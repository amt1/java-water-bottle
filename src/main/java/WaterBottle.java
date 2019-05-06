public class WaterBottle {

    private byte volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public byte getVolume(){
        return volume;
    }

    public void drink() {
        volume -= 10;
    }

    public void empty() {
        volume = 0;
    }

    public void fill() {
        volume = 100;
    }
}
