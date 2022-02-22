package com.company.Builder.solution;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Maya")
                .meat("Turkey");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());

// Mine implementation
        LunchOrder fredMeal = new LunchOrder.Builder()
                .meat("Goat")
                .dressing("Mayonnaise")
                .condiments("Cabbage")
                .bread("Sugar bread")
                .build();

        System.out.println("Fred meals: " + fredMeal.getCondiments());



    }
}
