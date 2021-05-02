package form;

import javax.swing.*;

public class EncryptDecryptForm {
    private JTextField txtString;
    private JButton btnEncrypt;
    private JButton btnDecrypt;
    private JTextField txtKey;
    private JLabel lblString;
    private JLabel lblKey;
    private JPanel panel;
    private JLabel lblHasil;

    public EncryptDecryptForm() {
        btnEncrypt.addActionListener(e -> {
            String encrypted = EncryptDecrypt.encrypt(txtString.getText(), Integer.parseInt(txtKey.getText()));
            lblHasil.setText("Hasil: " + encrypted);
        });

        btnDecrypt.addActionListener(e -> {
            String decrypted = EncryptDecrypt.decrypt(txtString.getText(), Integer.parseInt(txtKey.getText()));
            lblHasil.setText("Hasil: " + decrypted);
        });
    }

    public JTextField getTxtString() {
        return txtString;
    }

    public JButton getBtnEncrypt() {
        return btnEncrypt;
    }

    public JButton getBtnDecrypt() {
        return btnDecrypt;
    }

    public JTextField getTxtKey() {
        return txtKey;
    }

    public JLabel getLblString() {
        return lblString;
    }

    public JLabel getLblKey() {
        return lblKey;
    }

    public JPanel getPanel() {
        return panel;
    }
}
