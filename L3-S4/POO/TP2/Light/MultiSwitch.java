
/**
 * MultiSwitch can controll a define number of Lightbulb
 * 
 * @author Camille Lihouck
 * @version 1.0
 */
public class MultiSwitch
{
    // instance variables - replace the example below with your own
    private int capacity;
    private Lightbulb lightbulbs[];
    private String state;

    /**build a MultiSwitch of a given capacity
     * @param capacity the number Lightbulb you can link to the MultiSwitch
     */
    public MultiSwitch(int capacity)
    {
        this.capacity=capacity;
        this.lightbulbs= new Lightbulb[capacity];
        this.state="off";
    }

    /** Set the (i-1)st lightbulb controlled by the multiswitch
     * @param i the bulb index
     * @param lightbulb the controlled bulb
     */
    public void setLightbulb(int i, Lightbulb lightbulb)
    {
      this.lightbulbs[i-1]=lightbulb;
      if (this.state=="off"){
           this.lightbulbs[i-1].lightOff();
      }
      else{
          this.lightbulbs[i-1].lightOn();
       }
    }
    /** Turns on the ligths if they are off and reverse.
     * 
     */
    public void changeState(){
        if (this.state=="on"){
            this.state="off";
            for (int i=0; i<capacity; i++){
                if (this.lightbulbs[i]!=null){
                    lightbulbs[i].lightOff();
                }
            }
        }
        else{
             this.state="on";
            for (int i=0; i<capacity; i++){
                if (this.lightbulbs[i]!=null){
                    lightbulbs[i].lightOn();
                }
            }
        }
    }
    /** display the state of all bulbs controlled by the multiswitch
     * 
     */
    public void displayAllBulbStates(){
        for (int i=0; i<capacity; i++){
            if (lightbulbs[i]!=null){
                System.out.println(this.lightbulbs[i].getReference()+ " is " + this.lightbulbs[i].getState());
            }
        }
    }
}
