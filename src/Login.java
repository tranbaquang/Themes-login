import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserNameServer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		// font
		Font f = new Font("Serif", Font.BOLD, 17);

		// Login panel
		JPanel login = new JPanel();
		setSize(680, 473);
		//login.setBackground(new Color(255, 255, 255));
		login.setBounds(350, 40, 270, 350);
		login.setBackground(new Color(0, 0, 0, 50));

		// Background
		setSize(680, 468);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon imgB = new ImageIcon("/root/Java_Project/Background/image/0.png");
		Image img = imgB.getImage();
		Image temp_img = img.getScaledInstance(680, 600, Image.SCALE_SMOOTH);
		imgB = new ImageIcon(temp_img);
		JLabel background = new JLabel("", imgB, JLabel.CENTER);

		background.add(login);
		login.setLayout(null);

		txtUserNameServer = new JTextField();
		txtUserNameServer.setEditable(false);
		txtUserNameServer.setBackground(new Color(255, 255, 255));
		txtUserNameServer.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtUserNameServer.setForeground(new Color(255, 255, 255));
		txtUserNameServer.setText("User name: Server");
		txtUserNameServer.setBounds(39, 68, 190, 34);
		
		
		login.add(txtUserNameServer);
		txtUserNameServer.setColumns(10);
		background.setBounds(0, 0, 680, 430);
		getContentPane().add(background);

		setVisible(true);
	}
}
