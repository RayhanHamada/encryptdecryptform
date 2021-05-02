package form;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Encrypt Decrypt");
        frame.setContentPane(new EncryptDecryptForm().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(720, 640));
        frame.pack();
        frame.setVisible(true);
    }
}
