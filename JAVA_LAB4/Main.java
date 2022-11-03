
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Menu");

        JMenuItem opcja1 = new JMenuItem("Szachownica");
        JMenuItem opcja2 = new JMenuItem("Kalkulator");
        JMenuItem opcja3 = new JMenuItem("Logowanie");

        menu.add(opcja1);
        menu.add(opcja2);
        menu.add(opcja3);

        menuBar.add(menu);

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());


        JPanel szachownica = new CustomJpanel();
        main.add(szachownica, BorderLayout.CENTER);

        opcja1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BorderLayout layout = (BorderLayout) main.getLayout();
                main.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                main.add(new CustomJpanel(),BorderLayout.CENTER);
                frame.pack();
            }
        });

       opcja2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Pobranie Layoutu z Jpanelu main
                BorderLayout layout = (BorderLayout) main.getLayout();
//                Usunięcie Jpanelu w centum
                main.remove(layout.getLayoutComponent(BorderLayout.CENTER));
//                Dodanie kalkulatora w centrum Layoutu
                main.add(new Calculator(),BorderLayout.CENTER);
//                Renderowanie widoku
                frame.pack();
            }
        });

//        ,,,,,
        opcja3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BorderLayout layout = (BorderLayout) main.getLayout();
                main.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                main.add(new Form(),BorderLayout.CENTER);
                frame.pack();
            }
        });

        frame.add(menuBar, BorderLayout.NORTH);
        frame.add(main, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
