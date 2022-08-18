package Dialog;

import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Write your name: ");
        JOptionPane.showMessageDialog(null, name+" Welcome to Advanced Java", "Welcome Box",1);
    }
}
