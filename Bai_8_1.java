import javax.swing.JOptionPane;

public class Bai_8_1{
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class tikcet?");
        JOptionPane.showInputDialog(null, "Youve choosen: "
                    + (option == JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}
