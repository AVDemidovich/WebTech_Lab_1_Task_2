package Handler;

/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */
public class Handler {
    public  static boolean checkBelongToArea(double x,double y) {
        if ( (x>=-6 && x<=6 && y>=-3 && y<=0) || (y>=0 && y<=5 && x>=-4 && x<=4)  )
            return true;
        else
            return  false;
    }
}
