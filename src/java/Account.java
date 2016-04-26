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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;




@Entity
public class Account implements Serializable {
    
    
    
    @Id
    private User user;
    
    private double balance;
    
    /*@Enumerated(EnumType.STRING)
    public enum type{
        SAVINGS,CHECKING
    }
    
   type accountType;
    
    */
    
     
    
    public Account(User customer,double initBalance /*,type accountType*/){
        this.user = customer;
        this.balance = initBalance;
        //this.accountType = accountType;
        
       
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
        return user;
    }
    
    public Account(){
        
    }

    
}
