package basics;
class Animal{
    void eat(){
        System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");}
}
public class hierarchical{
    public static void main(String args[]){
        Cat c1=new Cat();
        c1.meow();
        c1.eat();

    }
}

