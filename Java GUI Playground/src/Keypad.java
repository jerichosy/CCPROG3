import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keypad extends JFrame implements ActionListener {
    JTextField textField = new JTextField();

    public static void main(String[] args) {
        Keypad keypad = new Keypad();
    }

    public Keypad() {
        super("Keypad");

        setLayout(new FlowLayout());
        initScreen();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 200);
        setVisible(true);
    }

    private void initScreen() {
        textField.setColumns(15);
        add(textField);

//        JPanel firstRow = new JPanel(new BorderLayout());
//        JPanel secondRow = new JPanel(new BorderLayout());
//        JPanel thirdRow = new JPanel(new BorderLayout());
//        JPanel fourthRow = new JPanel(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4, 0));
        add(panel);

        // GridLayout g = new GridLayout(4, 3);

        // Will the ff. work in a for loop?
        JButton btn;
        btn = new JButton("7");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("8");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("9");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("4");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("5");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("6");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("1");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("2");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("3");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("0");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton(".");
        btn.addActionListener(this);
        panel.add(btn);

        btn = new JButton("C");
        btn.addActionListener(this);
        panel.add(btn);
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        if (isNumeric(e.getActionCommand()) || e.getActionCommand().equals("."))
            textField.setText(textField.getText() + e.getActionCommand());
        else
            textField.setText("");
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        }   catch (NumberFormatException e) {
            return false;
        }
    }
}
