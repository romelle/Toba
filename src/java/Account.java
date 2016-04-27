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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Entity
public class Account implements Serializable {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountID;
    
    @ManyToOne
    private User user;
  
    
    private double balance;
    
    
    public enum Type{
        SAVINGS,CHECKING
    }
    
    private Type type;
  
    
   
     public Account(){
        
    }
    public Account(User customer,double initBalance, Type type){
        this.user = customer;
        this.balance = initBalance;
        this.type = type;
        
       
    }
    
    
  public Type getAccountType(){
      return this.type;
  }
  
  public void setType(Type type){
      this.type=type;
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
    

    public User getUser(){
        
        return this.user;
    }
   
    public void setUser(User user){
        this.user = user;
    }

    
}
