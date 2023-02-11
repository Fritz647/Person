//создание класса
public class Person {
    //переменные класс
    String fullName;
    int age;

    //конструктор с двумя параметрами
    public  Person(String personfullName, int personage){
        fullName = personfullName;
        age = personage;
    }
    //конструктор с пустым параметром
    public  Person(){

    }

    //создание метода move
    public void move(String name){
        System.out.println(name + " идёт");
    }

    //создание метода talk
    public void talk(String name){
        System.out.println(name + " говорит");
    }
}
