import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {

    public Okno() {

        initUI();
    }

    private void initUI() {

        add(new Plansza());

        setTitle("Rysunek");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Okno ex = new Okno();
                ex.setVisible(true);
            }
        });
    }
}
