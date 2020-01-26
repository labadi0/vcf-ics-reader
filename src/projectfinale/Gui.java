package projectfinale;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
/**
 * cette classe qui interface graphique pour affichier et modifier et genere un fragment html etserisalier et deserialiser un object de la classe MyVcard
 * @author labadi tarek  achraf bourassi
 *
 */

public class Gui {

	private JFrame frame;
	private JLabel lblName;
	private JLabel jlabelPhoneNumber;
	private JLabel lblPhoneNumber;
	private JLabel jlabelEmail;
	private JLabel lblEmail;
	private JLabel jlabelAdress;
	private JLabel lblAdress;
	private JTextField nameScanner;
	private JButton buttonChangePhoneNumber;
	private JTextField phoneNumberScanner;
	private JButton buttonChangeTheEmail;
	private JTextField emailScanner;
	private JButton btnNewButton;
	private JTextField addressScanner;
	private JLabel jblimg;
	private JButton jblSer;
	private JButton btnNewButton_2;
	private JButton gotocalendar;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		MyVcard v1 =  new MyVcard ("","","","");
		
		v1.vcard(v1, 11);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public Gui() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() throws Exception {
		MyVcard v1 = new MyVcard("", "", "", "");
		v1.vcard(v1, 11);
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/**
		 * ici on cree un jlabel pour le nom
		 */
		JLabel jlabelName = new JLabel("  Name :");
		jlabelName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		jlabelName.setBounds(15, 84, 88, 42);
		frame.getContentPane().add(jlabelName);
		/**
		 * ici on cree un jlabel pour affichier la valeur d'attribut 'name ' de l'object de la classe MyVcard
		 */
		
		lblName = new JLabel("New label");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblName.setBounds(107, 84, 204, 42);
		frame.getContentPane().add(lblName);
		lblName.setText(v1.getName());
		
		/*
		 * 	 ici on cree un jlabel pour le telephone
		 */
		
		
		jlabelPhoneNumber = new JLabel("Phone Number  :");
		jlabelPhoneNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		jlabelPhoneNumber.setBounds(25, 155, 166, 34);
		frame.getContentPane().add(jlabelPhoneNumber);
		
		/**
		 * ici on cree un jlabel pour affichier la valeur d'attribut 'telephone ' de l'object de la classe MyVcard
		 */
		lblPhoneNumber = new JLabel("");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPhoneNumber.setBounds(192, 155, 197, 34);
		frame.getContentPane().add(lblPhoneNumber);
		lblPhoneNumber.setText(v1.getTelephone());
		
		/**
		 * ici on cree un jlabel pour l'email
		 */
		jlabelEmail = new JLabel("Email :");
		jlabelEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jlabelEmail.setBounds(25, 221, 67, 34);
		frame.getContentPane().add(jlabelEmail);
		
		/**
		 * 		ici on cree un jlabel pour affichier la valeur d'attribut 'email ' de l'object de la classe MyVcard
		 */
		lblEmail = new JLabel("");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblEmail.setBounds(92, 221, 242, 34);
		frame.getContentPane().add(lblEmail);
		lblEmail.setText(v1.getEmail());
				
		/**
		 *  ici on cree un jlabel pour l'adresse
		 */
		
		jlabelAdress = new JLabel("Address :");
		jlabelAdress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jlabelAdress.setBounds(25, 283, 88, 34);
		frame.getContentPane().add(jlabelAdress);
		/**
		 * 	ici on cree un jlabel pour affichier la valeur d'attribut 'adresse ' de l'object de la classe MyVcard
		 */
		
		lblAdress = new JLabel("");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAdress.setBounds(117, 283, 528, 34);
		frame.getContentPane().add(lblAdress);
		lblAdress.setText(v1.getAdresse());
		
		/**
		 * ici on cree un bouton pour pouvoir changer la valeur d'attribut name
		 */
		
		
		JButton bontonchangename = new JButton("Change the Name :");
		bontonchangename.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter11 = new ImageIcon(this.getClass().getResource("/settingName.png")).getImage();
		bontonchangename.setIcon(new ImageIcon(setter11));
		bontonchangename.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		bontonchangename.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)  {
				
				
				String newName;
				newName = nameScanner.getText();
				if (!isNumeric(newName)) {
					try {
						lblName.setText(newName);
						v1.setName(newName);
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "please enter a name ");
				}
			
			}
		});
		bontonchangename.setBounds(15, 349, 289, 42);
		frame.getContentPane().add(bontonchangename);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'name ' il joue le role d'un scanner 
		 */
		
		nameScanner = new JTextField();
		nameScanner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		nameScanner.setBounds(393, 349, 252, 42);
		frame.getContentPane().add(nameScanner);
		nameScanner.setColumns(10);
		/**
		 * 	 ici on cree un bouton pour pouvoir changer la valeur d'attribut telephone 
		 */
		
		buttonChangePhoneNumber = new JButton("Change the Phone Number :");
		buttonChangePhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter12 = new ImageIcon(this.getClass().getResource("/phoneNumbersettings.png")).getImage();
		buttonChangePhoneNumber.setIcon(new ImageIcon(setter12));
		buttonChangePhoneNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String  phoneNumber;								
				try {
				phoneNumber = phoneNumberScanner.getText();
				if (phoneNumber.contains("a")||phoneNumber.contains("b")||phoneNumber.contains("c")||phoneNumber.contains("d")||phoneNumber.contains("e")||phoneNumber.contains("f")||phoneNumber.contains("g")||phoneNumber.contains("h")||phoneNumber.contains("i")||phoneNumber.contains("j")||phoneNumber.contains("k")||phoneNumber.contains("l")||phoneNumber.contains("m")||phoneNumber.contains("n")||phoneNumber.contains("a")||phoneNumber.contains("o")||phoneNumber.contains("p")||phoneNumber.contains("q")||phoneNumber.contains("r")||phoneNumber.contains("s")||phoneNumber.contains("t")||phoneNumber.contains("u")||phoneNumber.contains("v")||phoneNumber.contains("w")||phoneNumber.contains("x")||phoneNumber.contains("y")||phoneNumber.contains("z")) {
					JOptionPane.showMessageDialog(null, "please enter a Number ");
				}
				else {
				lblPhoneNumber.setText(phoneNumber);
				v1.setTelephone(phoneNumber);
				v1.setTelephone(phoneNumber);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		});
		buttonChangePhoneNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		buttonChangePhoneNumber.setBounds(15, 412, 331, 42);
		frame.getContentPane().add(buttonChangePhoneNumber);
		
		/**
		 * 		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'telephone ' il joue le role d'un scanner 
		 */
		
		phoneNumberScanner = new JTextField();
		phoneNumberScanner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		phoneNumberScanner.setBounds(393, 413, 252, 42);
		frame.getContentPane().add(phoneNumberScanner);
		phoneNumberScanner.setColumns(10);
		/**
		 * 		  ici on cree un bouton pour pouvoir changer la valeur d'attribut email
		 */
		
		buttonChangeTheEmail = new JButton("Change the Email :");
		buttonChangeTheEmail.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter13 = new ImageIcon(this.getClass().getResource("/emailSetting.png")).getImage();
		buttonChangeTheEmail.setIcon(new ImageIcon(setter13));
		buttonChangeTheEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String email;
			try {
				email=emailScanner.getText();
				if (email.contains("@") && (email.contains(".com"))) {
				lblEmail.setText(email);
				v1.setEmail(email);
				}
				else {
					JOptionPane.showMessageDialog(null, "please enter a correct Email ");
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
			}
		});
		buttonChangeTheEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		buttonChangeTheEmail.setBounds(15, 484, 289, 42);
		frame.getContentPane().add(buttonChangeTheEmail);
		/**
		 * 	 ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'email ' il joue le role d'un scanner 
		 */
		
		emailScanner = new JTextField();
		emailScanner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		emailScanner.setBounds(393, 485, 252, 42);
		frame.getContentPane().add(emailScanner);
		emailScanner.setColumns(10);
		
		/**
		 * 		  		  ici on cree un bouton pour pouvoir changer la valeur d'attribut adresse 
		 */
		
		btnNewButton = new JButton("Change the Address :");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		Image setter14 = new ImageIcon(this.getClass().getResource("/adresseSetting.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(setter14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String address;
			try {
				address = addressScanner.getText();
				
					lblAdress.setText(address);
					v1.setAdresse(address);
				
			} catch (Exception e4) {
				e4.printStackTrace();
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(15, 553, 289, 42);
		frame.getContentPane().add(btnNewButton);
		
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'adresse ' il joue le role d'un scanner 
		 */
		addressScanner = new JTextField();
		addressScanner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		addressScanner.setBounds(393, 553, 252, 42);
		frame.getContentPane().add(addressScanner);
		addressScanner.setColumns(10);
		
		/**
		 * ici on cree un jlabel pour affichier une image 
		 */
		
		jblimg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/vcard2.png")).getImage();
		jblimg.setIcon(new ImageIcon(img));
		jblimg.setBounds(490, 19, 173, 171);
		frame.getContentPane().add(jblimg);
		
		/**
		 * ici on cree un bouton qui fait la seralisation par l'appel de la methode qui est dans la classe MyVcard
		 */
		
		
		jblSer = new JButton("");
		Image setter = new ImageIcon(this.getClass().getResource("/save2.png")).getImage();
		jblSer.setIcon(new ImageIcon(setter));
		jblSer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v1.serialisation2(v1, "thenewVcard.ser");
			}
		});
		jblSer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jblSer.setBounds(0, 0, 43, 29);
		frame.getContentPane().add(jblSer);
		
		/**
		 * ici on cree un bouton qui fait la deseralisation par l'appel de la methode qui est dans la classe MyVcard
		 */
		
		
		btnNewButton_2 = new JButton("");
		Image setter2 = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(setter2));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MyVcard x = v1.derserialisation2("thenewVcard.ser");
					
					lblName.setText(x.getName());
					lblPhoneNumber.setText(x.getTelephone());
					lblEmail.setText(x.getEmail());
					lblAdress.setText(x.getAdresse());
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		
		
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(42, 0, 43, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		/**
		 *
		 * ici on cree un bouton qui genere un fragment html par l'appel de la methode qui est dans la classe MyVcard
		 *
		 */
		JButton htmlbouton = new JButton("");
		Image setter3 = new ImageIcon(this.getClass().getResource("/html.png")).getImage();
		htmlbouton.setIcon(new ImageIcon(setter3));
		htmlbouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				v1.htmlLines(v1,"hcard.html");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			}
		});
		htmlbouton.setBounds(85, 0, 43, 29);
				frame.getContentPane().add(htmlbouton);
		/**
		 * ici on cree un bouton qui vas aller a un autre interface graphique celui de la calendrier 
		 */
		
		gotocalendar = new JButton("");
		Image setter4 = new ImageIcon(this.getClass().getResource("/timetable.png")).getImage();
		gotocalendar.setIcon(new ImageIcon(setter4));
		gotocalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				try {
					GuiCalendar calendar = new GuiCalendar();
					calendar.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		gotocalendar.setBounds(127, 0, 43, 29);
		frame.getContentPane().add(gotocalendar);
		
		
		JButton secondeVcard = new JButton("");
		Image setter5 = new ImageIcon(this.getClass().getResource("/card.png")).getImage();
		secondeVcard.setIcon(new ImageIcon(setter5));
	/**
	 * bouton pour aller au 2 eme Vcard
	 */
		secondeVcard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				frame.dispose();
				try {
					Gui2 vcard2 = new Gui2();
					vcard2.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			
			}
		});
		secondeVcard.setBounds(170, 0, 43, 29);
		frame.getContentPane().add(secondeVcard);
		
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
