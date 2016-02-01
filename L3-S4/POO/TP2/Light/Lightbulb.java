
/**
 * Lightbulb is caracterized by a state, a color and a power
 * 
 * @author Camille Lihouck 
 * @version 1.0
 */
public class Lightbulb
{
   //attributs
  private String state;
  private String color;
  private float power;
  private String reference;
    
    //constructeur
  /** build a Lightbulb carracterized by its reference, its power and its color
   * @param reference (String) the Lightbulb reference's
   * @param color (String) the Lightbulb color's
   * @param power (float) the Lightbulb required power's
   */
  public Lightbulb(String reference,String color,float power){
    this.reference=reference;
    this.color=color;
    this.power=power;
    this.state="off";
    }
  
   //methods
    /** turns on the light
    * 
    */
   public void lightOn(){
       this.state="on";
    }
   /** turns off the light
    * 
    */
   public void lightOff(){
       this.state="off";
    }
   /** get the power required for the Lightbulb
    * @return the required power (float)
    */
   public float getPower(){
       return this.power;
    }
   /** get the color of the Lightbulb
    * @return the color (String)
    */
   public String getColor(){
       return this.color;
    }
   /** get the state of the Lightbulb
    * @return the state of the Lightbulb (String)
    */
   public String getState(){
       return this.state;
    }
   /** get the reference of the Lightbulb
    * @return the reference of the Lightbulb (String)
    */
   public String getReference(){
       return this.reference;
    }
}
