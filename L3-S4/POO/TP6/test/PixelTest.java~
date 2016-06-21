import org.junit.*;
import static org.junit.Assert.*;
import image.color.GrayColor;

public class GrayColorTest{


    @Test
    public void testGetLevel(){
	GrayColor gray = new GrayColor(45);
	assertSame (gray.getLevel(),45);
    }

    @Test
    public void testEquals(){
	GrayColor gray1 = new GrayColor(45);
	GrayColor gray2 = new GrayColor(45);
	GrayColor gray3 = new GrayColor(185);
	assertTrue(gray1.equals(gray2));
	assertFalse(gray1.equals(gray3));
	assertFalse(gray1.equals(45));
    }

    public static junit.framework.Test suite(){
	return new junit.framework.JUnit4TestAdapter(GrayColorTest.class);
    }
}
