package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register extends JFrame {
	String log,pass;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F:");
		label.setBounds(10, 11, 196, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u041B\u043E\u0433\u0438\u043D:");
		label_1.setBounds(10, 36, 54, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C:");
		label_2.setBounds(10, 61, 69, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(89, 33, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 58, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u041A\u043B\u0438\u0435\u043D\u0442");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(6, 82, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u0421\u0442\u0440\u0430\u0445\u043E\u0432\u043E\u0439 \u0430\u0433\u0435\u043D\u0442");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 112, 130, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel label_3 = new JLabel("\u041D\u0435\u0432\u0435\u0440\u043D\u043E \u0432\u0432\u0435\u0434\u0435\u043D \u043B\u043E\u0433\u0438\u043D \u0438\u043B\u0438 \u043F\u0430\u0440\u043E\u043B\u044C.");
		label_3.setVisible(false);
		label_3.setForeground(Color.RED);
		label_3.setBounds(10, 182, 215, 14);
		contentPane.add(label_3);
		
		JButton btnNewButton = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem()=="<=50 л.с") k1=(float)(0.6);
				if (comboBox.getSelectedItem()=="От 50 до 70 л.с.") k1=(float)(1);
				if (comboBox.getSelectedItem()=="От 70 до 100 л.с.") k1=(float)(1.1);
				if (comboBox.getSelectedItem()=="От 100 до 120 л.с.") k1=(float)(1.2);
				if (comboBox.getSelectedItem()=="От 120 до 150 л.с.") k1=(float)(1.4);
				if (comboBox.getSelectedItem()==">150 л.с.") k1=(float)(1.6);
				
				if (comboBox_1.getSelectedItem()=="До 22 лет, стаж до 3 лет") k2=(float)(1.8);
				if (comboBox_1.getSelectedItem()=="До 22 лет, стаж свыше 3 лет") k2=(float)(1.6);
				if (comboBox_1.getSelectedItem()=="Свыше 22 лет, стаж до 3 лет") k2=(float)(1.7);
				if (comboBox_1.getSelectedItem()=="Свыше 22 лет, стаж свыше 3 лет") k2=(float)(1);
				
				if (comboBox_2.getSelectedItem()=="Легковой автомобиль") k3=(float)(1980);
				if (comboBox_2.getSelectedItem()=="Мотоцикл") k3=(float)(1215);
				if (comboBox_2.getSelectedItem()=="Грузовой автомобиль (>=16 т.)") k3=(float)(3240);
				if (comboBox_2.getSelectedItem()=="Грузовой автомобиль (<16 т.)") k3=(float)(2025);
				if (comboBox_2.getSelectedItem()=="Автобус (число мест >=20)") k3=(float)(2025);
				if (comboBox_2.getSelectedItem()=="Автобус (число мест <20)") k3=(float)(1620);
				
				if (comboBox_3.getSelectedItem()=="Ограниченный список водителей") k4=1;
				if (comboBox_3.getSelectedItem()=="Без ограничения") k4=(float)(1.8);
				
				s=k1*k2*k3*k4*k5;
				label_5.setText(Float.toString(s) + " руб.");
			}
		});
		btnNewButton.setBounds(10, 235, 124, 33);
		contentPane.add(btnNewButton);
	}
}
