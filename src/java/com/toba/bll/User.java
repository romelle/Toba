/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romelle
 */
package com.toba.bll;


import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;



@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="phone")
    private String phone;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="email")
    private String email;
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private ArrayList<Account> accounts;
    
    
    public User(){
        
    }
    
    public User(String firstName, String lastName, String phone, String address,
            String city, String state, String zipcode,String email){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.username= this.lastName + this.zipcode;
        this.password= "welcome1";
        
        this.accounts = new ArrayList<Account>();
        this.accounts.add(new Account(25.00,Account.AccountType.SAVINGS));
        this.accounts.add(new Account(0.00,Account.AccountType.CHECKING));
        
    }
    
    public String getFirstName(){
        
        return firstName;
    }
    
    
    public void setFirstName(String firstName){
        
        this.firstName = firstName;
        
    }
    
    public String getLastName(){
        
        return lastName;
    }
    
    
    public void setlastName(String lastName){
        
        this.lastName = lastName;
        
    }
    
     public String getEmail(){
        
        return email;
    }
    
    
    public void setEmail(String email){
        
        this.email = email;
        
    }
    
    public String getPhone(){
        
        return phone;
    }
    
    
    public void setPhone(String phone){
        
        this.phone = phone;
        
    }
    
    
    public String getAddress(){
        
        return address;
    }
    
    
    public void setAddress(String address){
        
        this.address = address;
        
    }
    
     public String getCity(){
        
        return city;
    }
    
    
    public void setCity(String city){
        
        this.city = city;
        
    }
    
      public String getState(){
        
        return state;
    }
    
    
    public void setState(String state){
        
        this.state = state;
        
    }
    
       public String getZipcode(){
        
        return zipcode;
    }
    
    
    public void setZipcode(String zipcode){
        
        this.zipcode = zipcode;
        
    }
    
    
       public String getUsername(){
        
        return username;
    }
    
    
    public void setUsername(String username){
        
        this.username = username;
        
    }
    
       public String getPassword(){
        
        return password;
    }
    
    
    public void setPassword(String password){
        
        this.password = password;
        
    }
    
   public Account getAccount(Account.AccountType which){
        
        for(Account a: this.accounts){
            if (a.getAccountType() == which)
                return a;
        } 
        return null;
    }
   
   public double getCheckingBalance(){
       Account checking =  getAccount(Account.AccountType.CHECKING);
       return checking.getBalance();
   }
    
   public double getSavingsBalance(){
       Account checking =  getAccount(Account.AccountType.SAVINGS);
       return checking.getBalance();
   }
}