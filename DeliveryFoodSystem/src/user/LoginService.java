/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author tanaw
 */
public interface LoginService {
    
    public abstract boolean login(String user, String pass);
    public abstract boolean register(String user, String pass);
}
