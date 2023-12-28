class Peaple {

    //상속예제
    String name;
    int age;
    void toWindow(){
        System.out.println(name +"\n"+age);
    }
}

class Student extends Peaple{  // 부모클래스 상속
    String school;
    String job;
    public Student(int age,String name,String school, String job){
        super.age=age;  // super키워드는 자식 클래스에서 부모 클래스로 접근할때 사용
        super.name = name;
        this.school = school;
        this.job = job;
    }

    public void print(){
        System.out.println(school +"\n"+job);
    }
}


public class Extand {
    public static void main(String [] args){
        Student st = new Student(21,"park","hallym","student");

        st.toWindow();
        st.print();

    }
}
