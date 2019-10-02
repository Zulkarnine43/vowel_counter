/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelcounterkeylistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class VowelCounterKeyListener extends JFrame {
  private Container c;
    private JLabel promptLabel,vowellabel,alabel,elabel,ilabel,olabel,ulabel;
    private JTextArea inputTextArea;
    private JScrollPane sp;
    
    int totalvowel=0;
    int letter_a=0;
    int letter_e=0;
    int letter_i=0;
    int letter_o=0;
    int letter_u=0;
    VowelCounterKeyListener(){
        initComponents();
    }
    public void initComponents(){
    
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Vowel Box demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        promptLabel=new JLabel("Enter the text:");
        promptLabel.setBounds(10, 20, 100, 30);
        c.add(promptLabel);
        
        inputTextArea=new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        //inputTextArea.setBounds(120, 20, 300, 100);
        //c.add(inputTextArea);
       // inputTextArea.setBackground(Color.white);
        
        
        sp=new JScrollPane(inputTextArea);
        sp.setBounds(110, 20, 450, 110);
        c.add(sp);
        
        vowellabel=new JLabel();
        vowellabel.setBounds(110,150,250,30);
        c.add(vowellabel);
        
         alabel=new JLabel();
        alabel.setBounds(110,190,150,30);
        c.add(alabel);
        
         elabel=new JLabel();
        elabel.setBounds(110,230,150,30);
        c.add(elabel);
        
         ilabel=new JLabel();
        ilabel.setBounds(110,270,150,30);
        c.add(ilabel);
        
         olabel=new JLabel();
        olabel.setBounds(110,310,150,30);
        c.add(olabel);
        
         ulabel=new JLabel();
        ulabel.setBounds(110,350,150,30);
        c.add(ulabel);
        
        
        inputTextArea.addKeyListener(new KeyListener(){
          @Override
          public void keyTyped(KeyEvent e) {
          }

          @Override
          public void keyPressed(KeyEvent e) {
              
              if(e.getSource()==inputTextArea){
                  if(e.VK_A==e.getKeyCode()){
                      letter_a++;
                      totalvowel++;
                      
                  }
                    else  if(e.VK_E==e.getKeyCode()){
                      letter_e++;
                      totalvowel++;
                      
                  }
                        else  if(e.VK_I==e.getKeyCode()){
                      letter_i++;
                      totalvowel++;
                      
                  }
                        else      if(e.VK_O==e.getKeyCode()){
                      letter_o++;
                      totalvowel++;
                      
                  }
                             else     if(e.VK_U==e.getKeyCode()){
                      letter_u++;
                      totalvowel++;
                 
                  }
              }
              vowellabel.setText("Total number of vowels:"+totalvowel);
              alabel.setText("Total number of a:"+letter_a);
              elabel.setText("Total number of e:"+letter_e);
              ilabel.setText("Total number of i:"+letter_i);
              olabel.setText("Total number of o:"+letter_o);
              ulabel.setText("Total number of u:"+letter_u);
          }

          @Override
          public void keyReleased(KeyEvent e) {
          }
        
        });
        
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VowelCounterKeyListener frame = new VowelCounterKeyListener();
        frame.setVisible(true);
    }
    
}
