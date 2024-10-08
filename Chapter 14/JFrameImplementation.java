import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrameImplementation {
    private JButton button;
    public static void main(String[] args) {
        JFrameImplementation gui = new JFrameImplementation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
        button = new JButton("A");
        button.addActionListener(new ButtonListener());
        frame.getContentPane().add(
        BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (button.getText().equals("A")) {
            
            button.setText("B");
        } 
        else {
            
            button.setText("A");
        }
    }
}
}