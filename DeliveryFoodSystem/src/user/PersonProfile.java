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
public class PersonProfile {
    private String name;
    private String address;
    private String tel;

    public PersonProfile(String name, String address, String tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "PersonProfile{" + "name=" + name + ", address=" + address + ", tel=" + tel + '}';
    }
    
    
}
