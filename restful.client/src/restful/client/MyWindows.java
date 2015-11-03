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
	
		// �إߤ@�ӵ����A�ñN���D�]�w���u�����{���v
		// ���D�i��jframe.setTitle("�����{��");�N��
		
		
		JPanel panel1=new JPanel();//�Ĥ@�C�e��
		JPanel panel2=new JPanel();//�ĤG�C�e��
		JPanel panel3=new JPanel();//�ĤT�C�e��
		JPanel panel4=new JPanel();//�ĥ|�C�e��
		//Origin temperature unit===========================================================================
		// �ŧi�s��1
		ButtonGroup buttonGroup1 = new ButtonGroup();
		// �إ߼���
		JLabel label1 = new JLabel("Original unit:");
		// �إ�JRadioButton
		JRadioButton radioCelsius1, radioReaumur1, radioFarenheit1, radioKelvin1;
		radioCelsius1 = new JRadioButton("Celsius");	
		radioReaumur1 = new JRadioButton("Reaumur");
		radioFarenheit1 = new JRadioButton("Farenheit");
		radioKelvin1 = new JRadioButton("Kelvin");

		// �[�J�s��
		buttonGroup1.add(radioCelsius1);
		buttonGroup1.add(radioReaumur1);
		buttonGroup1.add(radioFarenheit1);
		buttonGroup1.add(radioKelvin1);
		// �[�J�e��
		panel1.add(label1);
		panel1.add(radioCelsius1);
		panel1.add(radioReaumur1);
		panel1.add(radioFarenheit1);
		panel1.add(radioKelvin1);
		
		//target temperature unit===========================================================================
		// �إ�JRadioButton
		JRadioButton radioCelsius2, radioReaumur2, radioFarenheit2, radioKelvin2;
		radioCelsius2 = new JRadioButton("Celsius");
		radioReaumur2 = new JRadioButton("Reaumur");
		radioFarenheit2 = new JRadioButton("Farenheit");
		radioKelvin2 = new JRadioButton("Kelvin");
		// �ŧi�s��2
		ButtonGroup buttonGroup2 = new ButtonGroup();
		// �إ߼���
		JLabel label2 = new JLabel("Target unit:");
		// �[�J�s��2
		buttonGroup2.add(radioCelsius2);
		buttonGroup2.add(radioReaumur2);
		buttonGroup2.add(radioFarenheit2);
		buttonGroup2.add(radioKelvin2);
		// �[�J�e��
		panel2.add(label2);
		panel2.add(radioCelsius2);
		panel2.add(radioReaumur2);
		panel2.add(radioFarenheit2);
		panel2.add(radioKelvin2);
		
		//----------------------------�ĤT�C
		JLabel labelAns = new JLabel();
		JTextField inputTxt=new JTextField(10);
		inputTxt.setText("0");
		JLabel label3 = new JLabel("Original temperature value:");
		
		JButton btn=new JButton("�p��");
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
		//----------------------------�ĥ|�C
				JLabel label4 = new JLabel("Target temperature value:");
				 				
				panel4.add(label4);
				panel4.add(labelAns);			
		//------------------------------------------------------------------------------------------
		JFrame jframe = new JFrame("�����{��");
		// �]�w�ϥ�
		// jframe.setIconImage(jframe.getToolkit().getImage("test.jpg"));
		// �]�w�����j�p(�e,��)
		jframe.setSize(600, 400);
		// �]�w�����}�Үɪ���m�A���H�U��ر`�γ]�w��k
		jframe.setLocation(0, 0); // --> �]�w�����}�Үɥ��W�����y�СA�]�i�a�JPoint����
		jframe.setLocationRelativeTo(null); // -->
											// �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��
		// �����ﶵ(�k�W�����e�e�ϥ�)���U�᪺�ʧ@
		// EXIT_ON_CLOSE�G�I�������ɡA�����{��
		// DISPOSE_ON_CLOSE�G�I�������ɡA������ܪ������H�ΨϥΪ��귽�A�{�����b�I������
		// HIDE_ON_CLOSE�G�I�������ɡA��������ܪ������A�{�����b�I������
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �]�w������ܡA�Y���]�w�����u�|�b�I������
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
