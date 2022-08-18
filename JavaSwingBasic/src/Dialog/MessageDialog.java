package Dialog;

import javax.swing.*;

public class MessageDialog {
    public static void main(String[] args){

        // showMessageDialog Using 2 Perametter
        JOptionPane.showMessageDialog(null, "Worng Password");

		/*======================================
		Change Message Icon's
		JOptionPane.PLAIN_MESSAGE 		=> No Icon, IDE Return Value -1;
		JOptionPane.ERROR_MESSAGE 		=> No Icon, IDE Return Value 0;
		JOptionPane.INFORMATION_MESSAGE 	=> No Icon, IDE Return Value 1;
		JOptionPane.WARNING_MESSAGE 		=> No Icon, IDE Return Value 2;
		JOptionPane.QUESTION_MESSAGE 	=> No Icon, IDE Return Value 3;
		==================================================*/

        /***
         // showMessageDialog Using 4 Perametter
         JOptionPane.showMessageDialog(null, "Worng Alert With No-Icon", "Plain Message", JOptionPane.PLAIN_MESSAGE);
         JOptionPane.showMessageDialog(null, "Worng Alert With Error-Icon", "Error Message", JOptionPane.ERROR_MESSAGE);
         JOptionPane.showMessageDialog(null, "Worng Alert With Information-Icon", "Info Message", JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null, "Worng Alert With Warning-Icon", "Warning Message", JOptionPane.WARNING_MESSAGE);
         JOptionPane.showMessageDialog(null, "Worng Alert With Question-Icon", "Question Message", JOptionPane.QUESTION_MESSAGE);
         */
        JOptionPane.showMessageDialog(null, "Worng Alert With No-Icon", "Plain Message", -1);
        JOptionPane.showMessageDialog(null, "Worng Alert With Error-Icon", "Error Message", 0);
        JOptionPane.showMessageDialog(null, "Worng Alert With Information-Icon", "Info Message", 1);
        JOptionPane.showMessageDialog(null, "Worng Alert With Warning-Icon", "Warning Message", 2);
        JOptionPane.showMessageDialog(null, "Worng Alert With Question-Icon", "Question Message", 3);


    }
}
