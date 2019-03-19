/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
/**
 *
 * @author DELL
 */
public class Calculator extends Frame implements ActionListener {
    TextField tf;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button c1;
    Button ans;
    Button dot;
    String s = "" , s1 , s2;
            int c;
    void init()
    {
        tf = new TextField();
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");
        five = new Button("5");
        six = new Button("6");
        seven = new Button("7");
        eight = new Button("8");
        nine = new Button("9");
        zero = new Button("0");
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        c1 = new Button("CLEAR");
        ans = new Button("ANS");
        dot = new Button(".");
        tf.setBounds(100,100,200,100);
        add(tf);
        one.setBounds(50,200,50,50);
        add(one);
        two.setBounds(150,200,50,50);
        add(two);
        three.setBounds(250,200,50,50);
        add(three);
        four.setBounds(50,300,50,50);
        add(four);
        five.setBounds(150,300,50,50);
        add(five);
        six.setBounds(250,300,50,50);
        add(six);
        seven.setBounds(50,400,50,50);
        add(seven);
        eight.setBounds(150,400,50,50);
        add(eight);
        nine.setBounds(250,400,50,50);
        add(nine);
        add.setBounds(350,200,50,50);
        add(add);
        sub.setBounds(350,300,50,50);
        add(sub);
        mul.setBounds(350,400,50,50);
        add(mul);
        div.setBounds(350,500,50,50);
        add(div);
        ans.setBounds(50,500,50,50);
        add(ans);
        zero.setBounds(150,500,50,50);
        add(zero);
        c1.setBounds(250,500,50,50);
        add(c1);
        dot.setBounds(450,500,50,50);
        add(dot);
        ans.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        c1.addActionListener(this);
        dot.addActionListener(this);
        setSize(1000,1000);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent ae)
    {
        
      if(ae.getActionCommand().equals("1"))
      {
          s = s+(ae.getActionCommand());
          tf.setText(s);
      }
      if(ae.getActionCommand().equals("2"))
           {
          s = s+(ae.getActionCommand());
          tf.setText(s);
           }
       if(ae.getActionCommand().equals("3"))
            {
          s = s+(ae.getActionCommand());
          tf.setText(s);
            }
        if(ae.getActionCommand().equals("4"))
             {
          s = s+(ae.getActionCommand());
          tf.setText(s);
             }
         if(ae.getActionCommand().equals("5"))
              {
          s = s+(ae.getActionCommand());
          tf.setText(s);
              }
          if(ae.getActionCommand().equals("6"))
               {
          s = s+(ae.getActionCommand());
          tf.setText(s);
               }
           if(ae.getActionCommand().equals("7"))
                {
          s = s+(ae.getActionCommand());
          tf.setText(s);
                }
            if(ae.getActionCommand().equals("8"))
                 {
          s = s+(ae.getActionCommand());
          tf.setText(s);
                 }
             if(ae.getActionCommand().equals("9"))
                  {
          s = s+(ae.getActionCommand());
          tf.setText(s);
                  }
              if(ae.getActionCommand().equals("0"))
                   {
          s = s+(ae.getActionCommand());
          tf.setText(s);
                   }
              if(ae.getActionCommand().equals("+"))
              {
                  s1 = s;
                  s = "";
                  c = 0;
                  tf.setText("+");
              }
              if(ae.getActionCommand().equals("-"))
              {
                  s1 = s;
                  s = "";
                  c = 1;
                  tf.setText("-");
              }
              if(ae.getActionCommand().equals("*"))
              {
                  s1 = s;
                  s = "";
                  c = 2;
                  tf.setText("*");
              }
              if(ae.getActionCommand().equals("/"))
              {
                  s1 = s;
                  s = "";
                  c = 3;
                  tf.setText("/");
              }
              if(ae.getActionCommand().equals("ANS"))
              {
                  double d = 0;
                  double a = Double.parseDouble(s1);
                  double b = Double.parseDouble(s);
                  if(c == 0)
                      d = a+b;
                  if(c == 1)
                      d = a-b;
                  if(c == 2)
                      d = a*b;
                  if(c == 3)
                      d = a/b;
                  s2 = Double.toString(d);
                  s = s2;
                  tf.setText(s2);
              }
              if(ae.getActionCommand().equals("CLEAR"))
              {
                  tf.setText("");
                  s = "";
              }
              if(ae.getActionCommand().equals("."))
              {
                  s = s+".";
                  tf.setText(s);
              }
    }
    
}
    /**
     * @param args the command line arguments
     */
class Test
{
    
    public static void main(String[] args) {
        Calculator ob = new Calculator();
        ob.init();
    }
    
}
