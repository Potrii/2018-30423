package lab9_b;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginView extends JFrame {

	private JTextField usernameTextField;
	private JPasswordField usernamePasswordField;
	
	private JLabel loginLabel;
	
	private JButton loginButton;
	private JButton notRegisteredButton;

	public LoginView() {

	// FORM
		this.setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

	// LABELS
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(114, 32, 84, 14);
		getContentPane().add(usernameLabel);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(114, 100, 84, 14);
		getContentPane().add(passwordLabel);
		
		// font and color
		loginLabel = new JLabel("");
		loginLabel.setFont(new Font("TimesRoman",Font.BOLD,12));
		loginLabel.setForeground(Color.blue);
		loginLabel.setBounds(10,180,180,50);
		getContentPane().add(loginLabel);
		loginLabel.setVisible(false);

		
	// TEXT BOXES
		usernameTextField = new JTextField();
		usernameTextField.setBounds(114, 50, 140, 25);
		getContentPane().add(usernameTextField);

		usernamePasswordField = new JPasswordField();
		usernamePasswordField.setBounds(114, 120, 140, 25);
		getContentPane().add(usernamePasswordField);

	// BUTTONS
		loginButton = new JButton("Login");
		loginButton.setBounds(200, 200, 90, 40);
		getContentPane().add(loginButton);

		notRegisteredButton = new JButton("Register Now!");
		notRegisteredButton.setBounds(200, 250, 150, 40);
		getContentPane().add(notRegisteredButton);
	}

	public void addLoginButtonActionListener(final ActionListener actionListener) {
		loginButton.addActionListener(actionListener);
	}

	public void addNotRegisteredButtonActionListener(final ActionListener actionListener) {
		notRegisteredButton.addActionListener(actionListener);
	}

	public String getUsername() {
		return usernameTextField.getText();
	}

	public String getPassword() {
		return usernamePasswordField.getText();
	}

	public void setUsername(String username) {
		this.usernameTextField.setText(username);
	}

	public void setPassword(String password) {
		this.usernamePasswordField.setText(password);
	}
	
	public void setLoginLabel(String loginLabel)
	{
		this.loginLabel.setText(loginLabel);
	}
	
	public void setVisibilityLoginLabel(boolean state)
	{
		this.loginLabel.setVisible(state);
	}
}
