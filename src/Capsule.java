public class Capsule {
    public static void main(String [] args){

        Person p = new Person();

        p.setAge(5);
        p.setName("park");
        System.out.println(p.getAge());
        System.out.println(p.getName());

    }
}

class Person{
    private int age;  // 맴버 필드
    public String name;

    public int getAge(){    // 외부로부터 데이터를 보호하기위해 getter,setter를 사용하여 객체를 변경하도록 함
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
