package com.jiazheng;

import java.util.Scanner;

public class ChongQingXiaoNoodle extends MakingNoodle{
    @Override
    public void method() {
        System.out.println("重庆小面的做法："+
                "1.准备各种调料\n" +
                "2.把姜、蒜剁成末放入碗里，把香葱摘洗净切成葱花\n" +
                "3.趁着煮面的水没开的时间调汁：调入2勺酱油、1/2勺鸡精、1/2勺味精、1勺葱花\n" +
                "4.1勺花椒粉\n" +
                "5.2勺辣椒油\n" +
                "6.1勺猪油、1勺熟菜籽油、1勺香油、1勺花生米和芽菜\n" +
                "7.水烧开后放入面，然后快速用筷子搅散，放入空心菜，煮到断生，用手掐开一截面，没有白点即可，就可以装碗了\n" +
                "8.在调料碗中加入2勺面汤，家里如果有骨头汤是最好了\n" +
                "9.把空心菜先挑入碗中，再挑入面条即可，放些面汤，把调好的汁倒入即可\n" +
                "\n");
    }
/*
    public void HowToMakeNoodle(){
        System.out.println("请选择要学习的食谱");
        System.out.println("刀削面的做法\n" + "重庆小面的做法\n");
    }
*/
    public void ChooseMethod(){
        new MethodOfNoodle().HowToMakeNoodle();
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if(name == "重庆小面"){
            System.out.println("please input correct name of noodle");
        }else{
            this.method();
        }

    }
}
