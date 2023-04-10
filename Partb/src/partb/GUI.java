package partb;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class GUI {
	private static Color black;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frameobj=new JFrame();
		frameobj.setSize(500,500);
		
		GridLayout g1=new GridLayout(5,2);
		frameobj.setLayout(g1);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		JPanel p8=new JPanel();
		JPanel p9=new JPanel();
		JPanel p10=new JPanel();
		
		JLabel l1=new JLabel("name");
		JLabel l2=new JLabel("1d");
		JLabel l3=new JLabel("DOJ");
		JLabel l4=new JLabel("DOB");
		
		JTextField f1=new JTextField();
		JTextField f2=new JTextField();
		JTextField f3=new JTextField();
		JTextField f4=new JTextField();
		
		f1.setPreferredSize(new Dimension(200,30));
		f2.setPreferredSize(new Dimension(200,30));
		f3.setPreferredSize(new Dimension(200,30));
		f4.setPreferredSize(new Dimension(200,30));
		
		
		JButton b1=new JButton("submit");
		JButton b2=new JButton("reset");
		
		
		b1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File fileobj=new File("C:\\Users\\anjan\\OneDrive\\Desktop\\New Text Document.txt");
						try
						{
						FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
						
						System.out.println("\n NAME : " +f1.getText() +"\n" +"ID : "
						+f2.getText() +"\n" +"DOJ : " +f3.getText() +"\n" +"DOB : "+f4.getText() +"\n");
						
						
						fw.write("\n NAME : " +f1.getText() +"\n" +"ID : " +f2.getText()
						+"\n" +"DOJ : " +f3.getText() +"\n" +"DOB : "+f4.getText() +"\n");
						
						fw.close();
						}
						catch (IOException e1)
						{
						e1.printStackTrace();
						}

		}
			});
		
		b2.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						f1.setText(" ");
						f2.setText(null);
						f3.setText(null);
						f4.setText(null);
				}
					});
		
		
		p1.add(l1);
		p3.add(l2);
		p5.add(l3);
		p7.add(l4);
		
		
		p2.add(f1);
		p4.add(f2);
		p6.add(f3);
		p8.add(f4);
		
		
		p9.add(b1);
		p10.add(b2);
		
		frameobj.add(p1); //add panels to frames
		frameobj.add(p2);
		frameobj.add(p3);
		frameobj.add(p4);
		frameobj.add(p5);
		frameobj.add(p6);
		frameobj.add(p7);
		frameobj.add(p8);
		frameobj.add(p9);
		frameobj.add(p10);
		
		frameobj.setVisible(true);

	}

}
