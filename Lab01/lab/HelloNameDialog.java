package Lab01.lab;

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Le Thi Ngoc Thao - 20225673 - Please enter yout name");
        JOptionPane.showMessageDialog(null, "Toi la Le Thi Ngoc Thao. HI " + result + "!");
        System.exit(0);
    }
}