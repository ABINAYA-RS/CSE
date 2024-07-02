package basics;
interface animal {
    void eat();
}
interface Bird {
    void fly();
}
class Mammal implements animal {
    public void eat() {
        System.out.println("Mammal is eating");
    }
}
class Bat extends Mammal implements Bird {
    public void fly() {
        System.out.println("Bat is flying");
    }
}

public class hybird {
    public static void main(String[] args) {
        Bat c1 = new Bat();
        c1.eat();
        c1.fly();
    }
}


