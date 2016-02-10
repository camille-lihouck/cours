
/**
 * Switch is linked to a lightBulb and can turn it on or off
 * 
 * @author Camille Lihouck
 * @version 1.0
 */
public class Switch
{
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
