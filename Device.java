public class Device {


    private int battery=100;
    // constructor
    public Device(int battery){
        this.battery = battery;
    }
    public void status(){
        System.out.println("Battery remaining : "+battery);
    }
    public int getBattery() {
        return battery;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }
    
}