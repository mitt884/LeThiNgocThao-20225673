package Lab01;
import javax.swing.JOptionPane;

public class Choosing {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, 
                "Le Thi Ngoc Thao 20225673 - Do you want to change to the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0);
    }    
}
