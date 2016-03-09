import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Tower;
import hanoi.util.Disc;

public class TowerTest{

    @Test
    public void testIsEmpty(){
	Tower t1= new Tower();
	assertTrue(t1.isEmpty());
    }

    @Test
    public void testPutOnAndOff(){
	Tower t1= new Tower();
	Disc d1= new Disc(1);
	t1.putOn(d1);
	assertFalse(t1.isEmpty());
	assertSame(d1,t1.takeOff());
	assertTrue(t1.isEmpty());
    }

    public static junit.framework.Test suite(){
	return new junit.framework.JUnit4TestAdapter(TowerTest.class);
    }
}
