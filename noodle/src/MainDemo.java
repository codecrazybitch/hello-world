public class MainDemo {
    public static void main(String[] args) {
        Noodle noodle = new Noodle("长面", 2);
        System.out.println("点单结果：" + "\n" + "种类：" +
                noodle.getType() + "\n" + "数量：" + noodle.getNumbers() + "碗");
        System.out.println("请选择长面的长度：8,10,15,20,30");
        LongNoodle longnoodle = new LongNoodle("长面", 1, 10);
        longnoodle.JugdeLength();
        Person person = new Person();
        System.out.println("餐厅1最多课容纳：" + Person.NumberOfPerson1);
        System.out.println("餐厅二最多可容纳："+Person.NumberOfPerson2);
        System.out.println("吃饭中........");
        person.Eat();
    }
}

