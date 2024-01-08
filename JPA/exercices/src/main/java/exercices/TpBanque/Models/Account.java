package exercices.TpBanque.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String libelle;
    private String iban;
    private double accountBalance;
    @ManyToMany
    private List<Customer> owners;
    @ManyToOne
    private BankingAgency bankingAgency;

    public Account() {
    }

    public Account(long id, String libelle, String iban, double accountBalance, List<Customer> owners, BankingAgency bankingAgency) {
        this.id = id;
        this.libelle = libelle;
        this.iban = iban;
        this.accountBalance = accountBalance;
        this.owners = owners;
        this.bankingAgency = bankingAgency;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Customer> getOwners() {
        return owners;
    }

    public void setOwners(List<Customer> owners) {
        this.owners = owners;
    }

    public BankingAgency getBankingAgency() {
        return bankingAgency;
    }

    public void setBankingAgency(BankingAgency bankingAgency) {
        this.bankingAgency = bankingAgency;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
