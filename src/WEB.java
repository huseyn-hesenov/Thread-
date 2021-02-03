import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WEB {
    private JButton button1;
    private JTextField textField1;

    public WEB() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setName("huseyn");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("WEB");
        frame.setContentPane(new WEB().textField1);
    }
}
