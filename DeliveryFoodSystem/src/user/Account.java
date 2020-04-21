/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Objects;


enum LoginStatus{
    Login, Logout, Unsign
}
public abstract class Account{
    private String username;
    private String password;
    private LoginStatus loginStatus;
    private PersonProfile person;

    public Account(Account account){
        this.username=account.username;
        this.password=account.password;
        this.person=account.person;
    }
    public Account(String username, String password, PersonProfile person) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.loginStatus = loginStatus.Login;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    public boolean login(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public boolean register(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", loginStatus=" + loginStatus + ", person=" + person + '}';
    }
}
