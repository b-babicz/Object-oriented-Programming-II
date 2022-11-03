import javax.swing.*;
import java.awt.*;

public class CustomJpanel extends JPanel {

    public CustomJpanel() {

        setPreferredSize(new Dimension(800,800));

    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x=0;
        int y=0;
        int width = (int) getWidth()/4;
        int height = (int) getHeight()/4;
        g2d.setPaint(Color.GREEN);
        //g2d.fill(new Rectangle(100,100,100,100));
        for (int i=0; i<4; i++)
        {
            g2d.fillRect(x,y,width,height);
            x += width;
            y += height;
        }

    }
}
