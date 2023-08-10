import java.util.*;

public class PracticeQuestions {
    public static final double EPSILON = 0.05;
    private String ready;

    public static void main(String[] args) {
        
     }

     public static void myFunc(int num, int[] stuff) {
        for (int i=0; i<stuff.length; i++) {
            if (i % 2 == 0) {
                stuff[i] = num;
            } else {
                num = stuff[i];
            }
        }
     }

     public static boolean withinEpsilonOfRangeAway(double x, double y, double range) {
        return false;
     }
}