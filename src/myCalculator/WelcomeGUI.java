package myCalculator;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class WelcomeGUI {
	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeGUI window = new WelcomeGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public WelcomeGUI() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 691, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 246, 358);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel("My Calculator");
		lblNewLabel.setBounds(29, 77, 184, 44);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setForeground(new Color(245, 245, 245));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
		JLabel label = new JLabel("");
		Image logo=new ImageIcon(this.getClass().getResource("/CalculatorIcon.png")).getImage();
		label.setIcon(new ImageIcon(logo));
		label.setForeground(Color.black);
		label.setFont(new Font("Century Gothic", Font.BOLD, 27));
		label.setBackground(Color.BLACK);
		label.setBounds(71, 132, 107, 81);
		panel.add(label);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.black);
		panel_1.setBounds(245, 0, 430, 358);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		JLabel label_1 = new JLabel("");
		label_1.setBounds(174, 157, 46, 14);
		panel_1.add(label_1);
		JLabel lblNewLabel_2 = new JLabel("Welcome");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblNewLabel_2.setForeground(SystemColor.CYAN);
		lblNewLabel_2.setBounds(114, 68, 213, 59);
		panel_1.add(lblNewLabel_2);
		JButton btnAbout = new JButton("About");
		btnAbout.setFocusable(false);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new About();
			}
		});
		btnAbout.setForeground(SystemColor.CYAN);
		btnAbout.setBackground(SystemColor.blue);
		btnAbout.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnAbout.setHorizontalAlignment(SwingConstants.LEFT);
		btnAbout.setBounds(229, 182, 91, 41);
		panel_1.add(btnAbout);
		JButton btnStart = new JButton("Start");
		btnStart.setFocusable(false);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Calculator();
				frame.dispose();
			}
		});
		btnStart.setVerticalAlignment(SwingConstants.TOP);
		btnStart.setForeground(SystemColor.CYAN);
		btnStart.setBackground(SystemColor.blue);
		btnStart.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnStart.setBounds(114, 182, 91, 41);
		panel_1.add(btnStart);
	}
}
