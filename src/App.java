//Printable Interface – Defines a print() method that must be implemented.
//Box<T> Generic Class – Stores a value of any type (T) and implements Printable.
//App Class (Main Method) – Creates Box<Integer> and Box<String> objects and prints their values.

// interface determination
interface Printable {
    void print();
}

// generic class
class Box<T> implements Printable {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println("Value: " + value);
    }
}

// main class
public class App {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Hello, Java!");

        intBox.print();
        strBox.print();
    }
}
