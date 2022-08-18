package Dialog;

import javax.swing.*;

public class OptionDialog {

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you wanna exit ?", "Option Dialog", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION){
            System.out.println("Option is: Yes");
        }else{
            System.out.println("Option is: No");
        }

    }
}
