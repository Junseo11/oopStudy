
interface Man{
    public void move();
    public void stop();
}

class Chile implements Man{

    @Override // 오버라이딩 - 메소드를 재정의
    public void move() {
        System.out.println("이동합니다");
    }

    @Override
    public void stop() {
        System.out.println("정지합니다");
    }

    public void pring(){
        System.out.println("오버로딩1");
    }

    public void pring(int a){
        System.out.println("오버로딩"+a);
    }
}



public class Over {
    public static void main(String [] args){

        Chile c = new Chile();

        c.move();
        c.stop();

        c.pring();
        c.pring(4);

    }
}
