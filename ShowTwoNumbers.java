import java.lang.reflect.Array;
import java.util.*;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ",
                "input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ",
                "input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showInputDialog(null, strNotification,
                "show two numbers",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
