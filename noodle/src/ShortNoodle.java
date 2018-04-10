public class ShortNoodle extends Noodle{
    private int length;
    ShortNoodle(String type,int numbers,int length){
        super(type, numbers);
        this.length = length;
    }
    private int getLength(){
        return length;
    }
    public void JugdeLength(){
        if(getLength() <= 10 && getLength() >0){
            System.out.println("吃短面就是要吃这种");
        }else System.out.println("sorry,没有这种短面");
    }
}
