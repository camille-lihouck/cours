import java.lang.Math;
/**
 * Complex represent complex numbers define by a real and an imaginary part
 * 
 * @author Camille Lihouck
 * @version 1.0
 */
public class Complex
{
    // instance variables - replace the example below with your own
    private double real;
    private double imaginary;

    /** build a complex number represented by its real and imaginary part
     * @param x the real part
     * @param y the imaginary part
     */
    public Complex(double x , double y)
    {
        this.real=x;
        this.imaginary=y;
    }
    /** build a complex whose real and imaginary part are 0
     * 
     */
    public Complex(){
        this.real=0;
        this.imaginary=0;
    }
    //methodes
    /** tell if the complex is real
     * return true if the complex is real, false otherwise
     */
    public boolean isReal(){
        return this.imaginary==0;
    }
    /** give the real part of a complex
     * @return the real part of a complex
     */
    public double realPart(){
        return this.real;
    }
    /** give the imaginary part of complex
     * @return the imaginary part of a complex
     */
    public double imaginaryPart(){
        return this.imaginary;
    }
    /** give the module of a complex
     * @return the module of a complex 
     */
    public double module(){
        double res= this.real*this.real + this.imaginary*this.imaginary;
        res= Math.sqrt(res);
        return res;
    }
    /**give the conjugate complex
     *  return the conjugate complex
     */
    public Complex conjugate()
    {
       return new Complex(this.real,-this.imaginary);
    }
    /** add the given complex to the complex on witch this method is called
     * @param z the complex to add to
     * @return the sum of those two complex
     */
    public Complex add(Complex z){
        Complex res=new Complex();
        res.real=this.real + z.real;
        res.imaginary=this.imaginary+z.imaginary;
        return res;
    }
    /** multiply the given complex to the complex on sitch this method is called
     * @param z the complex to multiply with
     * @return the product of those two complex
     */
    public Complex multiply(Complex z){
        Complex res= new Complex();
        res.real=this.real*z.real - this.imaginary*z.imaginary;
        res.imaginary=this.real*z.real + this.imaginary*z.imaginary;
        return res;
    }
    /** provide a String representaion of a Complex
     * @return a string representation of a Complex
     */
    public String toString(){
        String realPart=String.valueOf(this.real);
        String imagPart=String.valueOf(this.imaginary);
        return realPart + " + i* " + imagPart;
    }
}
