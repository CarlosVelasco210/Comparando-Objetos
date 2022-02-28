/*
 */
package Tarea3;
import junit.framework.Assert;
import org.junit.Test;
/**
 *
 * @author Windows
 */
public class MainTest {
    @Test
    public void CircleTest(){
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(8.6);
        int resultCircles = circle1.compareTo(circle2);
        Assert.assertEquals(0, resultCircles);
    }
    @Test
    public void RectangleTest(){
        Rectangle rec1 = new Rectangle(18.6,47.9);
        Rectangle rec2 = new Rectangle(18.6,47.9);
        int resultRecs = rec1.compareTo(rec2);
        Assert.assertEquals(0, resultRecs);
    }
    
}

