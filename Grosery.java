import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grosery extends JFrame implements ActionListener {
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    JButton b1;
    JLabel l1;
    String total = "";

    public Grosery() {
        setTitle("Mauli Bazar");
        l1 = new JLabel("Grocery purchase system");
        l1.setBounds(100, 1, 300, 200);
        cb1 = new JCheckBox("Sugar :- 48 Rs/kg");
        cb1.setBounds(100, 200, 150, 20);
        cb2 = new JCheckBox("Dal :- 96 Rs/kg");
        cb2.setBounds(100, 250, 150, 20);
        cb3 = new JCheckBox("Rice:- 45 Rs/kg");
        cb3.setBounds(100, 300, 150, 20);
        cb4 = new JCheckBox("Tea Powder:65 Rs/kg");
        cb4.setBounds(100, 350, 150, 20);
        cb5 = new JCheckBox("Onion:- 34 Rs/kg");
        cb5.setBounds(100, 400, 150, 20);
        cb6 = new JCheckBox("Oil:- 102 Rs/kg");
        cb6.setBounds(100, 450, 150, 20);
        cb7 = new JCheckBox("Washing Powder:73 Rs/kg");
        cb7.setBounds(100, 500, 200, 20);
        b1 = new JButton("Order");
        b1.setBounds(100, 550, 80, 30);
        b1.addActionListener(this);
        add(l1);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);
        add(cb6);
        add(cb7);
        add(b1);

        setLayout(null); // We use null layout for precise positioning
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("F:\\miniproject/grosery.jfif");//background image path of the image 
        Image image = imageIcon.getImage(); // Transform it 
        Image newImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH); // Scale it
        imageIcon = new ImageIcon(newImage); // Transform it back
        JLabel backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());
        add(backgroundLabel);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Sugar"));
            amount = amount + 48 * q;
            msg = msg + "Sugar quantity : " + q + "\n";
            total = "" + 48 * q + "\n";
        }

        if (cb2.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Dal"));
            amount = amount + 96 * q;
            msg = msg + "Dal quantity : " + q + "\n";
            total = "" + 96 * q + "\n";
        }
        if (cb3.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Rice"));
            amount = amount + 45 * q;
            msg = msg + "Rice quantity : " + q + "\n";
            total = "" + 45 * q + "\n";
        }
        if (cb4.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Tea Powder"));
            amount = amount + 65 * q;
            msg = msg + "Tea Powder quantity : " + q + "\n";
            total = "" + 65 * q + "\n";
        }
        if (cb5.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Onion"));
            amount = amount + 34 * q;
            msg = msg + "Onion quantity : " + q + "\n";
            total = "" + 34 * q + "\n";
        }
        if (cb6.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Oil"));
            amount = amount + 102 * q;
            msg = msg + "Oil quantity : " + q + "\n";
            total = "" + 102 * q + "\n";
        }
        if (cb7.isSelected()) {
            int q = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter quantity for Washing Powder"));
            amount = amount + 73 * q;
            msg = msg + "Washing Powder quantity : " + q + "\n";
            total = "" + 73 * q + "\n";
        }
        msg += "Total : " + amount + "\n";
        JOptionPane.showMessageDialog(this, msg);
        JOptionPane.showMessageDialog(this, "Successfully ordered", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String a[]) {
        SwingUtilities.invokeLater(() -> {
            new Grosery();
        });
    }
}

