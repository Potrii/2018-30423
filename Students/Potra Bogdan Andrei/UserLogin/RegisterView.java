package lab9_b;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class RegisterView extends JFrame {

	private JTextField usernameTextField;
	private JPasswordField usernamePasswordField;

	private JTextField firstNameTextField;
	private JTextField lastNameTextField;

	private JButton registerButton;

	public RegisterView() {

		this.setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		// first name
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setBounds(50, 20, 100, 30);
		getContentPane().add(firstNameLabel);

		firstNameTextField = new JTextField();
		firstNameTextField.setBounds(130, 20, 140, 30);
		getContentPane().add(firstNameTextField);

		// last name
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setBounds(50, 60, 100, 30);
		getContentPane().add(lastNameLabel);

		lastNameTextField = new JTextField();
		lastNameTextField.setBounds(130, 60, 140, 30);
		getContentPane().add(lastNameTextField);

		// username
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(50, 100, 100, 30);
		getContentPane().add(usernameLabel);

		usernameTextField = new JTextField();
		usernameTextField.setBounds(130, 100, 140, 30);
		getContentPane().add(usernameTextField);

		// password
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(50, 140, 100, 30);
		getContentPane().add(passwordLabel);

		usernamePasswordField = new JPasswordField();
		usernamePasswordField.setBounds(130, 140, 140, 30);
		getContentPane().add(usernamePasswordField);

		// register button
		registerButton = new JButton("Register !");
		registerButton.setBounds(120, 200, 120, 80);
		getContentPane().add(registerButton);
	}

	public String getFirstName() {
		return firstNameTextField.getText();
	}

	public String getLastName() {
		return lastNameTextField.getText();
	}

	public String getUsername() {
		return usernameTextField.getText();
	}

	public String getPassword() {
		return usernamePasswordField.getText();
	}

	public void setFirstName(String firstName) {
		this.firstNameTextField.setText(firstName);
	}

	public void setLastName(String lastName) {
		this.lastNameTextField.setText(lastName);
	}

	public void setUsername(String username) {
		this.usernameTextField.setText(username);
	}

	public void setPassword(String password) {
		this.usernamePasswordField.setText(password);
	}

	public void addRegisterButtonActionListener(final ActionListener actionListener) {
		registerButton.addActionListener(actionListener);
	}
}
