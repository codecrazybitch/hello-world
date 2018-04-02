public class MainDemo {
    public static void main(String[] args) {
        Noodle noodle = new Noodle("长面", 2);
        System.out.println("点单结果：" + "\n" + "种类：" +
                noodle.getType() + "\n" + "数量：" + noodle.getNumbers() + "碗");
        System.out.println("请选择长面的长度：8,10,15,20,30");
        System.out.println("请选择短面的长度：5，8，9，10");
        ShortNoodle shotnoodle = new ShortNoodle("短面",1,20);
        LongNoodle longnoodle = new LongNoodle("长面", 1, 10);
        shotnoodle.JugdeLength();
        longnoodle.JugdeLength();
        Person person = new Person();
        System.out.println("吃饭中........");
        person.Eat();
    }
}

