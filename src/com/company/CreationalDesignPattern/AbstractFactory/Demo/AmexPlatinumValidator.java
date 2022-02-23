package com.company.CreationalDesignPattern.AbstractFactory.Demo;



public class AmexPlatinumValidator implements Validator  {

    @Override
    public boolean isValid(CreditCard creditCard){
        return false;
    }
}
