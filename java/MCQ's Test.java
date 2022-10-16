import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Test  
{

	Container c;
	JPanel[] panels=new JPanel[10];
	JLabel label;
	JFrame testFrame;
	JButton[] buttons=new JButton[10];
	JButton submitbtn,closebtn;	
	JRadioButton[] radiobtns=new JRadioButton[40];
	ButtonGroup btnGroup;
	
	
	public Test()
	{
		/****************Frame****************/
		testFrame =new JFrame("Java Test");
		testFrame.setBounds(200,70,800,550);
		testFrame.setVisible(true);
		testFrame.setLayout(null);
		c=testFrame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.LIGHT_GRAY);
		testFrame.setResizable(false);
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*******************panels*******************/
		panels[0]=new JPanel();
		panels[0].setLayout(null);
		panels[0].setBounds(50,150,700,300);
		c.add(panels[0]);
		
		panels[1]=new JPanel();
		panels[1].setLayout(null);
		panels[1].setBounds(50,150,700,300);
		c.add(panels[1]);
		
		panels[2]=new JPanel();
		panels[2].setLayout(null);
		panels[2].setBounds(50,150,700,300);
		c.add(panels[2]);
		
		panels[3]=new JPanel();
		panels[3].setLayout(null);
		panels[3].setBounds(50,150,700,300);
		c.add(panels[3]);
		
		panels[4]=new JPanel();
		panels[4].setLayout(null);
		panels[4].setBounds(50,150,700,300);
		c.add(panels[4]);
		
		panels[5]=new JPanel();
		panels[5].setLayout(null);
		panels[5].setBounds(50,150,700,300);
		c.add(panels[5]);
		
		panels[6]=new JPanel();
		panels[6].setLayout(null);
		panels[6].setBounds(50,150,700,300);
		c.add(panels[6]);
		
		panels[7]=new JPanel();
		panels[7].setLayout(null);
		panels[7].setBounds(50,150,700,300);
		c.add(panels[7]);
		
		panels[8]=new JPanel();
		panels[8].setLayout(null);
		panels[8].setBounds(50,150,700,300);
		c.add(panels[8]);
		
		panels[9]=new JPanel();
		panels[9].setLayout(null);
		panels[9].setBounds(50,150,700,300);
		c.add(panels[9]);
		
		/************Buttons and their ActionListener*/
		
		buttons[0]=new JButton("1");
		testFrame.add(buttons[0]);
		buttons[0].setBounds(120, 70, 50, 30);
		buttons[0].setVisible(true);
		
		radiobtns[0]=new JRadioButton("Object References");
		radiobtns[0].setBounds(60,120,200,20);
		radiobtns[0].setFont(new Font(null, Font.PLAIN, 15));
		
		radiobtns[1]=new JRadioButton("Primitive data type");
		radiobtns[1].setBounds(60,200,250,20);
		radiobtns[1].setFont(new Font(null, Font.PLAIN, 15));
		
		radiobtns[2]=new JRadioButton("Objects");
		radiobtns[2].setBounds(350,120,150,20);
		radiobtns[2].setFont(new Font(null, Font.PLAIN, 15));
		
		radiobtns[3]=new JRadioButton("Non of above");
		radiobtns[3].setBounds(350,200,150,20);
		radiobtns[3].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[0].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[0].setVisible(true);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				
				
				label=new JLabel();
				label.setText("In java arrays are");
				label.setBounds(60,40,400,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[0].add(label);
				
				panels[0].add(radiobtns[0]);
				panels[0].add(radiobtns[1]);
				panels[0].add(radiobtns[2]);
				panels[0].add(radiobtns[3]);
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[0]);
				btnGroup.add(radiobtns[1]);
				btnGroup.add(radiobtns[2]);
				btnGroup.add(radiobtns[3]);
			}
			
		});
		
		buttons[1]=new JButton("2");
		testFrame.add(buttons[1]);
		buttons[1].setBounds(170, 70, 50, 30);
		buttons[1].setVisible(true);
		
		radiobtns[4]=new JRadioButton("Copy of array");
		radiobtns[4].setBounds(60,120,200,20);
		radiobtns[4].setFont(new Font(null, Font.PLAIN, 15));
		
		radiobtns[5]=new JRadioButton("The reference of the array");
		radiobtns[5].setBounds(60,200,300,20);
		radiobtns[5].setFont(new Font(null, Font.PLAIN, 15));
		
		radiobtns[6]=new JRadioButton("The length of array");
		radiobtns[6].setBounds(400,120,250,20);
		radiobtns[6].setFont(new Font(null, Font.PLAIN, 15));
		
		radiobtns[7]=new JRadioButton("Copy of first element");
		radiobtns[7].setBounds(400,200,250,20);
		radiobtns[7].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[1].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				
				panels[1].setVisible(true);
				panels[0].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("<Html>When you pass an array to method the method receives _________</HTML>");
				label.setBounds(60,40,500,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[1].add(label);
				
				panels[1].add(radiobtns[4]);
				panels[1].add(radiobtns[5]);
				panels[1].add(radiobtns[6]);
				panels[1].add(radiobtns[7]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[4]);
				btnGroup.add(radiobtns[5]);
				btnGroup.add(radiobtns[6]);
				btnGroup.add(radiobtns[7]);
			}
		});
		
		buttons[2]=new JButton("3");
		testFrame.add(buttons[2]);
		buttons[2].setBounds(220, 70, 50, 30);
		buttons[2].setVisible(true);
		
		radiobtns[8]=new JRadioButton("int");
		radiobtns[8].setBounds(60,120,200,20);
		radiobtns[8].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[9]=new JRadioButton("void");
		radiobtns[9].setBounds(60,200,300,20);
		radiobtns[9].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[10]=new JRadioButton("double");
		radiobtns[10].setBounds(400,120,250,20);
		radiobtns[10].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[11]=new JRadioButton("None of above");
		radiobtns[11].setBounds(400,200,250,20);
		radiobtns[11].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[2].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				
				panels[2].setVisible(true);
				panels[1].setVisible(false);
				panels[0].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("What will be the return type of a method that not returns any value?");
				label.setBounds(60,40,500,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[2].add(label);
				panels[2].add(radiobtns[8]);
				panels[2].add(radiobtns[9]);
				panels[2].add(radiobtns[10]);
				panels[2].add(radiobtns[11]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[8]);
				btnGroup.add(radiobtns[9]);
				btnGroup.add(radiobtns[10]);
				btnGroup.add(radiobtns[11]);
				
			}
		});
		
		buttons[3]=new JButton("4");
		testFrame.add(buttons[3]);
		buttons[3].setBounds(270, 70, 50, 30);
		buttons[3].setVisible(true);
		
		radiobtns[12]=new JRadioButton("3.0");
		radiobtns[12].setBounds(60,120,120,20);
		radiobtns[12].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[13]=new JRadioButton("3");
		radiobtns[13].setBounds(60,200,120,20);
		radiobtns[13].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[14]=new JRadioButton("4");
		radiobtns[14].setBounds(250,120,250,20);
		radiobtns[14].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[15]=new JRadioButton("4.0");
		radiobtns[15].setBounds(250,200,250,20);
		radiobtns[15].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[3].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				
				panels[3].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
		
				label=new JLabel();
				label.setText("What is the Math.floor(3.6)?");
				label.setBounds(60,40,500,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[3].add(label);
				panels[3].add(radiobtns[12]);
				panels[3].add(radiobtns[13]);
				panels[3].add(radiobtns[14]);
				panels[3].add(radiobtns[15]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[12]);
				btnGroup.add(radiobtns[13]);
				btnGroup.add(radiobtns[14]);
				btnGroup.add(radiobtns[15]);
			}
		});
		
		buttons[4]=new JButton("5");
		testFrame.add(buttons[4]);
		buttons[4].setBounds(320, 70, 50, 30);
		buttons[4].setVisible(true);
		
		radiobtns[16]=new JRadioButton("public");
		radiobtns[16].setBounds(60,120,120,20);
		radiobtns[16].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[17]=new JRadioButton("private");
		radiobtns[17].setBounds(60,200,120,20);
		radiobtns[17].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[18]=new JRadioButton("protected");
		radiobtns[18].setBounds(250,120,250,20);
		radiobtns[18].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[19]=new JRadioButton("static");
		radiobtns[19].setBounds(250,200,250,20);
		radiobtns[19].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[4].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[4].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[5].setVisible(false);
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("<HTML>Which of the modifier can't be used for constructors?</HTML>");
				label.setBounds(60,40,500,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[4].add(label);
				panels[4].add(radiobtns[16]);
				panels[4].add(radiobtns[17]);
				panels[4].add(radiobtns[18]);
				panels[4].add(radiobtns[19]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[16]);
				btnGroup.add(radiobtns[17]);
				btnGroup.add(radiobtns[18]);
				btnGroup.add(radiobtns[19]);
			}
		});
		
		buttons[5]=new JButton("6");
		testFrame.add(buttons[5]);
		buttons[5].setBounds(370, 70, 50, 30);
		buttons[5].setVisible(true);

		radiobtns[20]=new JRadioButton("References variables");
		radiobtns[20].setBounds(60,120,200,20);
		radiobtns[20].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[21]=new JRadioButton("Instance Variables");
		radiobtns[21].setBounds(60,200,250,20);
		radiobtns[21].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[22]=new JRadioButton("Objects");
		radiobtns[22].setBounds(350,120,150,20);
		radiobtns[22].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[23]=new JRadioButton("All of above");
		radiobtns[23].setBounds(350,200,150,20);
		radiobtns[23].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[5].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[5].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("<HTML>The variables declared in a class for the use of all methods of the class are called?<HTML>");
				label.setBounds(60,40,400,60);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[5].add(label);
				panels[5].add(radiobtns[20]);
				panels[5].add(radiobtns[21]);
				panels[5].add(radiobtns[22]);
				panels[5].add(radiobtns[23]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[20]);
				btnGroup.add(radiobtns[21]);
				btnGroup.add(radiobtns[22]);
				btnGroup.add(radiobtns[23]);
			}
		});
		
		buttons[6]=new JButton("7");
		testFrame.add(buttons[6]);
		buttons[6].setBounds(420, 70, 50, 30);
		buttons[6].setVisible(true);
		
		radiobtns[24]=new JRadioButton("Void");
		radiobtns[24].setBounds(60,120,200,20);
		radiobtns[24].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[25]=new JRadioButton("There is no return type");
		radiobtns[25].setBounds(60,200,250,20);
		radiobtns[25].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[26]=new JRadioButton("<HTML>A class Object in which it is defined</HTML>");
		radiobtns[26].setBounds(350,120,200,60);
		radiobtns[26].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[27]=new JRadioButton("All of above");
		radiobtns[27].setBounds(350,200,150,20);
		radiobtns[27].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[6].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[6].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);	
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("<HTML>The implicit return type of a constructor is?</HTML>");
				label.setBounds(60,30,400,60);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[6].add(label);
				panels[6].add(radiobtns[24]);
				panels[6].add(radiobtns[25]);
				panels[6].add(radiobtns[26]);
				panels[6].add(radiobtns[27]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[24]);
				btnGroup.add(radiobtns[25]);
				btnGroup.add(radiobtns[26]);
				btnGroup.add(radiobtns[27]);
			}
		});
		
		buttons[7]=new JButton("8");
		testFrame.add(buttons[7]);
		buttons[7].setBounds(470, 70, 50, 30);
		buttons[7].setVisible(true);
		
		radiobtns[28]=new JRadioButton("Airthmetic Exception");
		radiobtns[28].setBounds(60,120,200,20);
		radiobtns[28].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[29]=new JRadioButton("Exception");
		radiobtns[29].setBounds(60,200,250,20);
		radiobtns[29].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[30]=new JRadioButton("Object");
		radiobtns[30].setBounds(350,120,150,20);
		radiobtns[30].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[31]=new JRadioButton("Throwable");
		radiobtns[31].setBounds(350,200,150,20);
		radiobtns[31].setFont(new Font(null, Font.PLAIN, 15));
		
		buttons[7].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[7].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);	
				panels[6].setVisible(false);
				panels[8].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("<HTML>The class at the top of exception class hierarchy is________</HTML>");
				label.setBounds(60,40,400,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[7].add(label);
				panels[7].add(radiobtns[28]);
				panels[7].add(radiobtns[29]);
				panels[7].add(radiobtns[30]);
				panels[7].add(radiobtns[31]);
			
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[27]);
				btnGroup.add(radiobtns[29]);
				btnGroup.add(radiobtns[30]);
				btnGroup.add(radiobtns[31]);
			}
		});
		
		buttons[8]=new JButton("9");
		testFrame.add(buttons[8]);
		buttons[8].setBounds(520, 70, 50, 30);
		buttons[8].setVisible(true);
		
		radiobtns[32]=new JRadioButton("At Compile-time");
		radiobtns[32].setBounds(60,120,200,20);
		radiobtns[32].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[33]=new JRadioButton("At run-time");
		radiobtns[33].setBounds(60,200,200,20);
		radiobtns[33].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[34]=new JRadioButton("Depends on the code");
		radiobtns[34].setBounds(350,120,200,20);
		radiobtns[34].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[35]=new JRadioButton("None of above");
		radiobtns[35].setBounds(350,200,200,20);
		radiobtns[35].setFont(new Font(null, Font.PLAIN, 15));
		buttons[8].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[8].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);	
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[9].setVisible(false);
				label=new JLabel();
				label.setText("<HTML>The object is created with new keyword </HTML>");
				label.setBounds(60,40,400,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[8].add(label);
				panels[8].add(radiobtns[32]);
				panels[8].add(radiobtns[33]);
				panels[8].add(radiobtns[34]);
				panels[8].add(radiobtns[35]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[32]);
				btnGroup.add(radiobtns[33]);
				btnGroup.add(radiobtns[34]);
				btnGroup.add(radiobtns[35]);
			}
		});
		
		buttons[9]=new JButton("10");
		testFrame.add(buttons[9]);
		buttons[9].setBounds(570, 70, 50, 30);
		buttons[9].setVisible(true);
		radiobtns[36]=new JRadioButton("Classes ");
		radiobtns[36].setBounds(60,120,200,20);
		radiobtns[36].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[37]=new JRadioButton("Interfaces ");
		radiobtns[37].setBounds(60,200,200,20);
		radiobtns[37].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[38]=new JRadioButton("Editing tools");
		radiobtns[38].setBounds(350,120,200,20);
		radiobtns[38].setFont(new Font(null, Font.PLAIN, 15));
		radiobtns[39]=new JRadioButton("Classes and Inrterfaces");
		radiobtns[39].setBounds(350,200,200,20);
		radiobtns[39].setFont(new Font(null, Font.PLAIN, 15));
		buttons[9].addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				panels[9].setVisible(true);				
				panels[0].setVisible(false);
				panels[1].setVisible(false);
				panels[2].setVisible(false);
				panels[3].setVisible(false);
				panels[4].setVisible(false);
				panels[5].setVisible(false);	
				panels[6].setVisible(false);
				panels[7].setVisible(false);
				panels[8].setVisible(false);
				label=new JLabel();
				label.setText("<HTML>A package is a collection of </HTML>");
				label.setBounds(60,40,400,30);
				label.setVisible(true);
				label.setLayout(null);
				label.setFont(new Font(null,Font.PLAIN,15));
				panels[9].add(label);
				panels[9].add(radiobtns[36]);
				panels[9].add(radiobtns[37]);
				panels[9].add(radiobtns[38]);
				panels[9].add(radiobtns[39]);
				
				btnGroup=new ButtonGroup();
				btnGroup.add(radiobtns[36]);
				btnGroup.add(radiobtns[37]);
				btnGroup.add(radiobtns[38]);
				btnGroup.add(radiobtns[39]);
			}
		});	
		/*******************Submit button******************/
		submitbtn=new JButton("Submit");
		submitbtn.setBounds(600,460,100,40);
		c.add(submitbtn);
		submitbtn.setVisible(true);
		submitbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				int r=Results();
				JOptionPane.showMessageDialog(null, "Your marks are "+r+" out of 10");
				submitbtn.setVisible(false);
				radiobtns[0].setForeground(Color.LIGHT_GRAY);
				radiobtns[1].setForeground(Color.LIGHT_GRAY);
				radiobtns[3].setForeground(Color.LIGHT_GRAY);
				radiobtns[4].setForeground(Color.LIGHT_GRAY);
				radiobtns[6].setForeground(Color.LIGHT_GRAY);
				radiobtns[7].setForeground(Color.LIGHT_GRAY);
				radiobtns[8].setForeground(Color.LIGHT_GRAY);
				radiobtns[10].setForeground(Color.LIGHT_GRAY);
				radiobtns[11].setForeground(Color.LIGHT_GRAY);
				radiobtns[13].setForeground(Color.LIGHT_GRAY);
				radiobtns[14].setForeground(Color.LIGHT_GRAY);
				radiobtns[15].setForeground(Color.LIGHT_GRAY);
				radiobtns[16].setForeground(Color.LIGHT_GRAY);
				radiobtns[17].setForeground(Color.LIGHT_GRAY);
				radiobtns[18].setForeground(Color.LIGHT_GRAY);
				radiobtns[20].setForeground(Color.LIGHT_GRAY);
				radiobtns[22].setForeground(Color.LIGHT_GRAY);
				radiobtns[23].setForeground(Color.LIGHT_GRAY);
				radiobtns[24].setForeground(Color.LIGHT_GRAY);
				radiobtns[25].setForeground(Color.LIGHT_GRAY);
				radiobtns[27].setForeground(Color.LIGHT_GRAY);
				radiobtns[28].setForeground(Color.LIGHT_GRAY);
				radiobtns[29].setForeground(Color.LIGHT_GRAY);
				radiobtns[30].setForeground(Color.LIGHT_GRAY);
				radiobtns[35].setForeground(Color.LIGHT_GRAY);
				radiobtns[32].setForeground(Color.LIGHT_GRAY);
				radiobtns[34].setForeground(Color.LIGHT_GRAY);
				radiobtns[38].setForeground(Color.LIGHT_GRAY);
				radiobtns[36].setForeground(Color.LIGHT_GRAY);
				radiobtns[37].setForeground(Color.LIGHT_GRAY);				
			}
		});
		
		closebtn=new JButton("Close");
		closebtn.setBounds(60,460,100,40);
		c.add(closebtn);
		closebtn.setVisible(true);
		closebtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
	}
	/*****************result of test********************/
	public int Results()
	{
		int marks=0;
		if(radiobtns[2].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[5].isSelected())
		{
			marks++;
		}
		if(radiobtns[9].isSelected())
		{
			marks++;
		}
		if(radiobtns[12].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[19].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[21].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[26].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[31].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[33].isSelected())
		{
			marks++;
			
		}
		if(radiobtns[39].isSelected())
		{
			marks++;
			
		}
		return marks;
	}
	
	public static void main(String[] args) 
	{
		Test t1=new Test();
	}
}