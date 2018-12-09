package lab9_b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainController {

	private LoginView loginView;
	private RegisterView registerView;
	List<User> listOfUsers = new ArrayList<>();
	User newUser;

	public void start() {
		loginView = new LoginView();
		registerView = new RegisterView();
		loginView.setVisible(true);

		initializeButtonListeners();

	}

	private void initializeButtonListeners() {

		loginView.addLoginButtonActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// get username and pass
				String thisUsername = loginView.getUsername();
				String thisPassword = loginView.getPassword();

				User thisUser = findUser(loginView.getUsername());

				// check if it exists
				if (thisUser != null) {
					// System.out.println(thisUser.getPassword() + " " + thisPassword);
					if (thisUser.getPassword().equals(thisPassword)) {
						loginView.setLoginLabel("User accepted !");
						loginView.setVisibilityLoginLabel(true);
						// System.out.println("User accepted");
					} else {
						loginView.setLoginLabel("User found, WROND password !");
						loginView.setVisibilityLoginLabel(true);
						// System.out.println("Username found, WRONG password");
					}

				} else {
					loginView.setLoginLabel("Username NOT FOUND");
					loginView.setVisibilityLoginLabel(true);
					//System.out.println("Username NOT FOUND");
				}

				// empty text boxes
				loginView.setUsername("");
				loginView.setPassword("");
			}
		});

		loginView.addNotRegisteredButtonActionListener(e -> {

			// go to register screen
			loginView.setVisible(false);
			loginView.setVisibilityLoginLabel(false);
			registerView.setVisible(true);
		});

		registerView.addRegisterButtonActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// add new user
				newUser = new User(registerView.getFirstName(), registerView.getLastName(), registerView.getUsername(),
						registerView.getPassword());

				listOfUsers.add(newUser);

				// empty content of text boxes
				registerView.setFirstName("");
				registerView.setLastName("");
				registerView.setUsername("");
				registerView.setPassword("");

				// get the login pannel in front
				registerView.setVisible(false);
				loginView.setVisible(true);

			}
		});
	}

	public User findUser(String username) {

		Iterator<User> iterator = listOfUsers.iterator();

		while (iterator.hasNext()) {
			User currentUser = iterator.next();
			if (currentUser.getUsername().equals(username))
				return currentUser;
		}
		return null;
	}
}
