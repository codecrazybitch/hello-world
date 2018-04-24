package com.jiazheng;
import java.util.Scanner;

public class DaoXiaoNoodle extends MakingNoodle{
    @Override
    public void method(){
        System.out.println("刀削面的制作方法:\n" +
                "1.饧好揉好的面团和削面刀\n" +
                "2.左手托住饧好的面团，右手握削面刀，刀面与面团表面持平\n" +
                "3.出力均匀，把面一条一条削下。我和的面团小，所以，削下来的面条短\n" +
                "4.削下来的面条是成中间厚、边缘薄的柳叶形状。");
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
        if(name == "刀削面"){
            this.method();
        }else{
            System.out.println("please input correct name of noodle");
        }

    }
}
