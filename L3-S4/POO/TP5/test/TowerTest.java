import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Tower;
import hanoi.util.Disc;

public class TowerTest{

    @Test
    public void testIsEmpty(){
	Tower t1= new Tower(2);
	assertTrue(t1.isEmpty());
    }

    @Test
    public void testPutOnAndOffOneDisc(){
	Tower t1= new Tower(2);
	Disc d1= new Disc(1);
	t1.putOn(d1);
	assertFalse(t1.isEmpty());
	assertSame(d1,t1.takeOff());
	assertTrue(t1.isEmpty());
    }

    @Test
    public void testPutSeveralDiscs(){
	Tower t1= new Tower(2);
	Disc d1 = new Disc(1);
	Disc d2 = new Disc(2);
	Disc d3 = new Disc(3);
	t1.putOn(d3);
	t1.putOn(d2);
	assertFalse(t1.putOn(d1));
	t1.takeOff();
	t1.putOn(d1);
	assertFalse(t1.putOn(d2));
    }

    public static junit.framework.Test suite(){
	return new junit.framework.JUnit4TestAdapter(TowerTest.class);
    }
}
