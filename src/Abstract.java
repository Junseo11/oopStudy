
abstract class Animal{
    int leg;
    String name;
    int age;

    public Animal(int l, String n, int a){
        this.leg = l;
        this.name = n;
        this.age = a;
    }

    public void move(){
        System.out.println("이동한다");
    }
    public void eat(){
        System.out.println("먹는다");
    }
    public abstract void bark();
}

class Cat extends Animal{
    public Cat(int l, String n, int a){
        super(l,n,a);
    }

    @Override
    public void bark() {
        System.out.println("야옹");

    }
}

class Dog extends Animal{
    public Dog(int l, String n, int a){
        super(l,n,a);
    }

    @Override
    public void bark() {
        System.out.println("멍멍");

    }
}

public class Abstract {
    public static void main(String [] args){
        Cat c = new Cat(4,"야옹이",2);
        c.move();
        c.bark();
        Dog d = new Dog(4,"야옹이",2);
        d.move();
        d.bark();


    }
}
