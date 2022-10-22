package Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField userText;
    private ColleagueTextField passwordText;
    private ColleagueButton okButton;
    private ColleagueButton cancelButton;


    public LoginFrame(String title) throws HeadlessException {
        super(title);

        setLocation(1000,500);


        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));

        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(userText);
        add(new Label("Password:"));
        add(passwordText);
        add(okButton);
        add(cancelButton);

        colleagueChanged();

        pack();
        setVisible(true);

    }

    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, true);

        userText = new ColleagueTextField("", 10);
        passwordText = new ColleagueTextField("", 10);
        passwordText.setEchoChar('*');

        okButton = new ColleagueButton("OK");
        cancelButton = new ColleagueButton("CANCEL");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        userText.setMediator(this);
        passwordText.setMediator(this);
        okButton.setMediator(this);
        cancelButton.setMediator(this);


        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        userText.addTextListener(userText);
        passwordText.addTextListener(passwordText);
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            userText.setColleagueEnabled(false);
            passwordText.setColleagueEnabled(false);
            okButton.setColleagueEnabled(true);
        } else {
            userText.setColleagueEnabled(true);
            userPasswordChanged();
        }
    }

    private void userPasswordChanged() {
        if (userText.getText().length() > 0) {
            passwordText.setColleagueEnabled(true);
            if (passwordText.getText().length() > 0) {
                okButton.setColleagueEnabled(true);
            } else {
                okButton.setColleagueEnabled(false);
            }
        } else {
            passwordText.setColleagueEnabled(false);
            okButton.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        System.exit(0);
    }
}
