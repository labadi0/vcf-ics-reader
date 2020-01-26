package projectfinale;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author @author labadi tarek  achraf bourassi
 *
 */
public class GuiCalendar extends JFrame {

	/**
	 * cette interface graphique pour le calendrier
	 */
	private static final long serialVersionUID = 1L;


	private JPanel contentPane;
	
	
	private JLabel days;
	private JLabel timeend;
	private JLabel starttime;
	private JLabel summry;
	private JLabel locationn;
	private JLabel description;
	@SuppressWarnings("unused")
	private JLabel jblday;
	@SuppressWarnings("unused")
	private JLabel label;
	@SuppressWarnings("unused")
	private JLabel label_1;
	@SuppressWarnings("unused")
	private JLabel label_2;
	@SuppressWarnings("unused")
	private JLabel label_3;
	private JLabel lblday;
	private JLabel jblstarttime;
	private JLabel jblendTime;
	private JLabel jblsummary;
	private JLabel jbllocation;
	private JLabel jbldescription;
	private JLabel lblday2;
	private JLabel lblstart2;
	private JLabel lblend2;
	private JLabel jblsummry2;
	private JLabel jbllocation2;
	private JLabel jblDescription2;
	private JTextField dayScanner;
	@SuppressWarnings("unused")
	private JTextField MonthScanner;
	@SuppressWarnings("unused")
	private JTextField yearScanner;
	private JTextField timestartScanner;
	private JTextField timeEndScanner;
	private JTextField summuryScanner;
	private JTextField locationScanner;
	private JTextField descriptionScanner;
	private JButton buttonSetting2;
	private JTextField dayScanner2;
	private JTextField timeStartScanner2;
	private JTextField timeEndScanner2;
	private JTextField summuryScanner2;
	private JTextField locationScanner2;
	private JTextField descriptionScanner2;
	private JLabel lblend3;
	private JLabel jblsummry3;
	private JLabel jbllocation3;
	private JLabel jblDescription3;
	private JTextField dayScanner3;
	private JTextField timeStartScanner3;
	private JTextField timeEndScanner3;
	private JTextField summuryScanner3;
	private JTextField locationScanner3;
	private JTextField descriptionScanner3;
	private JLabel lblday4;
	@SuppressWarnings("unused")
	private JLabel lblstart4;
	private JLabel lblend4;
	private JLabel jblsummry4;
	private JLabel jbllocation4;
	private JLabel jblDescription4;
	private JButton buttonSetting4;
	private JTextField dayScanner4;
	private JTextField timeStartScanner4;
	private JTextField timeEndScanner4;
	private JTextField summuryScanner4;
	private JTextField locationScanner4;
	private JTextField descriptionScanner4;
	private JLabel lblday5;
	private JLabel lblstart5;
	private JLabel lblend5;
	private JLabel jblsummry5;
	private JLabel jbllocation5;
	private JLabel jblDescription5;
	private JButton buttonSetting5;
	private JTextField dayScanner5;
	private JTextField timeStartScanner5;
	private JTextField timeEndScanner5;
	private JTextField summuryScanner5;
	private JTextField locationScanner5;
	private JTextField descriptionScanner5;
	@SuppressWarnings("unused")
	private JLabel oneroman;
	private JLabel romanone;
	private JLabel tworoman;
	private JLabel threeroman;
	private JLabel fourroman;
	private JLabel fiveroman;
	private JButton savebutton;
	private JButton loadbutton;
	@SuppressWarnings("unused")
	private JButton gotomain;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCalendar frame = new GuiCalendar();
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
	public GuiCalendar() throws Exception {
		/**
		 * ici on cree 5 object de la classe MyCalendar et 5 object de la classe Time
		 */
		Time startup = new Time("","","","","","");
		Time endup = new Time ("","","","","","");
		Time startup2 = new Time("","","","","","");
		Time endup2 = new Time ("","","","","","");
		Time startup3 = new Time("","","","","","");
		Time endup3 = new Time ("","","","","","");
		Time startup4 = new Time("","","","","","");
		Time endup4 = new Time ("","","","","","");
		Time startup5 = new Time("","","","","","");
		Time endup5 = new Time ("","","","","","");
		
		startup.startEndTime(startup, "DTSTART", 26);
		endup.startEndTime(endup, "DTEND", 26);
		startup2.startEndTime(startup2, "DTSTART", 49);
		endup2.startEndTime(endup2, "DTEND", 49);
		MyCalendar c = new MyCalendar("", "", "", startup, endup);
		MyCalendar c2 = new MyCalendar("", "", "", startup2, endup2);
		c2.calendar(c2, 49);
		c.calendar(c, 26);
		MyCalendar c3 = new MyCalendar("", "", "", startup3, endup3);
		startup3.startEndTime(startup3, "DTSTART", 67);
		endup3.startEndTime(endup3, "DTEND", 67);
		c3.calendar(c3, 67);
		MyCalendar c4 = new MyCalendar("", "", "", startup4, endup4);
		startup4.startEndTime(startup4, "DTSTART", 87);
		endup4.startEndTime(endup4, "DTEND", 87);
		c4.calendar(c4, 87);
		MyCalendar c5 = new MyCalendar("", "", "", startup5, endup5);
		startup5.startEndTime(startup5, "DTSTART", 107);
		endup5.startEndTime(endup5, "DTEND", 107);
		c5.calendar(c5, 107);
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 3000, 3000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * 	ici on cree un jlabel pour le date : jour / mois / année

		 */
		days = new JLabel("");
		days.setBackground(Color.WHITE);
		days.setHorizontalAlignment(SwingConstants.CENTER);
		Image day = new ImageIcon(this.getClass().getResource("/dayimg.png")).getImage();
		days.setIcon(new ImageIcon(day));
		days.setBounds(49, 142, 96, 94);
		contentPane.add(days);
		/**
		 * ici on cree un jlabel pour le temps de debut 
		 */
		timeend = new JLabel("");
		timeend.setHorizontalAlignment(SwingConstants.CENTER);
		Image start = new ImageIcon(this.getClass().getResource("/endhour.png")).getImage();
		timeend.setIcon(new ImageIcon(start));
		
		timeend.setBounds(315, 142, 96, 94);
		contentPane.add(timeend);
		/**
		 *ici on cree un jlabel pour le temps de fin 
		 */
		starttime = new JLabel("");
		Image end = new ImageIcon(this.getClass().getResource("/hourstart.png")).getImage();
		starttime.setIcon(new ImageIcon(end));
		starttime.setHorizontalAlignment(SwingConstants.CENTER);
		starttime.setBounds(178, 142, 96, 94);
		contentPane.add(starttime);
		/**
		 * ici on cree un jlabel pour ' summry'
		 */
		summry = new JLabel("");
		Image sum = new ImageIcon(this.getClass().getResource("/Summary.png")).getImage();
		summry.setIcon(new ImageIcon(sum));
		
		summry.setHorizontalAlignment(SwingConstants.CENTER);
		summry.setBounds(648, 142, 96, 94);
		contentPane.add(summry);
		/**
		 * ici on cree un jlabel pour 'location '
		 */
		locationn = new JLabel("");
		locationn.setHorizontalAlignment(SwingConstants.CENTER);
		Image loc = new ImageIcon(this.getClass().getResource("/location.png")).getImage();
		locationn.setIcon(new ImageIcon(loc));
		locationn.setBounds(1142, 128, 96, 94);
		contentPane.add(locationn);
		
		/***
		 * ici on cree un jlabel pour 'description'
		 */
		description = new JLabel("");
		description.setHorizontalAlignment(SwingConstants.CENTER);
		Image dec = new ImageIcon(this.getClass().getResource("/description.png")).getImage();
		description.setIcon(new ImageIcon(dec));
		description.setBounds(1639, 142, 96, 94);
		contentPane.add(description);
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'day/mounth/year' l'object 'c'
		 */
		lblday = new JLabel("New label");
		lblday.setHorizontalAlignment(SwingConstants.LEFT);
		lblday.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblday.setBounds(59, 238, 96, 40);
		contentPane.add(lblday);
		lblday.setText(c.getStart().getDay()+"/"+c.getStart().getMonth()+"/"+c.getStart().getYear());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de debut 'hour/minute/seconde' l'object 'c'
		 */
		jblstarttime = new JLabel("New label");
		jblstarttime.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jblstarttime.setHorizontalAlignment(SwingConstants.LEFT);
		jblstarttime.setBounds(170, 238, 96, 40);
		contentPane.add(jblstarttime);
		jblstarttime.setText(c.getStart().getHour()+":"+c.getStart().getMinute()+":"+c.getStart().getSeconde());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de  temps de fin 'hour/minute/seconde' l'object 'c'

		 */
		jblendTime = new JLabel("New label");
		jblendTime.setHorizontalAlignment(SwingConstants.LEFT);
		jblendTime.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jblendTime.setBounds(315, 238, 96, 40);
		contentPane.add(jblendTime);
		jblendTime.setText(c.getEnd().getHour()+":"+c.getEnd().getMinute()+":"+c.getEnd().getSeconde());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'summry' l'object 'c'
		 */
		jblsummary = new JLabel("New label");
		jblsummary.setHorizontalAlignment(SwingConstants.CENTER);
		jblsummary.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblsummary.setBounds(436, 238, 480, 40);
		contentPane.add(jblsummary);
		jblsummary.setText(c.getSummary());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'location' l'object 'c'
		 */
		jbllocation = new JLabel("New label");
		jbllocation.setHorizontalAlignment(SwingConstants.CENTER);
		jbllocation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jbllocation.setBounds(931, 238, 523, 40);
		contentPane.add(jbllocation);
		jbllocation.setText(c.getLocation());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'description' l'object 'c'
		 */
		jbldescription = new JLabel("New label");
		jbldescription.setHorizontalAlignment(SwingConstants.CENTER);
		jbldescription.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jbldescription.setBounds(1492, 238, 417, 40);
		contentPane.add(jbldescription);
		String s =c.getDescription();
		s = s.substring(11);
		if(s.contains("")) {
			s = s+"\n";
			jbldescription.setText(s);
		} 
		
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'day/mounth/year' l'object 'c2'
		 */
		lblday2 = new JLabel("New label");
		lblday2.setHorizontalAlignment(SwingConstants.LEFT);
		lblday2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblday2.setBounds(59, 308, 96, 40);
		contentPane.add(lblday2);
		lblday2.setText(c2.getStart().getDay()+"/"+c2.getStart().getMonth()+"/"+c2.getStart().getYear());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de debut 'hour/minute/seconde' l'object 'c2'
		 */
		lblstart2 = new JLabel("::");
		lblstart2.setHorizontalAlignment(SwingConstants.LEFT);
		lblstart2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblstart2.setBounds(170, 308, 96, 40);
		contentPane.add(lblstart2);
		lblstart2.setText(c2.getStart().getHour()+":"+c2.getStart().getMinute()+":"+c2.getStart().getMinute());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de fin 'hour/minute/seconde' l'object 'c2'
		 */
		lblend2 = new JLabel("::");
		lblend2.setHorizontalAlignment(SwingConstants.LEFT);
		lblend2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblend2.setBounds(315, 308, 96, 40);
		contentPane.add(lblend2);
		lblend2.setText(c2.getEnd().getHour()+":"+c2.getEnd().getMinute()+":"+c2.getEnd().getMinute());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'summry' l'object 'c2'
		 */
		jblsummry2 = new JLabel("");
		jblsummry2.setHorizontalAlignment(SwingConstants.CENTER);
		jblsummry2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblsummry2.setBounds(436, 308, 480, 40);
		contentPane.add(jblsummry2);
		jblsummry2.setText(c2.getSummary());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'location' l'object 'c2'
		 */
		jbllocation2 = new JLabel("");
		jbllocation2.setHorizontalAlignment(SwingConstants.CENTER);
		jbllocation2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jbllocation2.setBounds(931, 308, 536, 40);
		contentPane.add(jbllocation2);
		jbllocation2.setText(c2.getLocation());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'description' l'object 'c'
		 */
		jblDescription2 = new JLabel("New label");
		jblDescription2.setHorizontalAlignment(SwingConstants.CENTER);
		jblDescription2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblDescription2.setBounds(1492, 308, 417, 40);
		contentPane.add(jblDescription2);
		jblDescription2.setText(c2.getDescription());
		/**
		 *  ici on cree un bouton pour pouvoir changer la valeur des attributs d'object 'c'
		 */
		JButton btnsetting1 = new JButton("");
		btnsetting1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (dayScanner.getText().equals("") ) {
				lblday.setText(c.getStart().getDay()+"/"+c.getStart().getMonth()+"/"+c.getStart().getYear());
			}
			else {
			
			String laDateStart = dayScanner.getText();
			String dayStart = laDateStart.substring(0, 2);				

			String mounthStart = laDateStart.substring(3,5);
			String yearStart = laDateStart.substring(6,10);
			startup.setDay(dayStart);
			startup.setMonth(mounthStart);
			startup.setYear(yearStart);
			lblday.setText(laDateStart);
			}
			if (timestartScanner.getText().equals("")) {
				jblstarttime.setText(c.getStart().getHour()+":"+c.getStart().getMinute()+":"+c.getStart().getMinute());
			}
			else {
			String clockstart= timestartScanner.getText();
			String hourStart = clockstart.substring(0, 2);
			String minuteStart = clockstart.substring(3, 5);
			String secondStart = clockstart.substring(6, 8);
			startup.setHour(hourStart);
			startup.setMinute(minuteStart);
			startup.setSeconde(secondStart);
			
			jblstarttime.setText(clockstart);
			}
			if (timeEndScanner.getText().equals("")) {
				jblendTime.setText(c.getEnd().getHour()+":"+c.getEnd().getMinute()+":"+c.getEnd().getSeconde());
			}
			else {
				String clockend = timeEndScanner.getText();
				String hourend = clockend.substring(0, 2);
				String minuteend = clockend.substring(3, 5);
				String secondend = clockend.substring(6, 8);
				endup.setHour(hourend);
				endup.setMinute(minuteend);
				endup.setSeconde(secondend);
				jblendTime.setText(clockend);
				
			}
			if (summuryScanner.getText().equals("")) {
				jblsummary.setText(c.getSummary());
			}
			else {
				String newSummary = summuryScanner.getText();
				c.setSummary(newSummary);
				jblsummary.setText(newSummary);
			}
			if (locationScanner.getText().equals("")) {
			jbllocation.setText(c.getLocation());	
			}
			else {
				String newLocation = locationScanner.getText();
				c.setLocation(newLocation);
				jbllocation.setText(newLocation);
			}
			if (descriptionScanner.getText().equals("")) {
				
				String s =c.getDescription();
				s = s.substring(11);
					
				jbldescription.setText(s);
			
			}
			else {
				String newDescription = descriptionScanner.getText();
				c.setDescription(newDescription);
				jbldescription.setText(newDescription);
				
				
				
				
			}
			
			}
		});
		btnsetting1.setBackground(new Color(255, 255, 255));
		btnsetting1.setForeground(new Color(0, 0, 0));
		btnsetting1.setBounds(71, 600, 65, 61);
		Image setter = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		btnsetting1.setIcon(new ImageIcon(setter));
		contentPane.add(btnsetting1);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'jour / mounth/ year ' pour object 'c' il joue le role d'un scanner     
		 */
		dayScanner = new JTextField();
		dayScanner.setBounds(175, 616, 65, 30);
		contentPane.add(dayScanner);
		dayScanner.setColumns(10);
		/**
		 *  ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de debut pour object 'c' il joue le role d'un scanner
		 */
		timestartScanner = new JTextField();
		timestartScanner.setBounds(318, 616, 65, 30);
		contentPane.add(timestartScanner);
		timestartScanner.setColumns(10);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de fin pour object 'c' il joue le role d'un scanner
		 */
		timeEndScanner = new JTextField();
		timeEndScanner.setBounds(461, 616, 65, 30);
		contentPane.add(timeEndScanner);
		timeEndScanner.setColumns(10);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'summury' pour object 'c' il joue le role d'un scanner
		 */
		summuryScanner = new JTextField();
		summuryScanner.setBounds(604, 616, 65, 30);
		contentPane.add(summuryScanner);
		summuryScanner.setColumns(10);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'location' pour object 'c' il joue le role d'un scanner
		 */
		locationScanner = new JTextField();
		locationScanner.setBounds(747, 616, 65, 30);
		contentPane.add(locationScanner);
		locationScanner.setColumns(10);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'description' pour object 'c' il joue le role d'un scanner
		 */
		descriptionScanner = new JTextField();
		descriptionScanner.setBounds(890, 616, 68, 30);
		contentPane.add(descriptionScanner);
		descriptionScanner.setColumns(10);
		/**
		 * ici on cree un bouton pour pouvoir changer la valeur des attributs d'object 'c2'
		 */
		buttonSetting2 = new JButton("");
		buttonSetting2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (dayScanner2.getText().equals("") ) {
					lblday2.setText(c2.getStart().getDay()+"/"+c2.getStart().getMonth()+"/"+c2.getStart().getYear());
				}
				else {
				String laDateStart2 = dayScanner2.getText();
				String dayStart2 = laDateStart2.substring(0, 2);//				

				String mounthStart2 = laDateStart2.substring(3,5);
				String yearStart2 = laDateStart2.substring(6,10);
				startup2.setDay(dayStart2);
				startup2.setMonth(mounthStart2);
				startup2.setYear(yearStart2);
				lblday2.setText(laDateStart2);
				}
				if (timeStartScanner2.getText().equals("")) {
					lblstart2.setText(c2.getStart().getHour()+":"+c2.getStart().getMinute()+":"+c2.getStart().getSeconde());
				}
				else {
				String clockstart2= timeStartScanner2.getText();
				String hourStart2 = clockstart2.substring(0, 2);
				String minuteStart2 = clockstart2.substring(3, 5);
				String secondStart2 = clockstart2.substring(6, 8);
				startup2.setHour(hourStart2);
				startup2.setMinute(minuteStart2);
				startup2.setSeconde(secondStart2);
				
				lblstart2.setText(clockstart2);
				}
				if (timeEndScanner2.getText().equals("")) {
					lblend2.setText(c2.getEnd().getHour()+":"+c2.getEnd().getMinute()+":"+c2.getEnd().getSeconde());
				}
				else {
					String clockend2 = timeEndScanner2.getText();
					String hourend2 = clockend2.substring(0, 2);
					String minuteend2 = clockend2.substring(3, 5);
					String secondend2 = clockend2.substring(6, 8);
					endup2.setHour(hourend2);
					endup2.setMinute(minuteend2);
					endup2.setSeconde(secondend2);
					lblend2.setText(clockend2);
					
				}
				if (summuryScanner2.getText().equals("")) {
					jblsummry2.setText(c2.getSummary());
				}
				else {
					String newSummary2 = summuryScanner2.getText();
					c2.setSummary(newSummary2);
					jblsummry2.setText(newSummary2);
				}
				if (locationScanner2.getText().equals("")) {
				jbllocation2.setText(c2.getLocation());	
				}
				else {
					String newLocation2 = locationScanner2.getText();
					c2.setLocation(newLocation2);
					jbllocation2.setText(newLocation2);
				}
				if (descriptionScanner2.getText().equals("")) {
					
					String s =c2.getDescription();
					s = s.substring(11);
						
					jblDescription2.setText(s);
				
				}
				else {
					String newDescription2 = descriptionScanner2.getText();
					c2.setDescription(newDescription2);
					jblDescription2.setText(newDescription2);
							
					
				}
							
				
				
			}
		});
		buttonSetting2.setForeground(Color.BLACK);
		buttonSetting2.setBackground(Color.WHITE);
		buttonSetting2.setBounds(71, 679, 65, 61);
		Image setter2 = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		buttonSetting2.setIcon(new ImageIcon(setter2));
		contentPane.add(buttonSetting2);
		
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'jour / mounth/ year ' pour object 'c2' il joue le role d'un scanner   
		 */
		dayScanner2 = new JTextField();
		dayScanner2.setColumns(10);
		dayScanner2.setBounds(177, 696, 65, 30);
		contentPane.add(dayScanner2);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de debut pour object 'c2' il joue le role d'un scanner
		 */
		timeStartScanner2 = new JTextField();
		timeStartScanner2.setColumns(10);
		timeStartScanner2.setBounds(320, 696, 65, 30);
		contentPane.add(timeStartScanner2);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de fin pour object 'c2' il joue le role d'un scanner
		 */
		timeEndScanner2 = new JTextField();
		timeEndScanner2.setColumns(10);
		timeEndScanner2.setBounds(463, 696, 65, 30);
		contentPane.add(timeEndScanner2);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'summury' pour object 'c2' il joue le role d'un scanner
		 */
		summuryScanner2 = new JTextField();
		summuryScanner2.setColumns(10);
		summuryScanner2.setBounds(606, 696, 65, 30);
		contentPane.add(summuryScanner2);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'location' pour object 'c2' il joue le role d'un scanner
		 */
		locationScanner2 = new JTextField();
		locationScanner2.setColumns(10);
		locationScanner2.setBounds(749, 696, 65, 30);
		contentPane.add(locationScanner2);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'description' pour object 'c2' il joue le role d'un scanner
		 */
		descriptionScanner2 = new JTextField();
		descriptionScanner2.setColumns(10);
		descriptionScanner2.setBounds(892, 696, 65, 30);
		contentPane.add(descriptionScanner2);
		
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'day/mounth/year' l'object 'c3'
		 */
		 JLabel lblday3 = new JLabel("//");
		lblday3.setHorizontalAlignment(SwingConstants.LEFT);
		lblday3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblday3.setBounds(59, 364, 96, 40);
		contentPane.add(lblday3);
		lblday3.setText(c3.getStart().getDay()+"/"+c3.getStart().getMonth()+"/"+c3.getStart().getYear());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de debut 'hour/minute/seconde' l'object 'c3'
		 */
	
			
		JLabel lblstart3 = new JLabel("::");
		lblstart3.setHorizontalAlignment(SwingConstants.LEFT);
		lblstart3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblstart3.setBounds(170, 364, 96, 40);
		contentPane.add(lblstart3);
		lblstart3.setText(c3.getStart().getHour()+":"+c3.getStart().getMinute()+":"+c3.getStart().getMinute());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de fin 'hour/minute/seconde' l'object 'c3'
		 */
		lblend3 = new JLabel("::");
		lblend3.setHorizontalAlignment(SwingConstants.LEFT);
		lblend3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblend3.setBounds(315, 364, 96, 40);
		contentPane.add(lblend3);
		lblend3.setText(c3.getEnd().getHour()+":"+c3.getEnd().getMinute()+":"+c3.getEnd().getMinute());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'summry' l'object 'c3'
		 */
		jblsummry3 = new JLabel("");
		jblsummry3.setHorizontalAlignment(SwingConstants.CENTER);
		jblsummry3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblsummry3.setBounds(436, 374, 480, 40);
		contentPane.add(jblsummry3);
		jblsummry3.setText(c3.getSummary());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'location' l'object 'c3'
		 */
		jbllocation3 = new JLabel("");
		jbllocation3.setHorizontalAlignment(SwingConstants.CENTER);
		jbllocation3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jbllocation3.setBounds(931, 364, 537, 40);
		contentPane.add(jbllocation3);
		jbllocation3.setText(c3.getLocation());
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'description' l'object 'c3'
		 */
		jblDescription3 = new JLabel("");
		jblDescription3.setHorizontalAlignment(SwingConstants.CENTER);
		jblDescription3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblDescription3.setBounds(1492, 364, 417, 40);
		contentPane.add(jblDescription3);
		jblDescription3.setText(c3.getDescription());
		/**
		 * ici on cree un bouton pour pouvoir changer la valeur des attributs d'object 'c3'
		 */
		JButton buttonSetting3 = new JButton("");
		buttonSetting3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
				if (dayScanner3.getText().equals("") ) {
					lblday3.setText(c3.getStart().getDay()+"/"+c3.getStart().getMonth()+"/"+c3.getStart().getYear());
				}
				else {
				String laDateStart3 = dayScanner3.getText();
				String dayStart3 = laDateStart3.substring(0, 2);//				
				String mounthStart3 = laDateStart3.substring(3,5);
				String yearStart3 = laDateStart3.substring(6,10);
				startup3.setDay(dayStart3);
				startup3.setMonth(mounthStart3);
				startup3.setYear(yearStart3);
				lblday3.setText(laDateStart3);
				}
				if (timeStartScanner3.getText().equals("")) {
					lblstart3.setText(c3.getStart().getHour()+":"+c3.getStart().getMinute()+":"+c3.getStart().getSeconde());
				}
				else {
				String clockstart3= timeStartScanner3.getText();
				String hourStart3 = clockstart3.substring(0, 2);
				String minuteStart3 = clockstart3.substring(3, 5);
				String secondStart3 = clockstart3.substring(6, 8);
				startup3.setHour(hourStart3);
				startup3.setMinute(minuteStart3);
				startup3.setSeconde(secondStart3);
				
				lblstart3.setText(clockstart3);
				}
				if (timeEndScanner3.getText().equals("")) {
					lblend4.setText(c3.getEnd().getHour()+":"+c3.getEnd().getMinute()+":"+c3.getEnd().getSeconde());
				}
	
				
				else {
					String clockend3 = timeEndScanner3.getText();
					String hourend3 = clockend3.substring(0, 2);
					String minuteend3 = clockend3.substring(3, 5);
					String secondend3 = clockend3.substring(6, 8);
					endup3.setHour(hourend3);
					endup3.setMinute(minuteend3);
					endup3.setSeconde(secondend3);
					lblend3.setText(clockend3);
					
				}
				if (summuryScanner3.getText().equals("")) {
					jblsummry3.setText(c3.getSummary());
				}
				else {
					String newSummary3 = summuryScanner3.getText();
					c3.setSummary(newSummary3);
					jblsummry3.setText(newSummary3);
				}
				if (locationScanner3.getText().equals("")) {
				jbllocation3.setText(c3.getLocation());	
				}
				else {
					String newLocation3 = locationScanner3.getText();
					c3.setLocation(newLocation3);
					jbllocation3.setText(newLocation3);
				}
				if (descriptionScanner3.getText().equals("")) {
					
					String s =c3.getDescription();
					s = s.substring(11);
						
					jblDescription3.setText(s);
				
				}
				else {
					String newDescription3 = descriptionScanner3.getText();
					c3.setDescription(newDescription3);
					jblDescription3.setText(newDescription3);
							
					
				}
			
			
			
			
			
			
			
			}
		});
		buttonSetting3.setForeground(Color.BLACK);
		buttonSetting3.setBackground(Color.WHITE);
		buttonSetting3.setBounds(71, 758, 65, 61);
		Image setter3 = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		buttonSetting3.setIcon(new ImageIcon(setter3));
		contentPane.add(buttonSetting3);
		/**
		 *  ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'jour / mounth/ year ' pour object 'c3' il joue le role d'un scanner
		 */
		dayScanner3 = new JTextField();
		dayScanner3.setColumns(10);
		dayScanner3.setBounds(181, 776, 65, 30);
		contentPane.add(dayScanner3);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de debut pour object 'c3' il joue le role d'un scanner
		 */
		timeStartScanner3 = new JTextField();
		timeStartScanner3.setColumns(10);
		timeStartScanner3.setBounds(324, 777, 65, 30);
		contentPane.add(timeStartScanner3);
		/**
		 *  ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de fin pour object 'c3' il joue le role d'un scanner

		 */
		timeEndScanner3 = new JTextField();
		timeEndScanner3.setColumns(10);
		timeEndScanner3.setBounds(467, 780, 65, 30);
		contentPane.add(timeEndScanner3);
		/**
		 *  ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'summury' pour object 'c3' il joue le role d'un scanner
		 *
		 */
		summuryScanner3 = new JTextField();
		summuryScanner3.setColumns(10);
		summuryScanner3.setBounds(610, 780, 65, 30);
		contentPane.add(summuryScanner3);
		/**
		 * 	ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'location' pour object 'c3' il joue le role d'un scanner

		 */
		locationScanner3 = new JTextField();
		locationScanner3.setColumns(10);
		locationScanner3.setBounds(753, 780, 65, 30);
		contentPane.add(locationScanner3);
		/**
		 * 	ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'description' pour object 'c3' il joue le role d'un scanner
		 */
		descriptionScanner3 = new JTextField();
		descriptionScanner3.setColumns(10);
		descriptionScanner3.setBounds(896, 780, 65, 30);
		contentPane.add(descriptionScanner3);
		/**
		 * ici on cree un jlabel pour affichier la valeur de 'day/mounth/year' l'object 'c4'
		 */
		lblday4 = new JLabel("//");
		lblday4.setHorizontalAlignment(SwingConstants.LEFT);
		lblday4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblday4.setBounds(59, 420, 96, 40);
		contentPane.add(lblday4);
		lblday4.setText(c4.getStart().getDay()+"/"+c4.getStart().getMonth()+"/"+c4.getStart().getYear());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de debut 'hour/minute/seconde' l'object 'c4'
		 */
		JLabel lblstart4 = new JLabel("::");
		lblstart4.setHorizontalAlignment(SwingConstants.LEFT);
		lblstart4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblstart4.setBounds(170, 420, 96, 40);
		contentPane.add(lblstart4);
		lblstart4.setText(c4.getStart().getHour()+":"+c4.getStart().getMinute()+":"+c4.getStart().getSeconde());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de fin 'hour/minute/seconde' l'object 'c4'
		 */
		lblend4 = new JLabel("::");
		lblend4.setHorizontalAlignment(SwingConstants.LEFT);
		lblend4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblend4.setBounds(315, 420, 96, 40);
		contentPane.add(lblend4);
		lblend4.setText(c4.getEnd().getHour()+":"+c4.getEnd().getMinute()+":"+c4.getEnd().getSeconde());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'summry' l'object 'c4'
		 */
		jblsummry4 = new JLabel("");
		jblsummry4.setHorizontalAlignment(SwingConstants.CENTER);
		jblsummry4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblsummry4.setBounds(436, 420, 480, 40);
		contentPane.add(jblsummry4);
		jblsummry4.setText(c4.getSummary());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'location' l'object 'c4'
		 */
		
		jbllocation4 = new JLabel("");
		jbllocation4.setHorizontalAlignment(SwingConstants.CENTER);
		jbllocation4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jbllocation4.setBounds(931, 420, 537, 40);
		contentPane.add(jbllocation4);
		jbllocation4.setText(c4.getLocation());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'description' l'object 'c4'
		 */
		jblDescription4 = new JLabel("");
		jblDescription4.setHorizontalAlignment(SwingConstants.CENTER);
		jblDescription4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblDescription4.setBounds(1492, 420, 417, 40);
		contentPane.add(jblDescription4);
		jblDescription4.setText(c4.getDescription());
		/**
		 * ici on cree un bouton pour pouvoir changer la valeur des attributs d'object 'c4'
		 */
		buttonSetting4 = new JButton("");
		buttonSetting4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (dayScanner4.getText().equals("") ) {
					lblday4.setText(c4.getStart().getDay()+"/"+c4.getStart().getMonth()+"/"+c4.getStart().getYear());
				}
				
				else {
				String laDateStart4 = dayScanner4.getText();
				String dayStart4 = laDateStart4.substring(0, 2);//				
				String mounthStart4 = laDateStart4.substring(3,5);
				String yearStart4 = laDateStart4.substring(6,10);
				startup4.setDay(dayStart4);
				startup4.setMonth(mounthStart4);
				startup4.setYear(yearStart4);
				lblday4.setText(laDateStart4);
				}
				
				if (timeStartScanner4.getText().equals("")) {
					lblstart4.setText(c4.getStart().getHour()+":"+c4.getStart().getMinute()+":"+c4.getStart().getSeconde());
				}
				
				else {
				String clockstart4= timeStartScanner4.getText();
				String hourStart4 = clockstart4.substring(0, 2);
				String minuteStart4 = clockstart4.substring(3, 5);
				String secondStart4 = clockstart4.substring(6, 8);
				startup4.setHour(hourStart4);
				startup4.setMinute(minuteStart4);
				startup4.setSeconde(secondStart4);
				lblstart4.setText(clockstart4);
				}
				
				if (timeEndScanner4.getText().equals("")) {
					lblstart4.setText(c4.getEnd().getHour()+":"+c4.getEnd().getMinute()+":"+c4.getEnd().getSeconde());
				}
				
				else {
					String clockend4 = timeEndScanner4.getText();
					String hourend4 = clockend4.substring(0, 2);
					String minuteend4 = clockend4.substring(3, 5);
					String secondend4 = clockend4.substring(6, 8);
					endup4.setHour(hourend4);
					endup4.setMinute(minuteend4);
					endup4.setSeconde(secondend4);
					lblend4.setText(clockend4);
					
				}
				if (summuryScanner4.getText().equals("")) {
					jblsummry4.setText(c4.getSummary());
				}
				else {
					String newSummary4 = summuryScanner4.getText();
					c4.setSummary(newSummary4);
					jblsummry4.setText(newSummary4);
				}
				if (locationScanner4.getText().equals("")) {
				jbllocation4.setText(c4.getLocation());	
				}
				else {
					String newLocation4 = locationScanner4.getText();
					c4.setLocation(newLocation4);
					jbllocation4.setText(newLocation4);
				}
				if (descriptionScanner4.getText().equals("")) {
					
					String s =c4.getDescription();
					s = s.substring(11);
						
					jblDescription4.setText(s);
				
				}
				else {
					String newDescription4 = descriptionScanner4.getText();
					c4.setDescription(newDescription4);
					jblDescription4.setText(newDescription4);
							
					
				}
			
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		buttonSetting4.setForeground(Color.BLACK);
		buttonSetting4.setBackground(Color.WHITE);
		buttonSetting4.setBounds(73, 837, 65, 61);
		Image setter4 = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		buttonSetting4.setIcon(new ImageIcon(setter4));
		contentPane.add(buttonSetting4);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'jour / mounth/ year ' pour object 'c4' il joue le role d'un scanner
		 */
		dayScanner4 = new JTextField();
		dayScanner4.setColumns(10);
		dayScanner4.setBounds(179, 855, 65, 30);
		contentPane.add(dayScanner4);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de debut pour object 'c4' il joue le role d'un scanner
		 */
		timeStartScanner4 = new JTextField();
		timeStartScanner4.setColumns(10);
		timeStartScanner4.setBounds(322, 855, 65, 30);
		contentPane.add(timeStartScanner4);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de fin pour object 'c4' il joue le role d'un scanner
		 */
		timeEndScanner4 = new JTextField();
		timeEndScanner4.setColumns(10);
		timeEndScanner4.setBounds(465, 855, 65, 30);
		contentPane.add(timeEndScanner4);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'summury' pour object 'c4' il joue le role d'un scanner

		 */
		summuryScanner4 = new JTextField();
		summuryScanner4.setColumns(10);
		summuryScanner4.setBounds(608, 855, 65, 30);
		contentPane.add(summuryScanner4);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'location' pour object 'c4' il joue le role d'un scanner
		 */
		locationScanner4 = new JTextField();
		locationScanner4.setColumns(10);
		locationScanner4.setBounds(751, 855, 65, 30);
		contentPane.add(locationScanner4);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'description' pour object 'c4' il joue le role d'un scanner
		 */
		descriptionScanner4 = new JTextField();
		descriptionScanner4.setColumns(10);
		descriptionScanner4.setBounds(894, 855, 65, 30);
		contentPane.add(descriptionScanner4);
		/**
		 *  ici on cree un jlabel pour affichier la valeur de  temps de debut 'hour/minute/seconde' l'object 'c5'
		 */
		lblday5 = new JLabel("//");
		lblday5.setHorizontalAlignment(SwingConstants.LEFT);
		lblday5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblday5.setBounds(59, 486, 96, 40);
		contentPane.add(lblday5);
		lblday5.setText(c5.getStart().getDay()+"/"+c5.getStart().getMonth()+"/"+c5.getStart().getYear());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de debut 'hour/minute/seconde' l'object 'c5'
		 */
		lblstart5 = new JLabel("::");
		lblstart5.setHorizontalAlignment(SwingConstants.LEFT);
		lblstart5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblstart5.setBounds(170, 486, 96, 40);
		contentPane.add(lblstart5);
		lblstart5.setText(c5.getStart().getHour()+":"+c5.getStart().getMinute()+":"+c5.getStart().getSeconde());
		/**
		 * ici on cree un jlabel pour affichier la valeur de  temps de fin 'hour/minute/seconde' l'object 'c5'
		 */
		lblend5 = new JLabel("::");
		lblend5.setHorizontalAlignment(SwingConstants.LEFT);
		lblend5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblend5.setBounds(315, 486, 96, 40);
		contentPane.add(lblend5);
		lblend5.setText(c5.getEnd().getHour()+":"+c5.getEnd().getMinute()+":"+c5.getEnd().getSeconde());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'summry' l'object 'c5'
		 */
		jblsummry5 = new JLabel("");
		jblsummry5.setHorizontalAlignment(SwingConstants.CENTER);
		jblsummry5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblsummry5.setBounds(436, 486, 480, 40);
		contentPane.add(jblsummry5);
		jblsummry5.setText(c5.getSummary());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'location' l'object 'c5'
		 */
		jbllocation5 = new JLabel("");
		jbllocation5.setHorizontalAlignment(SwingConstants.CENTER);
		jbllocation5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jbllocation5.setBounds(931, 486, 537, 40);
		contentPane.add(jbllocation5);
		jbllocation5.setText(c5.getLocation());
		/**
		 *  ici on cree un jlabel pour affichier la valeur de 'description' l'object 'c4'
		 */
		jblDescription5 = new JLabel("");
		jblDescription5.setHorizontalAlignment(SwingConstants.CENTER);
		jblDescription5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		jblDescription5.setBounds(1492, 486, 417, 40);
		contentPane.add(jblDescription5);
		jblDescription5.setText(c5.getDescription());
		/**
		 * ici on cree un bouton pour pouvoir changer la valeur des attributs d'object 'c5'
		 */
		buttonSetting5 = new JButton("");
		buttonSetting5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				if (dayScanner5.getText().equals("") ) {
					lblday5.setText(c5.getStart().getDay()+"/"+c5.getStart().getMonth()+"/"+c5.getStart().getYear());
				}
				else {
				String laDateStart5 = dayScanner5.getText();
				String dayStart5 = laDateStart5.substring(0, 2);//				

				String mounthStart5 = laDateStart5.substring(3,5);
				String yearStart5 = laDateStart5.substring(6,10);
				startup5.setDay(dayStart5);
				startup5.setMonth(mounthStart5);
				startup5.setYear(yearStart5);
				lblday5.setText(laDateStart5);
				}
				if (timeStartScanner5.getText().equals("")) {
					lblstart5.setText(c5.getStart().getHour()+":"+c5.getStart().getMinute()+":"+c5.getStart().getSeconde());
				}
				else {
				String clockstart5= timeStartScanner5.getText();
				String hourStart5 = clockstart5.substring(0, 2);
				String minuteStart5 = clockstart5.substring(3, 5);
				String secondStart5 = clockstart5.substring(6, 8);
				startup5.setHour(hourStart5);
				startup5.setMinute(minuteStart5);
				startup5.setSeconde(secondStart5);
				lblstart5.setText(clockstart5);
				}
				
				if (timeEndScanner5.getText().equals("")) {
					lblstart5.setText(c5.getEnd().getHour()+":"+c5.getEnd().getMinute()+":"+c5.getEnd().getSeconde());
				}
				
				else {
					String clockend5 = timeEndScanner5.getText();
					String hourend5 = clockend5.substring(0, 2);
					String minuteend5 = clockend5.substring(3, 5);
					String secondend5 = clockend5.substring(6, 8);
					endup5.setHour(hourend5);
					endup5.setMinute(minuteend5);
					endup5.setSeconde(secondend5);
					lblend5.setText(clockend5);
					
				}
				if (summuryScanner5.getText().equals("")) {
					jblsummry5.setText(c5.getSummary());
				}
				else {
					String newSummary5 = summuryScanner5.getText();
					c5.setSummary(newSummary5);
					jblsummry5.setText(newSummary5);
				}
				if (locationScanner5.getText().equals("")) {
				jbllocation5.setText(c5.getLocation());	
				}
				else {
					String newLocation5 = locationScanner5.getText();
					c5.setLocation(newLocation5);
					jbllocation5.setText(newLocation5);
				}
				
				if (descriptionScanner5.getText().equals("")) {
					
					String s =c5.getDescription();
					s = s.substring(11);
						
					jblDescription5.setText(s);
				
				}
				else {
					String newDescription5 = descriptionScanner5.getText();
					c5.setDescription(newDescription5);
					jblDescription5.setText(newDescription5);
							
					
				}
			
			
			
			
			}
		});
		buttonSetting5.setForeground(Color.BLACK);
		buttonSetting5.setBackground(Color.WHITE);
		buttonSetting5.setBounds(72, 916, 65, 61);
		Image setter5 = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		buttonSetting5.setIcon(new ImageIcon(setter5));
		contentPane.add(buttonSetting5);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'jour / mounth/ year ' pour object 'c5' il joue le role d'un scanner
         *
		 */
		dayScanner5 = new JTextField();
		dayScanner5.setColumns(10);
		dayScanner5.setBounds(177, 932, 65, 30);
		contentPane.add(dayScanner5);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de debut pour object 'c5' il joue le role d'un scanner
		 */
		timeStartScanner5 = new JTextField();
		timeStartScanner5.setColumns(10);
		timeStartScanner5.setBounds(318, 932, 60, 30);
		contentPane.add(timeStartScanner5);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau temps de fin pour object 'c5' il joue le role d'un scanner
		 */
		timeEndScanner5 = new JTextField();
		timeEndScanner5.setColumns(10);
		timeEndScanner5.setBounds(461, 932, 65, 30);
		contentPane.add(timeEndScanner5);
		/**
		 * 	ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'summury' pour object 'c5' il joue le role d'un scanner
		 */
		summuryScanner5 = new JTextField();
		summuryScanner5.setColumns(10);
		summuryScanner5.setBounds(604, 932, 65, 30);
		contentPane.add(summuryScanner5);
		/**
		 * ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'location' pour object 'c5' il joue le role d'un scanner
		 */
		locationScanner5 = new JTextField();
		locationScanner5.setColumns(10);
		locationScanner5.setBounds(747, 932, 65, 30);
		contentPane.add(locationScanner5);
		/**
		 * 	ici on cree un jtextFeild pour pouvoir ecrire le nouveau 'description' pour object 'c5' il joue le role d'un scanner

		 */
		descriptionScanner5 = new JTextField();
		descriptionScanner5.setColumns(10);
		descriptionScanner5.setBounds(893, 932, 65, 30);
		contentPane.add(descriptionScanner5);
		/**
		 * on cree un jlabel qui affiche une image de nombre '1' roman 
		 */
		romanone = new JLabel("New label");
		romanone.setHorizontalAlignment(SwingConstants.CENTER);
		romanone.setBounds(0, 600, 37, 61);
		Image one = new ImageIcon(this.getClass().getResource("/one.png")).getImage();
		romanone.setIcon(new ImageIcon(one));
		contentPane.add(romanone);
		/**
		 * on cree un jlabel qui affiche une image de nombre '2' roman 
		 */
		tworoman = new JLabel("New label");
		tworoman.setHorizontalAlignment(SwingConstants.CENTER);
		tworoman.setBounds(0, 679, 51, 61);
		Image two = new ImageIcon(this.getClass().getResource("/two.png")).getImage();
		tworoman.setIcon(new ImageIcon(two));
		contentPane.add(tworoman);
		/**
		 * on cree un jlabel qui affiche une image de nombre '3' roman 
		 */
		threeroman = new JLabel("New label");
		threeroman.setHorizontalAlignment(SwingConstants.CENTER);
		threeroman.setBounds(0, 758, 66, 61);
		Image three = new ImageIcon(this.getClass().getResource("/three.png")).getImage();
		threeroman.setIcon(new ImageIcon(three));
		contentPane.add(threeroman);
		/**
		 * on cree un jlabel qui affiche une image de nombre '4' roman 
		 */
		fourroman = new JLabel("New label");
		fourroman.setHorizontalAlignment(SwingConstants.CENTER);
		Image four = new ImageIcon(this.getClass().getResource("/four.png")).getImage();
		fourroman.setIcon(new ImageIcon(four));
		fourroman.setBounds(0, 837, 66, 61);
		contentPane.add(fourroman);
		/**
		 * on cree un jlabel qui affiche une image de nombre '5' roman 
		 */
		fiveroman = new JLabel("New label");
		fiveroman.setHorizontalAlignment(SwingConstants.CENTER);
		Image five = new ImageIcon(this.getClass().getResource("/five.png")).getImage();
		fiveroman.setIcon(new ImageIcon(five));
		fiveroman.setBounds(0, 916, 51, 61);
		contentPane.add(fiveroman);
		/**
		 * ici on cree un bouton qui fait la seralisation par l'appel de la methode qui est dans la classe MyCalendar
		 */
		savebutton = new JButton("");
		
		Image setter1 = new ImageIcon(this.getClass().getResource("/save2.png")).getImage();
		savebutton.setIcon(new ImageIcon(setter1));
				
		savebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			c.seria(c, "c.ser");
			c2.seria(c2, "c2.ser");
			c3.seria(c3, "c3.ser");
			c4.seria(c4, "c4.ser");
			c5.seria(c5, "c5.ser");
			
			
			}
		});
		savebutton.setBounds(0, 0, 43, 29);
		contentPane.add(savebutton);
		/**
		 * ici on cree un bouton qui fait la deseralisation par l'appel de la methode qui est dans la classe MyCalendar
		 */
		loadbutton = new JButton("");
		Image setter22 = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
		loadbutton.setIcon(new ImageIcon(setter22));
		
		
		loadbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				MyCalendar x = c.derser("c.ser");
				MyCalendar x2 = c2.derser("c2.ser");
				MyCalendar x3 = c3.derser("c3.ser");
				MyCalendar x4 = c4.derser("c4.ser");
				MyCalendar x5 = c5.derser("c5.ser");

				
				lblday.setText(x.getStart().getDay()+"/"+x.getStart().getMonth()+"/"+x.getStart().getYear());
				jblstarttime.setText(x.getStart().getHour()+":"+x.getStart().getMinute()+":"+x.getStart().getSeconde());
				jblendTime.setText(x.getEnd().getHour()+":"+x.getEnd().getMinute()+":"+x.getEnd().getSeconde());
				jblsummary.setText(x.getSummary());
				jbllocation.setText(x.getLocation());
				jbldescription.setText(x.getDescription());
				
				lblday2.setText(x2.getStart().getDay()+"/"+x2.getStart().getMonth()+"/"+x2.getStart().getYear());
				lblstart2.setText(x2.getStart().getHour()+":"+x2.getStart().getMinute()+":"+x2.getStart().getSeconde());
				lblend2.setText(x2.getEnd().getHour()+":"+x2.getEnd().getMinute()+":"+x2.getEnd().getSeconde());
				jbllocation2.setText(x2.getLocation());
				jblsummry2.setText(x2.getSummary());
				jblDescription2.setText(x2.getDescription());
				
				
				  lblday3.setText(x3.getStart().getDay()+"/"+x3.getStart().getMonth()+"/"+x3.getStart().getYear());
				  lblstart3.setText(x3.getStart().getHour()+":"+x3.getStart().getMinute()+":"+x3.getStart().getSeconde());
				  lblend3.setText(x3.getEnd().getHour()+":"+x3.getEnd().getMinute()+":"+x3.getEnd().getSeconde());
				  jblsummry3.setText(x3.getSummary());
				  jbllocation3.setText(x3.getLocation());
				  jblDescription3.setText(x3.getLocation());
				  
				  
				  lblday4.setText(x4.getStart().getDay()+"/"+x4.getStart().getMonth()+"/"+x4.getStart().getYear());
				  lblstart4.setText(x4.getStart().getHour()+":"+x4.getStart().getMinute()+":"+x4.getStart().getSeconde());
				  lblend4.setText(x4.getEnd().getHour()+":"+x4.getEnd().getMinute()+":"+x4.getEnd().getSeconde());
				  jblsummry4.setText(x4.getSummary());
				  jbllocation4.setText(x4.getLocation());
				  jblDescription4.setText(x4.getLocation());
				  
				  
				  lblday5.setText(x5.getStart().getDay()+"/"+x5.getStart().getMonth()+"/"+x5.getStart().getYear());
				  lblstart5.setText(x5.getStart().getHour()+":"+x5.getStart().getMinute()+":"+x5.getStart().getSeconde());
				  lblend5.setText(x5.getEnd().getHour()+":"+x5.getEnd().getMinute()+":"+x5.getEnd().getSeconde());
				  jblsummry5.setText(x5.getSummary());
				  jbllocation5.setText(x5.getLocation());
				  jblDescription5.setText(x5.getLocation());
				  
				  
				  
				  
				  
				
				
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			}
		});
		loadbutton.setBounds(43, 0, 43, 29);
		contentPane.add(loadbutton);
		/**
		 * ici on cree un bouton qui genere un fragment html par l'appel de la methode qui est dans la classe MyCalendar
		 */
		JButton htmlBouton = new JButton("");
		Image setter33 = new ImageIcon(this.getClass().getResource("/html.png")).getImage();
		htmlBouton.setIcon(new ImageIcon(setter33));
		
		
		htmlBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					c.htmlLinesCalendar(c, "c.html");
					c2.htmlLinesCalendar(c2, "c2.html");
					c3.htmlLinesCalendar(c3, "c3.html");
					c4.htmlLinesCalendar(c4, "c4.html");
					c5.htmlLinesCalendar(c5, "c5.html");

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				
				
			}
		});
		htmlBouton.setBounds(86, 0, 43, 29);
		contentPane.add(htmlBouton);
		
		
		
		
				
		
		
		
		
	}
}
