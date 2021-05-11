package Lab8.Test;

import java.awt.*;
import javax.swing.*;

public class Draw extends JFrame {
    public Draw() {
        super("Draw Picture");
    }

    public void paint(Graphics g) {
        super.paint(g); 

        g.setColor(Color.WHITE);
        g.drawString("fillRect", 135, 75);
        super.setBackground(Color.BLACK);
        g.clearRect(0, 0, 350, 300);

        g.fill3DRect(115, 205, 90, 90, false);
        g.drawString("", 135, 135);

        g.setColor(Color.WHITE);
        g.fillArc(80, 80, 150, 150, 0, -360);

        

        g.setColor(Color.ORANGE);
        g.fillOval(60, 130, 100, 55);

        g.setColor(Color.ORANGE);
        g.fillOval(160, 130, 100, 55);

        g.setColor(Color.ORANGE);
        g.fillOval(130, 55, 55, 100);

        g.setColor(Color.ORANGE);
        g.fillOval(130, 155, 55, 100);

        g.setColor(Color.YELLOW);
        g.fillArc(130, 130, 50, 50, 0, -360);

    }

    public static void main(String[] args) {
        Draw obj = new Draw();
        obj.setSize(350, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
    
}
