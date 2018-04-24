package com.codeinterview;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Restaurant restaurant = new Restaurant();

            Person customer = new Person("JiaZheng");

            Food food = restaurant.buy();

            customer.eat(food);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(new ChongQingXiaoNoodle.method());
    }
}
