
/**
<<<<<<< HEAD
 * Switch is linked to a Lightbulb and can controll it
 * 
 * @author Camille Lihouck 
=======
 * Switch is linked to a lightBulb and can turn it on or off
 * 
 * @author Camille Lihouck
>>>>>>> 0f396f34c6bafd5636c182bf69c3fe51870f2fc9
 * @version 1.0
 */
public class Switch
{
<<<<<<< HEAD
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
    
=======
   // attributs
   private Lightbulb lightbulb;
   
   //constructeur
   /** build a switch carracterize by the lightbulb it's linked
    * @param lightbulb (Lightbulb) the lightbulb linked to the switch
    */
   public Switch(Lightbulb lightbulb){
       this.lightbulb = lightbulb;
    }
   
   //methodes
   /** change de state of the light
    * 
    */
   public void pressSwitch(){
       if (this.lightbulb.getState()==lightbulb.lightOn()){
           this.lightbulb.lightOff();
        }
        else{
           this.lightbulb.lightOn();
        }
    }
   /** get the bulb linked to the switch
    * 
    */
   public String getBulb(){
       return this.lightBulb;
    }
   /** get the state of the lightbulb
    * @return the state of the Lightbulb (String)
    */
   public String displayState(){
       System.out.println( this.getBulb() +"is"+ this.lightbulb.getState());
    }
}
>>>>>>> 0f396f34c6bafd5636c182bf69c3fe51870f2fc9
