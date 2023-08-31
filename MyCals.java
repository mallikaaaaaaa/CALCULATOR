import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCals implements ActionListener
{
    JFrame f;  //frame reference
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bdel,bdec,bclr;
    static double a=0,b=0,result=0;
    static  int operator=0;
    String s;


    MyCals()   //constructor
    {
       f=new JFrame("CALCULATOR");
       f.setLayout(null);
       f.setResizable(true);
       f.setBounds(20,20,600,700);
       Font font=new Font("Arial", Font.BOLD,20);



       t=new JTextField();
       t.setFont(font);
       t.setBackground(Color.darkGray);
       t.setForeground(Color.white);
       t.setBounds(40,40,200,50);

        b1=new JButton("1");
        b1.setBackground(Color.cyan);
        b2=new JButton("2");
        b2.setBackground(Color.cyan);
        b3=new JButton("3");
        b3.setBackground(Color.cyan);
        b4=new JButton("4");
        b4.setBackground(Color.cyan);
        b5=new JButton("5");
        b5.setBackground(Color.cyan);
        b6=new JButton("6");
        b6.setBackground(Color.cyan);
        b7=new JButton("7");
        b7.setBackground(Color.cyan);
        b8=new JButton("8");
        b8.setBackground(Color.cyan);
        b9=new JButton("9");
        b9.setBackground(Color.cyan);
        b0=new JButton("0");
        b0.setBackground(Color.cyan);
        badd=new JButton("+");
        badd.setFont(font);
        badd.setBackground(Color.LIGHT_GRAY);
        bsub=new JButton("-");
        bsub.setFont(font);
        bsub.setBackground(Color.LIGHT_GRAY);
        bmul=new JButton("*");
        bmul.setFont(font);
        bmul.setBackground(Color.LIGHT_GRAY);
        bdiv=new JButton("/");
        bdiv.setFont(font);
        bdiv.setBackground(Color.LIGHT_GRAY);
        beq=new JButton("=");
        beq.setFont(font);
        beq.setBackground(Color.LIGHT_GRAY);
        bdel=new JButton("Delete");
        bdel.setBackground(Color.LIGHT_GRAY);
        bdel.setFont(font);
        bdec=new JButton(".");
        bdec.setBackground(Color.LIGHT_GRAY);
        bdec.setFont(font);
        bclr=new JButton("Clear");
        bclr.setBackground(Color.LIGHT_GRAY);
        bclr.setFont(font);

        b7.setBounds(40,100,50,40); //set button bounds
        b8.setBounds(90,100,50,40);
        b9.setBounds(140,100,50,40);
        bdiv.setBounds(190,100,50,40);

        b4.setBounds(40,140,50,40); //set button bounds
        b5.setBounds(90,140,50,40);
        b6.setBounds(140,140,50,40);
        bmul.setBounds(190,140,50,40);

        b1.setBounds(40,180,50,40); //set button bounds
        b2.setBounds(90,180,50,40);
        b3.setBounds(140,180,50,40);
        bsub.setBounds(190,180,50,40);

        b0.setBounds(40,220,50,40); //set button bounds
        bdec.setBounds(90,220,50,40);
        beq.setBounds(140,220,50,40);
        badd.setBounds(190,220,50,40);

        bdel.setBounds(40,260,100,40);
        bclr.setBounds(140,260,100,40);

        f.setVisible(true);

          //ADD ACTION LISTENER
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        beq.addActionListener(this);
        bdec.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);



        f.add(t);   //textfield add in frame
       f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(beq);
        f.add(bdel);
        f.add(bdec);
        f.add(bclr);



    }
    public static void main (String[] args)//MAIN METHOD
    {
        new MyCals();

    }

    @Override
    public void actionPerformed(ActionEvent e) //ACTION PREFORMED METHOD
    {
        // for clare button
        if(e.getSource()==bclr)
        {
            t.setText("");
        }
        //for delete button

        if(e.getSource()==bdel)
        {
           String s=t.getText();
           t.setText("");
           for(int i=0;i<s.length()-1;i++)
           {
               t.setText(t.getText()+s.charAt(i));
           }
        }




        if(e.getSource()==b1)     // for 1 click
        {
            t.setText(t.getText().concat("1"));
        }

        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
        }

        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdec)
        {
            t.setText(t.getText().concat("."));
        }

        // for operation button

        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }

        //for click om equal button

        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
            switch( operator)
            {
                case 1:result=a+b;
                break;
                case 2:result=a-b;
                break;
                case 3:result=a*b;
                break;
                case 4:result=a/b;
                break;
            }

            t.setText(""+result);
        }



    }
}
