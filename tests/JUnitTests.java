/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */

import Handler.Handler;
import Main.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTests {
    private Point point = new Point();
    @Test
    public void BelongToArea_4And5_trueReturned(){
        boolean expected = true;
        point.setX(4);
        point.setY(5);
        boolean actual = Handler.checkBelongToArea(point.getX(),point.getY());
        assertEquals(expected, actual);
    }
    @Test
    public void BelongToArea_4And0_trueReturned() {
        boolean expected = true;
        point.setX(4);
        point.setY(0);
        boolean actual = Handler.checkBelongToArea(point.getX(), point.getY());
        assertEquals(expected, actual);
    }
    @Test
    public void BelongToArea_7And0_falseReturned() {
        boolean expected = false;
        point.setX(7);
        point.setY(0);
        boolean actual = Handler.checkBelongToArea(point.getX(),point.getY());
        assertEquals(expected, actual);
    }
    @Test
    public void BelongToArea_minus6AndMinus3_trueReturned() {
        boolean expected = true;
        point.setX(-6);
        point.setY(-3);
        boolean actual = Handler.checkBelongToArea(point.getX(),point.getY());
        assertEquals(expected, actual);
    }
}
