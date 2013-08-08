package Tan4ous;

/**
 * Created with IntelliJ IDEA.
 * User: jem
 * Date: 08.08.13
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class Point {
        static String ENOUGH="enough", NOT_ENOUGH="not_enough";
        public Double enough;

    public Point (int enough) {
        enough = 20;
    }

    public String checkOutSum(Double sum) {
        if (sum > enough) {
            return ENOUGH;
        } else {
            return NOT_ENOUGH;
        }
     }
}
