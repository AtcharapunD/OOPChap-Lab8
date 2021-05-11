package Lab8.Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayBalloon extends JFrame implements ActionListener {
    private Button grow, shrink, left, right, up, down;
    private Balloon myBalloon;

    public PlayBalloon() {
        super("Display Balloon in JFrame");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        grow = new Button("Grow");
        grow.addActionListener(this);
        c.add(grow);
        shrink = new Button("Shrink");
        shrink.addActionListener(this);
        c.add(shrink);
        left = new Button("Left");
        left.addActionListener(this);
        c.add(left);
        right = new Button("Right");
        right.addActionListener(this);
        c.add(right);
        up = new Button("Up");
        up.addActionListener(this);
        c.add(up);
        down = new Button("Down");
        down.addActionListener(this);
        c.add(down);
        myBalloon = new Balloon();
        setSize(400, 400);
        setForeground(Color.BLUE);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == grow)
            myBalloon.grow();
        else if (event.getSource() == shrink)
            myBalloon.shrink();
        else if (event.getSource() == left)
            myBalloon.left();
        else if (event.getSource() == right)
            myBalloon.right();
        else if (event.getSource() == up)
            myBalloon.up();
        else if (event.getSource() == down)
            myBalloon.down();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        myBalloon.display(g);
    }

    public static void main(String[] args) {
        PlayBalloon test = new PlayBalloon();
        test.setSize(300, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}

/*
class Balloon {
    private int diameter = 10;
    private int x = 20, y = 50;
    Graphics g;

    public void display(Graphics g) {
        g.drawOval(x, y, diameter, diameter);
    }

    public void left() {
        x = x - 10;
    }

    public void right() {
        x = x + 10;
    }

    public void up() {
        y = y - 10;
    }

    public void down() {
        y = y + 10;
    }

    public void grow() {
        diameter = diameter + 5;
    }

    public void shrink() {
        diameter = diameter - 5;
    }
}
*/