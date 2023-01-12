import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ASimpleGUI1 extends JFrame implements ActionListener
{
    public ASimpleGUI1()
    {
        super ("A Simple GUI Application");  // calls JFrame's constructor
                                             // param = title of window

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        initScreen();

        setSize(400, 200);  // width and height of window
        setVisible(true);  // MUST ALWAYS BE THE LAST STATEMENT, makes window visible
    }

    public void initScreen() {
        JLabel lblTitle;

        lblTitle = new JLabel ("Name: ");
        add (lblTitle);


        JTextField tfName;
        tfName = new JTextField ();
        tfName.setColumns(10);
        // tfName.setHorizontalAlignment(JTextField.CENTER);
        /* other options: LEFT, CENTER, RIGHT, LEADING, TRAILING */
        add (tfName);


        JButton btnOk;
        btnOk = new JButton ("Ok");
        add (btnOk);

        btnOk.addActionListener(this);
    }

    public static void main(String[] args) {
        ASimpleGUI1 app = new ASimpleGUI1();  // starts the Java application
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn;

        // Changes button text from "Ok" to "Done"
        if (e.getActionCommand().equals("Ok"))  // "e" comes from ActionEvent args
        {   // when the command is Ok...

            // retrieve the source of this command
            btn = (JButton) e.getSource();
            btn.setText("Done");
        }
        // Reverts it back to "Ok" after "Done" is pressed (or if the button is pressed twice)
        else
        {   // retrieve the source of this command
            btn = (JButton) e.getSource();
            btn.setText("Ok");
        }
    }
}
