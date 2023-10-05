package programacionCreativa;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ejemplo1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSpiral(g);
    }

    private void drawSpiral(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        int numSegments = 100;
        double angleIncrement = 0.1;
        double radius = 5;

        for (int i = 0; i < numSegments; i++) {
            double angle = i * angleIncrement;
            double x = centerX + radius * Math.cos(angle);
            double y = centerY + radius * Math.sin(angle);
            Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);
            g2d.fill(circle);
            radius += 1; // Aumenta el radio para crear una espiral
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Espiral Creativa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ejemplo1());
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}