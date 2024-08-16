import java.awt.event.*;
import javax.swing.*;

public class SwingPractice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        }
        
        );

        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
