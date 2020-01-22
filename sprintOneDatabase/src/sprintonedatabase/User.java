/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintonedatabase;

import java.util.ArrayList;

/**
 *
 * @author NUser1
 */
public class User {
    private String userID;
    private String name;
    private String username;
    private String email;
    private String password;
    static ArrayList<User> userList = new ArrayList();
    static ArrayList<Customer> customerList = new ArrayList();
    static ArrayList<Driver> driverList = new ArrayList();
    static ArrayList<Admin> adminList = new ArrayList();
    public User() {
    }

    public User(String username, String name, String email, String password) {
        
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userID = userID();
        
    }
    
    public final String userID(){
        String tempID = ("U".concat(Integer.toString(userList.size() + 0)));
        return  tempID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
