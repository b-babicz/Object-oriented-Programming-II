import javax.swing.*;
import java.awt.*;

public class Dydaktyka extends JPanel{

    public void paintComponent (Graphics g)
    {
        int width = (int) getWidth()/8;
        int height = (int) getHeight()/8;
        int x = 0;
        int y = 0;

        g.setColor(Color.BLACK);


        for (int i=0; i<4; i++)
        {
            g.drawRect(x,y,width,height);
            x += width;
            y += height;
            g.fillOval(x,y,width,height);
            x += width;
            y += height;
        }


    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Nowa formatka!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(100,100,320,240);
        /*JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton northbutton = new JButton("Północ");
        JButton southbutton = new JButton("Południe");
        JButton westbutton = new JButton("Zachód");
        JButton eastbutton = new JButton("Wschód");

        buttonPanel.add(northbutton, BorderLayout.NORTH);
        buttonPanel.add(southbutton, BorderLayout.SOUTH);
        buttonPanel.add(westbutton, BorderLayout.WEST);
        buttonPanel.add(eastbutton, BorderLayout.EAST);


        frame.add(buttonPanel, BorderLayout.CENTER);*/

        frame.add(new Dydaktyka());
        frame.setSize(300,200);
        frame.pack();
        frame.setVisible(true);
    }

}
