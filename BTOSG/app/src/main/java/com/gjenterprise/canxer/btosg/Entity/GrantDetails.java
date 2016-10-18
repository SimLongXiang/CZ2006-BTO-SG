package com.gjenterprise.canxer.btosg.Entity;

/**
 * Created by Canxer on 8/10/2016.
 */
public class GrantDetails {

    private String grantType;

    private double grantAmount;


    public GrantDetails(String grantType, double grantAmount){
        this.grantType = grantType;
        this.grantAmount = grantAmount;
    }

    public void setGrantType(String grantType){
        this.grantType = grantType;
    }

    public void setGrantAmount(double grantAmount){
        this.grantAmount = grantAmount;
    }

    public String getGetGrantType(){
        return grantType;
    }

    public double getGrantAmount(){
        return grantAmount;
    }

}
