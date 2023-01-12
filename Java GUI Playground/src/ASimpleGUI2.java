import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ASimpleGUI2 extends JFrame implements ActionListener {
    JLabel lblDisplay = new JLabel();

    public static void main(String[] args) {
        ASimpleGUI2 app = new ASimpleGUI2();
    }

    public ASimpleGUI2() {
        super("This is an app");

        setLayout(new FlowLayout());
        initScreen();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    private void initScreen() {
        // JPanel fieldPanel = new JPanel(new BorderLayout());
        // add(fieldPanel);

        JLabel lblTitle;
        JTextField tfName;
        JButton btnOk;

        lblTitle = new JLabel("Name: ");

        tfName = new JTextField();
        tfName.setColumns(10);
        tfName.setHorizontalAlignment(JTextField.RIGHT);

        btnOk = new JButton("OK");
        btnOk.addActionListener(this);

        JPanel panel = new JPanel(new BorderLayout());

        add(lblTitle, BorderLayout.WEST);
        add(tfName, BorderLayout.CENTER);
        add(btnOk, BorderLayout.EAST);


        // add(fieldPanel);
        add(panel);

        JButton btn;
        btn = new JButton("Left");
        btn.addActionListener(this);
        panel.add(btn, BorderLayout.WEST);

        btn = new JButton("Right");
        btn.addActionListener(this);
        panel.add(btn, BorderLayout.EAST);

        btn = new JButton("Center");
        btn.addActionListener(this);
        panel.add(btn, BorderLayout.CENTER);

        panel.add(lblDisplay, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn;
        // JLabel lbl;

        if (e.getActionCommand().equals("OK")) {
            btn = (JButton) e.getSource();
            btn.setText("Done");
        }

        else if (e.getActionCommand().equals("Left")) {
            // lbl = (JLabel) e.getSource();
            lblDisplay.setText("Left");  // Change bottom text
            lblDisplay.setHorizontalAlignment(JLabel.LEFT);  // Change alignment
        }
        else if (e.getActionCommand().equals("Center")) {
            lblDisplay.setText("Center");  // Change bottom text
            lblDisplay.setHorizontalAlignment(JLabel.CENTER);  // Change alignment
        }
        else if (e.getActionCommand().equals("Right")) {
            lblDisplay.setText("Right");  // Change bottom text
            lblDisplay.setHorizontalAlignment(JLabel.RIGHT);  // Change alignment
        }
    }
}
