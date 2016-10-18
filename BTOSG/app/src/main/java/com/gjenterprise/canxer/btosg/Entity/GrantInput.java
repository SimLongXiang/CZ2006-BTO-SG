package com.gjenterprise.canxer.btosg.Entity;

/**
 * Created by Canxer on 8/10/2016.
 */

import java.util.Date;
public class GrantInput {

    private String typeOfApplicant;

    private double householdIncome;

    private Date salesPeriod;

    public GrantInput(String typeOfApplicant, double householdIncome, Date salesPeriod){
        this.typeOfApplicant = typeOfApplicant;
        this.householdIncome = householdIncome;
        this.salesPeriod = salesPeriod;
    }

    public Date getSalesPeriod() {
        return salesPeriod;
    }

    public double getHouseholdIncome(){
        return householdIncome;
    }

    public String getTypeOfApplicant(){
        return typeOfApplicant;
    }

    public void setTypeOfApplicant(String typeOfApplicant){
        this.typeOfApplicant = typeOfApplicant;
    }

    public void setHouseholdIncome(double householdIncome){
        this.householdIncome = householdIncome;
    }

    public void setSalesPeriod(Date salesPeriod){
        this.salesPeriod = salesPeriod;
    }
}

