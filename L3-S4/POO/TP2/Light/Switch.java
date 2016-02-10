
/**
 * Switch is linked to a Lightbulb and can controll it
 * 
 * @author Camille Lihouck 
 * @version 1.0
 */
public class Switch
{
    // attributs
    private Lightbulb lightbulb;

    /** build a new switch
     * @param lightbulb the lightbulb linked to the switch
     */
    public Switch(Lightbulb lightbulb){
        this.lightbulb=lightbulb;
    }
    //methodes
    /** turn on the light if it's off and reverse
     * 
     */
    public void changeLight(){
        if (this.lightbulb.getState()=="on"){
            this.lightbulb.lightOff();
        }
        else{
            this.lightbulb.lightOn();
        }
    }
    /** get the state of the Light
     * @return the state of the light
     */
    public String getLightState(){
        return this.lightbulb.getState();
    }
}     
    