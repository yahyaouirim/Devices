public class Phone extends Device{
    public Phone(int battery){
        super(battery);

    }
    public void makeCall(){
        System.out.println(" You make a call");
        int new_battery = getBattery() -5;
        setBattery(new_battery);
        if(is_dead()){

        }
        else{
            super.status();
        }
    }
    public boolean is_dead(){
        return getBattery()<5;
    }

    public boolean economic_battery(){
        return getBattery()<10;
    }
    public void playGame(){
        System.out.println(" You play a game");
       int new_battery= getBattery()-20;
       setBattery(new_battery);
       if(economic_battery()){
        System.out.println("Charge your battery");
       }
       else{
       super.status();
       }
    }

    public void charge(){
        int new_battery = getBattery()+ 50;
        setBattery(new_battery);
        System.out.println("Your charge is increased by 50");;
        super.status();

    }
}
