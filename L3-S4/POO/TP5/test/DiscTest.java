import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Disc;

public class DiscTest{

    @Test
    public void testGetSize(){
	Disc d1= new Disc(1);
	assertSame(1,d1.getSize());
    }


    public static junit.framework.Test suite(){
	return new junit.framework.JUnit4TestAdapter(DiscTest.class);
    }

}
