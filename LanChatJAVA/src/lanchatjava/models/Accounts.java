/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchatjava.models;

/**
 *
 * @author Ken
 */
public class Accounts {
    public Accounts() { }
        
    public Profile[] getAccounts() {
        Profile[] accounts = {
            new Profile("Kien", "Kien123"),
            new Profile("Khang", "Khang123"),
            new Profile("Cong", "Cong123"),
            new Profile("Thanh", "Thanh123"),
            new Profile("Admin", "Admin123")
        };            
        return accounts;
    }
}
