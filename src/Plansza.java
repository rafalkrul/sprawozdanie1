import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

class Plansza extends JPanel {


    static BufferedImage zdj,zdj1,zdj2;

    public Plansza(){ initMain();}

    private void initMain(){

        zdj = new Zdjecia().getZdjecia("słoneczko.jpg");
        zdj1 = new Zdjecia().getZdjecia("chmurka.png");
        zdj2 = new Zdjecia().getZdjecia("chmurka2.png");
        setBackground(Color.WHITE);
    }


    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;


        //chmurki i słoczenka

        g.drawImage(zdj,750,50,null);
        g.drawImage(zdj1,100,50,null);
        g.drawImage(zdj2,500,50,null);

        // dom

        g2d.drawRect(649,399,301,301);
        g2d.setColor(new Color(156, 153, 149));
        g2d.fillRect(650,400,300,300);




        g2d.setColor(Color.black);
        g2d.fillRect(770,620,50,80);
        g2d.setColor(new Color(215, 224, 213));
        g2d.fillRect(680,500,70,70);
        g2d.fillRect(850,500,70,70);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawLine(715,500,715,570);
        g2d.drawLine(885,500,885,570);
        g2d.drawLine(680,535,750,535);
        g2d.drawLine(850,535,920,535);

        int[] xpoints = {649,800,950};
        int[] ypoints = {399,250,399};


        g2d.setColor(new Color(168, 121, 50));
        g2d.fillPolygon(xpoints,ypoints,3);

        //trawa

        g2d.setColor(new Color(99, 168, 50));
        g2d.fillRect(0,701,1000,300);


        //drzewo

        g2d.setColor(new Color(139, 69, 19));
        g2d.fillRect(150,550,50,151);
        g2d.setColor(new Color(62, 168, 50));

        g2d.fillOval(90, 500, 100, 85);
        g2d.fillOval(100, 440, 100, 100);
        g2d.fillOval(150, 450, 100, 100);
        g2d.fillOval(160, 500, 100, 85);

        g2d.setColor(Color.RED);
        g2d.fillOval(110,530,25,25);
        g2d.fillOval(150,530,25,25);
        g2d.fillOval(120,470,25,25);
        g2d.fillOval(125,500,25,25);
        g2d.fillOval(210,530,25,25);
        g2d.fillOval(165,500,25,25);
        g2d.fillOval(205,470,25,25);
        g2d.fillOval(215,500,25,25);


        //płot

        g2d.setColor(new Color(139, 69, 19));
        int x1 = 630;
        int y1 = 590;
        int x2 = 649;
        int y2 = 620;
        int x3 = x1;
        int y3 = 700;

        for(int i = 0; i < 10; i++){
            g2d.drawLine(x1,y1,x2,y2);

            x1 -=20;
            x2 -=20;


        }
        for(int j = 0; j < 10; j++)
        {
            g2d.drawLine(x3,y1,x3,y3);
            x3 -=20;

        }







    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}


