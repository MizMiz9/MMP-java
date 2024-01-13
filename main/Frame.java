package main;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame{
  private Test1 test1;
  
    Frame(){
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(420,500);
      this.setLayout(null);
      this.setVisible(true);

      this.add(test1);
    }
}
