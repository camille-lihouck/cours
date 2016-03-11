import org.junit.*;
import static org.junit.Assert.*;
import hanoi.*;
import hanoi.util.*;

public class HanoiTest {	

    @Test
    public void testHanoi() {
        Hanoi h = new Hanoi(4);
	assertFalse(h.getTowers()[0].isEmpty());
	assertTrue(h.getTowers()[1].isEmpty());
	assertTrue(h.getTowers()[2].isEmpty());
    }

    @Test
    public void testSolve() {
        Hanoi h = new Hanoi(4);
	h.solve();
	assertTrue(h.getTowers()[0].isEmpty());
	assertTrue(h.getTowers()[1].isEmpty());
	assertFalse(h.getTowers()[2].isEmpty());
    }

    @Test
    public void testMoveOneDisc() {
        Hanoi h = new Hanoi(2);
	h.moveOneDisc(0,1);
	assertFalse(h.getTowers()[1].isEmpty());
    }

    
 
    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(HanoiTest.class);
    }

}
