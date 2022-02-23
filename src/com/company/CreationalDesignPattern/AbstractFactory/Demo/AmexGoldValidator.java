package com.company.CreationalDesignPattern.AbstractFactory.Demo;



public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard){
        return false;
    }
}
