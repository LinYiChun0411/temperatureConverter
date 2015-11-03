package restful.client;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class MyWindows {
	
	public static void main(String[] args) {
	
		// 建立一個視窗，並將標題設定為「視窗程式」
		// 標題可用jframe.setTitle("視窗程式");代替
		
		
		JPanel panel1=new JPanel();//第一列容器
		JPanel panel2=new JPanel();//第二列容器
		JPanel panel3=new JPanel();//第三列容器
		JPanel panel4=new JPanel();//第四列容器
		//Origin temperature unit===========================================================================
		// 宣告群組1
		ButtonGroup buttonGroup1 = new ButtonGroup();
		// 建立標籤
		JLabel label1 = new JLabel("Original unit:");
		// 建立JRadioButton
		JRadioButton radioCelsius1, radioReaumur1, radioFarenheit1, radioKelvin1;
		radioCelsius1 = new JRadioButton("Celsius");	
		radioReaumur1 = new JRadioButton("Reaumur");
		radioFarenheit1 = new JRadioButton("Farenheit");
		radioKelvin1 = new JRadioButton("Kelvin");

		// 加入群組
		buttonGroup1.add(radioCelsius1);
		buttonGroup1.add(radioReaumur1);
		buttonGroup1.add(radioFarenheit1);
		buttonGroup1.add(radioKelvin1);
		// 加入容器
		panel1.add(label1);
		panel1.add(radioCelsius1);
		panel1.add(radioReaumur1);
		panel1.add(radioFarenheit1);
		panel1.add(radioKelvin1);
		
		//target temperature unit===========================================================================
		// 建立JRadioButton
		JRadioButton radioCelsius2, radioReaumur2, radioFarenheit2, radioKelvin2;
		radioCelsius2 = new JRadioButton("Celsius");
		radioReaumur2 = new JRadioButton("Reaumur");
		radioFarenheit2 = new JRadioButton("Farenheit");
		radioKelvin2 = new JRadioButton("Kelvin");
		// 宣告群組2
		ButtonGroup buttonGroup2 = new ButtonGroup();
		// 建立標籤
		JLabel label2 = new JLabel("Target unit:");
		// 加入群組2
		buttonGroup2.add(radioCelsius2);
		buttonGroup2.add(radioReaumur2);
		buttonGroup2.add(radioFarenheit2);
		buttonGroup2.add(radioKelvin2);
		// 加入容器
		panel2.add(label2);
		panel2.add(radioCelsius2);
		panel2.add(radioReaumur2);
		panel2.add(radioFarenheit2);
		panel2.add(radioKelvin2);
		
		//----------------------------第三列
		JLabel labelAns = new JLabel();
		JTextField inputTxt=new JTextField(10);
		inputTxt.setText("0");
		JLabel label3 = new JLabel("Original temperature value:");
		
		JButton btn=new JButton("計算");
		btn.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {	
			  Double originVal;
			  Double targetVal;
			  Temperature temConvert=new Temperature();
			  
			  if(inputTxt.getText().isEmpty()){
				  labelAns.setText("not complete");			  
				} else {
					//Celsius
					if (radioCelsius1.isSelected()
							&& radioCelsius2.isSelected())// Celsius to Celsius
					{

						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						labelAns.setText(originVal.toString());
					}
					if (radioCelsius1.isSelected()
							&& radioReaumur2.isSelected())// Celsius to Reaumur
					{

						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("CtoR", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioCelsius1.isSelected()
							&& radioFarenheit2.isSelected())// Celsius to
															// Farenheit
					{

						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("CtoF", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioCelsius1.isSelected() && radioKelvin2.isSelected())// Celsius to Kelvin
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("CtoK", originVal);
						labelAns.setText(targetVal.toString());
					}
					//Farenheit
					if (radioFarenheit1.isSelected() && radioFarenheit2.isSelected())// Farenheit to Farenheit
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						labelAns.setText(originVal.toString());
					}
					if (radioFarenheit1.isSelected() && radioCelsius2.isSelected())// Farenheit to Celsius
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("FtoC", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioFarenheit1.isSelected() && radioReaumur2.isSelected())// Farenheit to Reaumur
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("FtoR", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioFarenheit1.isSelected() && radioKelvin2.isSelected())// Farenheit to Kelvin
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("FtoK", originVal);
						labelAns.setText(targetVal.toString());
					}
					//Reaumur
					if (radioReaumur1.isSelected() && radioReaumur2.isSelected())// Reaumur to Reaumur
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						labelAns.setText(originVal.toString());
					}
					if (radioReaumur1.isSelected() && radioCelsius2.isSelected())// Reaumur to Celsius
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("RtoC", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioReaumur1.isSelected() && radioFarenheit2.isSelected())// Reaumur to Farenheit
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("RtoF", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioReaumur1.isSelected() && radioKelvin2.isSelected())// Reaumur to Kelvin
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("RtoK", originVal);
						labelAns.setText(targetVal.toString());
					}
					//Kelvin
					if (radioKelvin1.isSelected() && radioKelvin2.isSelected())// Kelvin to Kelvin
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						labelAns.setText(originVal.toString());
					}
					if (radioKelvin1.isSelected() && radioCelsius2.isSelected())// Kelvin to Celsius
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("KtoC", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioKelvin1.isSelected() && radioFarenheit2.isSelected())// Kelvin to Farenheit
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("KtoF", originVal);
						labelAns.setText(targetVal.toString());
					}
					if (radioKelvin1.isSelected() && radioReaumur2.isSelected())// Kelvin to Reaumur
					{
						originVal = Double.parseDouble(inputTxt.getText()
								.toString());
						targetVal = temConvert.convert("KtoR", originVal);
						labelAns.setText(targetVal.toString());
					}
					
				}
		  }
		  
		});
		
		
		panel3.add(label3);
		panel3.add(inputTxt);
		panel3.add(btn);
		//----------------------------第四列
				JLabel label4 = new JLabel("Target temperature value:");
				 				
				panel4.add(label4);
				panel4.add(labelAns);			
		//------------------------------------------------------------------------------------------
		JFrame jframe = new JFrame("視窗程式");
		// 設定圖示
		// jframe.setIconImage(jframe.getToolkit().getImage("test.jpg"));
		// 設定視窗大小(寬,高)
		jframe.setSize(600, 400);
		// 設定視窗開啟時的位置，有以下兩種常用設定方法
		jframe.setLocation(0, 0); // --> 設定視窗開啟時左上角的座標，也可帶入Point物件
		jframe.setLocationRelativeTo(null); // -->
											// 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
		// 關閉選項(右上角的叉叉圖示)按下後的動作
		// EXIT_ON_CLOSE：點選關閉時，關閉程式
		// DISPOSE_ON_CLOSE：點選關閉時，關閉顯示的視窗以及使用的資源，程式仍在背景執行
		// HIDE_ON_CLOSE：點選關閉時，僅隱藏顯示的視窗，程式仍在背景執行
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 設定視窗顯示，若未設定視窗只會在背景執行
		jframe.setVisible(true);
		jframe.getContentPane().setLayout(new GridLayout(4,1));
		panel1.setLayout(new FlowLayout(FlowLayout.LEADING));
		panel2.setLayout(new FlowLayout(FlowLayout.LEADING));
		jframe.add(panel1);
		jframe.add(panel2);
		jframe.add(panel3);
		jframe.add(panel4);

	}

}
