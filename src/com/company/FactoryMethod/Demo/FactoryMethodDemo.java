package com.company.FactoryMethod.Demo;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Website site  = WebsiteFactory.getWebsite("blog");

        System.out.println(site.getPages());


        site  = WebsiteFactory.getWebsite("shop");

        System.out.println(site.getPages());
    }
}
