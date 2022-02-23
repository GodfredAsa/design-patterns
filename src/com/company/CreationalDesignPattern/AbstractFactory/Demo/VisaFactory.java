package com.company.CreationalDesignPattern.AbstractFactory.Demo;

public class VisaFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CardType cardType){
        return switch (cardType) {
            case GOLD -> new VisaGoldCreditCard();
            case PLATINUM -> new VisaBlackCreditCard();
        };

    }

    @Override
    public Validator getValidator(CardType cardType){
        return switch (cardType) {
            case GOLD -> new AmexGoldValidator();
            case PLATINUM -> new AmexPlatinumValidator();
        };
    }
}
