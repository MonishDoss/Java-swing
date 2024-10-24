import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;    
import javax.swing.*;
public class ATM2 extends JFrame 
{ 
  JLabel l1,l2,l3,l4,l5,l6,l7;  
  JTextField t1,t2,t3,t4,t5,t6;
  JPasswordField p; 
  JButton b1,b2,b3,b4,b5;  
  ATM2()
    {
      JFrame a=new JFrame("ATM");

      l1=new JLabel("Wellcome to 'IOB ATM' ");  
      l1.setBounds(40,10, 200,30);  

      l2=new JLabel("Name:");  
      l2.setBounds(10,40, 200,30);
      t1=new JTextField();  
      t1.setBounds(50,45, 100,20); 
   
     JLabel l3=new JLabel("Pin:");    
     l3.setBounds(20,68, 50,30); 
     JPasswordField p=new JPasswordField(); 
     p.setBounds(50,75,100,20);
     p.setEchoChar('*');
            JCheckBox c1 = new JCheckBox("Show");  
            c1.setBounds(160,63, 140,50);  
     c1.addActionListener(new ActionListener()  
      {  
         public void actionPerformed(ActionEvent e1)  
          {      
                if(c1.isSelected()){
              //when JCheckBox is checked you can see the password
              p.setEchoChar((char)0);
              //change the JCheckBox text
              c1.setText("Hide");
          }
          else{
              //when JCheckBox is unchecked you can't see the password
              p.setEchoChar('*');
              //change the JCheckBox text
              c1.setText("Show");
          }           
           }
        });

    JButton b1=new JButton("Login");  
    b1.setBounds(60,150,80,30);          


    a.add(l1); 
    a.add(l2); 
    a.add(t1); 
    a.add(l3); 
    a.add(p);
    a.add(b1);
    a.add(c1);


       b1.addActionListener(new ActionListener()  
         {  
            public void actionPerformed(ActionEvent e1)  
             {
              String s=p.getText();
              int i=Integer.parseInt(s);  
              if(i==2005)
               {
                JButton b2=new JButton("Deposit");  
                b2.setBounds(10,50,80,30);      
      
                JButton b3=new JButton("Withdraw");  
                b3.setBounds(110,50,100,30);      

                JButton b4=new JButton("EXIT");  
                b4.setBounds(70,150,70,30);  

                b4.addActionListener(new ActionListener()  
                  {  
                    public void actionPerformed(ActionEvent e1)  
                      {  
                            a.setVisible(false); 
                            String E1=t1.getText();  
                            System.out.println("THANK YOU For VISITEING ATM:-");    
                            System.out.println("Name:"+E1);  
                      }  
                 });

                JButton b44=new JButton("Balance");  
                b44.setBounds(70,90,110,30);  

                b44.addActionListener(new ActionListener()  
                  {  
                    public void actionPerformed(ActionEvent e1)  
                      {  
                              JLabel qw;  
                              JTextField as;

                         qw=new JLabel("Amount:");  
                        qw.setBounds(10,60, 200,30);
                        as=new JTextField("3000");  
                        as.setBounds(60,65, 100,20); 

                JButton q=new JButton("EXIT");  
                q.setBounds(70,150,70,30);  

                 a.add(q);
                 a.add(qw);
                 a.add(as);
                        b2.setVisible(false);
                        b3.setVisible(false);
                        b4.setVisible(false); 
                        b44.setVisible(false); 
                        //c1.setVisible(false);
                q.addActionListener(new ActionListener()  
                  {  
                    public void actionPerformed(ActionEvent e1)  
                      {  
                            a.setVisible(false); 
                            String E1=t1.getText();  
                            System.out.println("BILL For BALANCE:-");    
                            System.out.println("Name:"+E1);  
                            System.out.println("Balance:3000");  
                      }  
                 });

                      }  
                 });


                 a.add(b2);
                 a.add(b3);
                a.add(b4);
                a.add(b44);

                 l1.setVisible(false);
                 l2.setVisible(false);    
                 t1.setVisible(false);  
                 l3.setVisible(false);  
                 p.setVisible(false);  
                b1.setVisible(false); 
               c1.setVisible(false);

                 b2.addActionListener(new ActionListener()  
                   {  
                    public void actionPerformed(ActionEvent e1)  
                      {
                         l6=new JLabel("Amount:");  
                        l6.setBounds(10,60, 200,30);
                        t5=new JTextField();  
                        t5.setBounds(60,65, 100,20);

                        JButton b6=new JButton("view balance");  
                        b6.setBounds(70,90,150,30);  

                        a.add(l6);
                        a.add(t5);
                       a.add(b6);

                        b2.setVisible(false);
                        b3.setVisible(false);
                        b4.setVisible(false); 
                        b44.setVisible(false); 


                         b6.addActionListener(new ActionListener()  
                            {  
                               public void actionPerformed(ActionEvent e2)  
                                 {  
                                    String s2=t5.getText();  
                                   int i2=Integer.parseInt(s2); 
 
                                   int y,y1;
                                    y=3000;

                                    y1=y+i2;

                                   l7=new JLabel("balance Amount:");  
                                   l7.setBounds(10,60, 200,30);

                                   t6=new JTextField();  
                                   t6.setBounds(110,65, 100,20); 
                                    String result=String.valueOf(y1);  
                                    t6.setText(result); 
 
                JButton q1=new JButton("EXIT");  
                q1.setBounds(70,150,70,30);  
                  a.add(q1);

                q1.addActionListener(new ActionListener()  
                  {  
                    public void actionPerformed(ActionEvent e1)  
                      {  
                            a.setVisible(false); 
                            String E1=t1.getText();  
                            System.out.println("BILL For DEPOSITE:-");    
                            System.out.println("Name:"+E1);                         
                           System.out.println("Intial amount:30000");
                          System.out.println("Final amount:"+y1);
                      }  
                 });

                                    l6.setVisible(false);
                                    t5.setVisible(false);

                                    a.add(l7);
                                    a.add(t6);

                                    a.add(q1);
                                    l6.setVisible(false);
                                    t5.setVisible(false);
                                    b6.setVisible(false);


                                   }  //deposit bal
                                 });//deposit bal 

                                }  //deposit 
                            });//deposit 
                 b3.addActionListener(new ActionListener()  
                   {  
                    public void actionPerformed(ActionEvent e1)  
                      {
                         l4=new JLabel("Amount:");  
                        l4.setBounds(10,60, 200,30);
                        t3=new JTextField();  
                        t3.setBounds(60,65, 100,20); 

                        JButton b5=new JButton("view balance");  
                        b5.setBounds(70,90,150,30); 

                        a.add(l4);
                        a.add(t3);
                        a.add(b5);

                        b2.setVisible(false);
                        b3.setVisible(false);
                        b4.setVisible(false); 
                        b44.setVisible(false); 

                         b5.addActionListener(new ActionListener()  
                            {  
                               public void actionPerformed(ActionEvent e2)  
                                 {  
                                    String s1=t3.getText();  
                                   int i1=Integer.parseInt(s1); 
 
                                   int z,z1;
                                    z=3000;

                                    z1=z-i1;

                                 if(z1>=1000)
                                    {
                                   l5=new JLabel("balance Amount:");  
                                   l5.setBounds(10,60, 200,30);

                                   t4=new JTextField();  
                                   t4.setBounds(110,65, 100,20); 
                                    String result=String.valueOf(z1);  
                                    t4.setText(result);  
                                     
                JButton q2=new JButton("EXIT");  
                q2.setBounds(70,150,70,30);  

                 a.add(q2);
                    
                q2.addActionListener(new ActionListener()  
                  {  
                    public void actionPerformed(ActionEvent e1)  
                      {  
                            a.setVisible(false); 
                            String E1=t1.getText();  
                            System.out.println("BILL For WITHDRAW:-");    
                            System.out.println("Name:"+E1);                         
                           System.out.println("Intial amount:30000");
                          System.out.println("Final amount:"+z1);
                      }  
                 });

                                    l4.setVisible(false);
                                    t3.setVisible(false);

                                    a.add(l5);
                                    a.add(t4);
                                    a.add(q2);

                                    l4.setVisible(false);
                                    t3.setVisible(false);
                                    b5.setVisible(false);
     }
         else
         {
          JOptionPane.showMessageDialog(b5,"Your balance wants to matain above 1000");  
          }
                                   }  //wit bal
                                 });//wit bal 
                               }//wit
                            });//wit

             }//if
             else
               {
                 JOptionPane.showMessageDialog(b1,"Wrong password...!");  
               }
          }//login
        });//login

    a.setSize(300,300);  
    a.setLayout(null);  
    a.setVisible(true); 
    }
  public static void main(String[] args)
   {
     new  ATM2();
   }
}