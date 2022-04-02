/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;

/**
 *
 * @author kingsleybyrne
 */
public class Customer implements Serializable{
    private int customerID;
    private String[] promoCode;

    public Customer(){}
    /**
     * @return the userId
     */
    public int getCustomerId() {
        return customerID;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the promoCode
     */
    public String[] getPromoCode() {
        return promoCode;
    }

    /**
     * @param promoCode the promoCode to set
     */
    public void setPromoCode(String[] promoCode) {
        this.promoCode = promoCode;
    }
    
}
