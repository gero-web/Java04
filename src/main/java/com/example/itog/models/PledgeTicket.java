package com.example.itog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PledgeTicket")
public class PledgeTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fioBorrower;
    private String pledgedProperty;
    private double appraisedValue;
    private double loanAmount;

    public Integer getId() {
        return id;
    }

    public double getAppraisedValue() {
        return appraisedValue;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public String getFioBorrower() {
        return fioBorrower;
    }

    public String getPledgedProperty() {
        return pledgedProperty;
    }

    public void setAppraisedValue(double appraisedValue) {
        this.appraisedValue = appraisedValue;
    }

    public void setFioBorrower(String fioBorrower) {
        this.fioBorrower = fioBorrower;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setPledgedProperty(String pledgedProperty) {
        this.pledgedProperty = pledgedProperty;
    }

}
