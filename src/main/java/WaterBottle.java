public class WaterBottle {

    public int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){ return this.volume; }

    public int subtractTenFromVolume(){ return this.volume -= 10; }

    public int setVolumeToZero(){ return this.volume = 0; }

    public int setVolumeToOneHundred(){ return this.volume = 100; }
}
