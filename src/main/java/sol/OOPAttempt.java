package sol;

import processing.core.PApplet;

public class OOPAttempt extends PApplet{
    public static final int ScreenWidth = 680;
    public static final int ScreenHeight = 480;
    public static final int Dia=10;
    int h1=0,h2=0,h3=0,h4=0;
    int width=100;

    public static void main(String[] args) {
        PApplet.main("sol.OOPAttempt",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(ScreenWidth,ScreenHeight);
    }

    @Override
    public void draw() {

        balls b1 = new balls(h1, width,Dia);
        balls b2 = new balls(h2,width+100,Dia);
        balls b3 = new balls(h3,width+200,Dia);
        balls b4 = new balls(h4,width+300,Dia);

        ellipse(b1.ballheight, b1.ballwidth, b1.balldiameter, b1.balldiameter);
        h1+=1;

        ellipse(b2.ballheight, b2.ballwidth, b2.balldiameter, b2.balldiameter);
        h2+=2;

        ellipse(b3.ballheight, b3.ballwidth, b3.balldiameter, b3.balldiameter);
        h3+=3;

        ellipse(b4.ballheight, b4.ballwidth, b4.balldiameter, b4.balldiameter);
        h4+=4;
    }
}
