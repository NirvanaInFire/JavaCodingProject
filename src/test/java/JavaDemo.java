import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.sql.SQLOutput;

public class JavaDemo {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        FindEvenNumbersSolution sol = new FindEvenNumbersSolution();

        System.out.println(sol.FindNumbers(nums));

    }
}
