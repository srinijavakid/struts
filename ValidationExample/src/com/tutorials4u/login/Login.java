package com.tutorials4u.login;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author info@tutorials4u.net
 */
public class Login extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String userName;
    private String password;

    public Login() {
    }

    public String execute() {
        return SUCCESS;
    }

    public void validate() {
        if (getUserName().length() == 0) {
            addFieldError("userName", "User Name is required");
        } else if (!getUserName().equals("tutorials4u")) {
            addFieldError("userName", "Invalid User");
        }
        if (getPassword().length() == 0) {
            addFieldError("password", getText("password.required"));
        }
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}