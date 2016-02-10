import org.junit.*;
import static org.junit.Assert.*;
import example.Robot;
import example.util.*;

public class RobotTest{

    @Test
    public void testCarryBox(){
	Robot robbie = new Robot();
	Box box1 = new Box(10);
	assertFalse(robbie.carryBox());
	robbie.take(box1);
	assertTrue(robbie.carryBox());
    }
    
    @Test
    public void testTakeBox(){
	Robot robbie = new Robot();
	Box box1 = new Box(10);
	Box box2 = new Box(20);
	robbie.take(box1);
	assertSame(box1,robbie.getCarriedBox());
	robbie.take(box2);
	assertSame(box1,robbie.getCarriedBox());
    }


    @Test

    public void testPutBox(){
	Robot robbie = new Robot();
	Box box1 = new Box(50);
	ConveyerBelt conv1 = new ConveyerBelt(20);
	ConveyerBelt conv2 = new ConveyerBelt(100);
	robbie.take(box1);
	robbie.putOn(conv1);
	assertSame(box1,robbie.getCarriedBox());
	robbie.putOn(conv2);
	assertFalse(robbie.carryBox());	
    }

    @Test
    public void testPutBoxOnFullConveyer(){
	Robot robbie = new Robot();
	Box box1 = new Box(50);
	Box box2 = new Box(50);
	Box box3 = new Box(50);
	ConveyerBelt conv1 = new ConveyerBelt(100);
	robbie.take(box1);
	robbie.putOn(conv1);
      	robbie.take(box2);
	robbie.putOn(conv1);
	robbie.take(box3);
	robbie.putOn(conv1);
	assertSame(box3,robbie.getCarriedBox());
    }

    public static junit.framework.Test suite(){
	return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }
	
    
}
