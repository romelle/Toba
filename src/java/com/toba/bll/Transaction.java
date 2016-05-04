package com.toba.bll;



import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
public class Transaction implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountID;
    
    @Column (name="Account1")
    private double acct1;    
    @Column (name="Account2")
    private double acct2;
    
    
    @Column (name="TransferredAMT")
    private double amount;
    
    private ArrayList<Transaction> transactions;
    
    public Transaction() {
    
    }
    
    public Transaction(double acct_1, double acct_2, double amount){
        this.acct1 = acct1;
        this.acct2 = acct2;
        this.amount = amount;
    }
    
    public double getAccount1(){
        return acct1;
    }
    
    
     public double getAccount2(){
        return acct2;
    }
     
     public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
     
    public void setAccount1(double account1){
        this.acct1 = account1;
    }
    
     public void setAccount2(double account2){
        this.acct2 = account2;
    }
    
     
   
    
   
    public double getAmount(){
        return amount;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }    

   
    
}
    