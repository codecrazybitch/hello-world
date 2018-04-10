public class LongNoodle extends Noodle{
    private int length;
    LongNoodle(String type,int numbers,int length){
        super(type,numbers);
        this.length = length;
    }
    private int getLength(){
        return length;
    }
    public void JugdeLength(){
        if(getLength() >= 10 && getLength() <= 20){
            System.out.println("这个长面的长度，吃着带劲");
        }else if(getLength() < 10 && getLength() > 0){
            System.out.println("这长面吃着没意思");
        }else{
            System.out.println("没这种长面");
        }
    }
}
