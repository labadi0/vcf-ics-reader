package projectfinale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * cette classe qui interface graphique pour affichier et modifier et genere un fragment html etserisalier et deserialiser un object de la classe MyVcard
 * @author labadi tarek  achraf bourassi
 *
 */

public class Gui2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7306370496829143277L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui2 frame = new Gui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Gui2() throws Exception {
		MyVcard v2 = new MyVcard("", "", "", "");
		v2.vcard(v2, 22);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ici on cree un jlabel pour le nom
		 */
		JLabel label = new JLabel("  Name :");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		label.setBounds(15, 84, 88, 42);
		contentPane.add(label);
		/**
		 * ici on cree un jlabel pour affichier la valeur d'attribut 'name ' de l'object de la classe MyVcard
		 */
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_1.setBounds(107, 84, 204, 42);
		contentPane.add(label_1);
		label_1.setText(v2.getName());
		/*
		 * 	 ici on cree un jlabel pour le telephone
		 */
		JLabel label_2 = new JLabel("Phone Number  :");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		label_2.setBounds(25, 155, 166, 34);
		contentPane.add(label_2);
		/**
		 * ici on cree un jlabel pour affichier la valeur d'attribut 'telephone ' de l'object de la classe MyVcard
		 */
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_3.setBounds(192, 155, 197, 34);
		contentPane.add(label_3);
		label_3.setText(v2.getTelephone());
		/**
		 * ici on cree un jlabel pour l'email
		 */
		JLabel label_4 = new JLabel("Email :");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_4.setBounds(25, 221, 67, 34);
		contentPane.add(label_4);
		/**
		 * 		ici on cree un jlabel pour affichier la valeur d'attribut 'email ' de l'object de la classe MyVcard
		 */
		JLabel label_5 = new JLabel("");
		label_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_5.setBounds(92, 221, 242, 34);
		contentPane.add(label_5);
		label_5.setText(v2.getEmail());
		/**
		 *  ici on cree un jlabel pour l'adresse
		 */
		JLabel label_6 = new JLabel("Address :");
		label_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_6.setBounds(25, 283, 88, 34);
		contentPane.add(label_6);
		/**
		 * 	ici on cree un jlabel pour affichier la valeur d'attribut 'adresse ' de l'object de la classe MyVcard
		 */
		JLabel label_7 = new JLabel("");
		label_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_7.setBounds(117, 283, 528, 34);
		contentPane.add(label_7);
		label_7.setText(v2.getAdresse());
		/**
		 * ici on cree un bouton pour pouvoir changer la valeur d'attribut name
		 */
		JButton button = new JButton("Change the Name :");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter11 = new ImageIcon(this.getClass().getResource("/settingName.png")).getImage();
		button.setIcon(new ImageIcon(setter11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String newName;
				newName = textField.getText();
				if (!isNumeric(newName)) {
					try {
						label_1.setText(newName);
						v2.setName(newName);
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "please enter a name ");
				}
			
			
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button.setBounds(15, 349, 289, 42);
		contentPane.add(button);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'name ' il joue le role d'un scanner 
		 */
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField.setColumns(10);
		textField.setBounds(403, 349, 242, 42);
		contentPane.add(textField);
		/**
		 * 	 ici on cree un bouton pour pouvoir changer la valeur d'attribut telephone 
		 */
		JButton button_1 = new JButton("Change the Phone Number :");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter12 = new ImageIcon(this.getClass().getResource("/phoneNumbersettings.png")).getImage();
		button_1.setIcon(new ImageIcon(setter12));
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String  phoneNumber;								//Integer.parseInt(phoneNumberScanner.getText());
				try {
				phoneNumber = textField_1.getText();
				if (phoneNumber.contains("a")||phoneNumber.contains("b")||phoneNumber.contains("c")||phoneNumber.contains("d")||phoneNumber.contains("e")||phoneNumber.contains("f")||phoneNumber.contains("g")||phoneNumber.contains("h")||phoneNumber.contains("i")||phoneNumber.contains("j")||phoneNumber.contains("k")||phoneNumber.contains("l")||phoneNumber.contains("m")||phoneNumber.contains("n")||phoneNumber.contains("a")||phoneNumber.contains("o")||phoneNumber.contains("p")||phoneNumber.contains("q")||phoneNumber.contains("r")||phoneNumber.contains("s")||phoneNumber.contains("t")||phoneNumber.contains("u")||phoneNumber.contains("v")||phoneNumber.contains("w")||phoneNumber.contains("x")||phoneNumber.contains("y")||phoneNumber.contains("z")) {
					JOptionPane.showMessageDialog(null, "please enter a Number ");
				}
				else {
					label_3.setText(phoneNumber);
				v2.setTelephone(phoneNumber);
				v2.setTelephone(phoneNumber);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
			
			
			
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button_1.setBounds(15, 412, 334, 42);
		contentPane.add(button_1);
		/**
		 * 		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'telephone ' il joue le role d'un scanner 
		 */
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(403, 413, 242, 42);
		contentPane.add(textField_1);
		/**
		 * 		  ici on cree un bouton pour pouvoir changer la valeur d'attribut email
		 */
		JButton button_2 = new JButton("Change the Email :");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter13 = new ImageIcon(this.getClass().getResource("/emailSetting.png")).getImage();
		button_2.setIcon(new ImageIcon(setter13));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				String email;
				try {
					email=textField_2.getText();
					if (email.contains("@") && (email.contains(".com"))) {
					label_5.setText(email);
					v2.setEmail(email);
					}
					else {
						JOptionPane.showMessageDialog(null, "please enter a correct Email ");
					}
				} catch (Exception e3) {
					e3.printStackTrace();
				}
					
			
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button_2.setBounds(15, 484, 289, 42);
		contentPane.add(button_2);
		/**
		 * 	 ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'email ' il joue le role d'un scanner 
		 */
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(403, 485, 242, 42);
		contentPane.add(textField_2);
		/**
		 * 		  		  ici on cree un bouton pour pouvoir changer la valeur d'attribut adresse 
		 */
		JButton button_3 = new JButton("Change the Address :");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter14 = new ImageIcon(this.getClass().getResource("/adresseSetting.png")).getImage();
		button_3.setIcon(new ImageIcon(setter14));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String address;
				try {
					address = textField_3.getText();
					
					label_7.setText(address);
						v2.setAdresse(address);
					
				} catch (Exception e4) {
					e4.printStackTrace();
				}
			
			
			
			
			
			
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button_3.setBounds(15, 553, 289, 42);
		contentPane.add(button_3);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'adresse ' il joue le role d'un scanner 
		 */
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(403, 553, 242, 42);
		contentPane.add(textField_3);
		/**
		 * ici on cree un jlabel pour affichier une image 
		 */
		JLabel icon = new JLabel("");
		icon.setBounds(478, 19, 185, 177);
		contentPane.add(icon);
		Image img = new ImageIcon(this.getClass().getResource("/vcard2.png")).getImage();
		icon.setIcon(new ImageIcon(img));
		/**
		 * ici on cree un bouton qui fait la seralisation par l'appel de la methode qui est dans la classe MyVcard
		 */
		JButton button_4 = new JButton("");
		Image setter00 = new ImageIcon(this.getClass().getResource("/save2.png")).getImage();
		button_4.setIcon(new ImageIcon(setter00));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v2.serialisation2(v2, "thenewVcard2.ser");
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		button_4.setBounds(0, 0, 43, 23);
		contentPane.add(button_4);
		/**
		 * ici on cree un bouton qui fait la deseralisation par l'appel de la methode qui est dans la classe MyVcard
		 */
		JButton button_5 = new JButton("");
		Image setter2 = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
		button_5.setIcon(new ImageIcon(setter2));
		button_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					MyVcard x = v2.derserialisation2("thenewVcard2.ser");
					
					label_1.setText(x.getName());
					label_3.setText(x.getTelephone());
					label_5.setText(x.getEmail());
					label_7.setText(x.getAdresse());
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		button_5.setBounds(42, 0, 43, 23);
		contentPane.add(button_5);
		/**
		 *
		 * ici on cree un bouton qui genere un fragment html par l'appel de la methode qui est dans la classe MyVcard
		 *
		 */
		
		JButton button_6 = new JButton("");
		Image setter004 = new ImageIcon(this.getClass().getResource("/html.png")).getImage();
		button_6.setIcon(new ImageIcon(setter004));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					v2.htmlLines(v2,"hcard2.html");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		button_6.setBounds(85, 0, 43, 23);
		contentPane.add(button_6);
	}
	/**
	 * cette methode test si un String est un nombre ou non
	 * @param input ce que je donne comme un String 
	 * @return elle me retourne vrai ou faux 
	 * @throws IllegalArgumentException
	 */
	public static boolean isNumeric(String input) throws IllegalArgumentException{
		boolean isNumber = false;
		if (input !=null && !input.equals("")) {
			isNumber = true ;
			char chars[]= input.toCharArray();
			for (int i=0;i<chars.length;i++) {
				isNumber &= Character.isDigit(chars[i]);
				if (!isNumber) {
				break;
				}
			}
		}
		return isNumber;
	}

}
