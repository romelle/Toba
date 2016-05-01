package com.toba.bll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romelle
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Entity
public class Account implements Serializable {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountID;
    
    @Column(name="Balance")
    private double balance;
    
    
    
    public enum AccountType{
        SAVINGS,CHECKING
    }
    
    @Enumerated(EnumType.STRING)
    public AccountType accountType;
  
    
   
     public Account(){}
     
    public Account(double balance, AccountType type){
        this.balance = balance;
        this.accountType= type;
        
       
    }
    
    
  
  public void setType(AccountType type){
      this.accountType=type;
  }
    
    public double credit(double creditAmmount){
        
       balance+=creditAmmount;
       return balance;
    }
    
    public double debit (double debitAmount){
        
            balance -= debitAmount;
            return balance;
        }
        
    public double getBalance(){
        return balance;
        
    }   
    

    public AccountType getAccountType(){
        return this.accountType;
    }
    
}
