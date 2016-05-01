

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Transaction implements Serializable {
    
   /* public enum transactionType{
        CREDIT,DEBIT,TRANSFER
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @Column(name="account")
    private Account account;
    private double amount;
    private transactionType type;

    public Transaction() {
        
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction(Account account, double amount, transactionType transType) {
        this.account = account;
        this.amount = amount;
        this.type = transType;
    }
    */
}