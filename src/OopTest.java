public class OopTest {

    // 객체 생성, 호출
    public static void main(String[]args){
        Tv t = new Tv();

        t.color = "Red";
        t.setPower();
        t.setChannel(true);

        t.String();
    }
}

class  Tv{
    String color;
    boolean power;
    int channel;

    void setPower(){
        power = !power;
    }

    void setChannel(boolean ex){
        if(ex){
            ++this.channel;
        }
        else {
            --this.channel;
        }
    }

    void String(){
      System.out.println(this.color+"\n"+ this.channel +"\n"+ this.power);
    }

}