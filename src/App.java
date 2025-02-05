// Printable Interface – Defines a print() method that must be implemented.
// Box<T> Generic Class – Stores a value of any type (T) and implements Printable.
// App Class (Main Method) – Creates Box<Integer> and Box<String> objects and prints their values.

// interface determination
interface Printable {
    void print();
}

// generic class
class Box<T extends Comparable<T>> implements Printable {
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

    // Added a function to compare two Box objects.
    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.value);
    }
    
    // this.value < other.value  -1  The current object is smaller.
    // this.value == other.value  0  Both values are equal.
    // this.value > other.value  1  The current object is greater.
}  // ✅ Box 클래스 닫는 중괄호

// main class
public class App {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<Integer> intBox2 = new Box<>(200);

        intBox.print();
        intBox2.print();

        System.out.println("Comparison result: " + intBox.compareTo(intBox2));
    }
}  


