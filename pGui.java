
import java.awt.*;
import java.io.*;
import javax.swing.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class pGui extends JFrame
{
	private ImageIcon image1, image2, image3, image4, image5, image6, image7;
	private ImageIcon image8, image9, image10, image11, image12, image13, image14;
	private JLabel label1;
	private Scanner scan;
	
	
	pGui()
	{
		int x = 0;
		int y = 0;
		String xy = "1";
		String string1 = "left"; 
		String string2 = "right";
		String string3 = "up";
		String string4 = "down";
		
		
		setLayout(new FlowLayout());
		
			
			try 
			{
				FileReader file = new FileReader("C:/Users/Ryan/Documents/Ryan's Folder/School/ASU Sophmore/Spring Semester/CSE 294/puzzleGui.txt");
				BufferedReader br = new BufferedReader(file);
				String someLine;
				
				while((someLine=br.readLine()) != null & x<25)
				{
					y=0;
					char currLine =someLine.charAt(14);
					
					FileReader file1 = new FileReader("C:/Users/Ryan/Documents/Ryan's Folder/School/ASU Sophmore/Spring Semester/CSE 294/puzzleGui.txt");
					BufferedReader br1 = new BufferedReader(file1);
					String someLine1;
					
					if (currLine == 'u')
					{	
						while((someLine1=br1.readLine()) != null & y<50)
						{	
							if (y==x+25)
							{
								currLine= someLine1.charAt(15);
								
								if (currLine == '1')
								{
									image1 = new ImageIcon(getClass().getResource("1up.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '2')
								{
									image1 = new ImageIcon(getClass().getResource("2up.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '3')
								{
									image1 = new ImageIcon(getClass().getResource("3up.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '4')
								{
									image1 = new ImageIcon(getClass().getResource("4up.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
							}							
							y++;
						}
					}					
					if (currLine == 'd')
					{
						while((someLine1=br1.readLine()) != null & y<50)
						{									
							if (y==x+25)
							{
								currLine= someLine1.charAt(15);
									
								if (currLine == '1')
								{
									image1 = new ImageIcon(getClass().getResource("1down.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '2')
								{
									image1 = new ImageIcon(getClass().getResource("2down.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '3')
								{
									image1 = new ImageIcon(getClass().getResource("3down.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '4')
								{
									image1 = new ImageIcon(getClass().getResource("4down.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
							}							
						y++;						
						}
					}
					
					if (currLine == 'l')
					{
						while((someLine1=br1.readLine()) != null & y<50)
						{									
							if (y==x+25)
							{
								currLine= someLine1.charAt(15);
									
								if (currLine == '1')
								{
									image1 = new ImageIcon(getClass().getResource("1left.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '2')
								{
									image1 = new ImageIcon(getClass().getResource("2left.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '3')
								{
									image1 = new ImageIcon(getClass().getResource("3left.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '4')
								{
									image1 = new ImageIcon(getClass().getResource("4left.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
							}							
						y++;
						}
					}
					if (currLine == 'r')
					{
						while((someLine1=br1.readLine()) != null & y<50)
						{									
							if (y==x+25)
							{
								currLine= someLine1.charAt(15);
									
								if (currLine == '1')
								{
									image1 = new ImageIcon(getClass().getResource("1right.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '2')
								{
								image1 = new ImageIcon(getClass().getResource("2right.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '3')
								{
									image1 = new ImageIcon(getClass().getResource("3right.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
								if (currLine == '4')
								{
									image1 = new ImageIcon(getClass().getResource("4right.png"));
									label1 = new JLabel(image1);
									add(label1);
								}
							}							
						y++;
						}
					}
			x++;
			}
		}
	
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		
	}
	
	public static void main(String args[]) throws Exception
	{
		pGui gui = new pGui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(330,320);
		gui.setTitle("Network Solution");
		gui.setResizable(false);
		
		
	}
	
}


		
