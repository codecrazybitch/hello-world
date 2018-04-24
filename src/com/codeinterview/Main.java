package com.codeinterview;

import com.jiazheng.ChongQingXiaoNoodle;
import com.jiazheng.DaoXiaoNoodle;
import com.jiazheng.MakingNoodle;
import com.jiazheng.MethodOfNoodle;

public class Main {

    public static void main(String[] args) throws Exception {

        new MethodOfNoodle().HowToMakeNoodle();
        try {
            Restaurant restaurant = new Restaurant();

            Person customer = new Person("JiaZhen");

            Food food = restaurant.buy();

            customer.eat(food);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }
}
