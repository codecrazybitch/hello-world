package com.jiazheng;

abstract class MakingNoodle {
    abstract public void method();
}

class DaoXiaoNoodle extends MakingNoodle{
    public void method(){
        System.out.println("有专门的削面刀");
    }
}

class YangChunNoodle extends MakingNoodle{
    public void method(){
        System.out.println("炒料");
        System.out.println("下面");
    }
}

class ChongQingXiaoNoodle extends MakingNoodle{
    public void method(){
        System.out.println("炸辣椒");
        System.out.println("做调味料");
    }
}