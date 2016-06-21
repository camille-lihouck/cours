import org.junit.*;
import static org.junit.Assert.*;
import image.color.GrayColor;
import image.Pixel;

public class PixelTest{

    @Test
    public void testGetColor(){
	GrayColor gray = new GrayColor(45);
	Pixel pixel = new Pixel(gray);
	assertSame (pixel.getColor(),gray);
    }

    @Test
    public void testSetColor(){
	GrayColor gray1 = new GrayColor(45);
	GrayColor gray2 = new GrayColor(65);
	Pixel pixel = new Pixel(gray1);
	pixel.setColor(gray2);
	assertSame (pixel.getColor(),gray2);
    }

    
    @Test
    public void testEquals(){
	GrayColor gray1 = new GrayColor(45);
	GrayColor gray2 = new GrayColor(185);
	Pixel pixel1 = new Pixel(gray1);
	Pixel pixel2 = new Pixel(gray1);
	Pixel pixel3 = new Pixel(gray2);
	assertTrue(pixel1.equals(pixel2));
	assertFalse(pixel1.equals(pixel3));
	assertFalse(pixel1.equals(gray1));
    }

    public static junit.framework.Test suite(){
	return new junit.framework.JUnit4TestAdapter(PixelTest.class);
    }
}
