package com.tutorials4u.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author info@tutorials4u.net
 */
public class UserAction extends ActionSupport implements ModelDriven {

	private static final long serialVersionUID = 1L;
	private User user = new User();

    public UserAction() {
    }

    public Object getModel() {
        return user;
    }

    public String execute() {
        return SUCCESS;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}