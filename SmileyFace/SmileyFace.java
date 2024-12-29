//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
      //head
      window.setColor(new Color(255, 235, 0));
      window.fillOval( 233, 115, 250, 250 );

      //took inspiration from https://emojis.wiki/nerd-face/
      
      //teeth
      window.setColor(Color.WHITE);
      window.fillRect(360,300,25,30);
      window.fillRect(330,300,25,30);
      //mouth
      window.setColor(Color.BLACK);
      window.drawArc(300, 275, 120, 28, 0, -180);
      window.drawArc(300, 272, 120, 30, 0, -180);
      window.drawArc(300, 273, 120, 30, 0, -180);
      window.drawArc(300, 274, 120, 30, 0, -180);
      //eyes
      window.fillArc(290, 200, 30, 35, 0, 360);
      window.fillArc(400, 200, 30, 35, 0, 360);
      //glasses
      window.drawArc(265, 190, 80, 30, 0, 180);
      window.drawArc(375, 190, 80, 30, 0, 180);
      window.drawArc(265, 160, 80, 90, 0, -180);
      window.drawArc(375, 160, 80, 90, 0, -180);
      window.drawLine(346,205,376,205);
      //freckles
      window.setColor(new Color(255,210,0));
      window.fillArc(260, 250, 15, 15, 0, 360);
      window.fillArc(275, 270, 15, 15, 0, 360);
      window.fillArc(245, 270, 15, 15, 0, 360);
      window.fillArc(440, 250, 15, 15, 0, 360);
      window.fillArc(455, 270, 15, 15, 0, 360);
      window.fillArc(425, 270, 15, 15, 0, 360);

      
   }
}