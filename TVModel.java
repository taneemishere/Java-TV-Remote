/**
 * TVModel
 */
public class TVModel {

    public int channel = 0;
    public int volume = 0;
    private Boolean on = false;

    public void power() {
        if(on == false){
            this.on = true;
            System.out.println("TV is turned on!");
        }
        else if(on == true){
            this.on = false;
            System.out.println("TV is turnd off!");
        }

    }
    

    public void setChannel(int channelNo) {
        if (on == true) {
            this.channel = channelNo;
            System.out.println("Channel No is: " + channelNo);
        }
        else{
            System.out.println("Please turn on first!");
        }
    }

    public void channelUp(){
        if(on == true){
            this.channel = channel+1;
            System.out.println("Channel no increased!");
        }
        else{
            System.out.println("Please turn on first!");
        }
    }
    
    public void channelDown() {
        if(on == true){   
            this.channel = channel-1;
            System.out.println("Channel no decreased!");
        }
        else{
            System.out.println("Please turn on first!");
        }
    }

    public void volumeUp() {
        if(on == true){
            this.volume = volume+1;
            System.out.println("Volume increasing!");
        }
        else{
            System.out.println("Please turn on first!");
        }
    }
    public void volumeDown(){
        if(on == true){
            this.volume = volume-1;
            System.out.println("Volume decreasing!");
        }
        else{
            System.out.println("Please turn on first!");
        }  
    }
    public void currentSates() {
        System.out.println("Volume is: " + volume + " and Channel no is: " + channel);
    }
}