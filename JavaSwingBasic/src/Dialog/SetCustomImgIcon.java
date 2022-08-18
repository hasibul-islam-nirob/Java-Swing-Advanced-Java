package Dialog;

import javax.swing.*;

public class SetCustomImgIcon {
    public static void main(String[] args) {

        ImageIcon img = new ImageIcon("nirob.png");

        JOptionPane.showMessageDialog(null,"Set Custom Icom","Message", JOptionPane.PLAIN_MESSAGE, img);

    }
}
