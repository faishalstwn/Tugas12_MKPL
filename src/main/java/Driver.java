```java
public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        displayCounterState("Initial count", counter);

        counter.increment();
        displayCounterState("After increment", counter);

        counter.increaseBy(4);
        displayCounterState("After increaseBy(4)", counter);

        counter.decrement();
        displayCounterState("After decrement", counter);

        counter.triple();
        displayCounterState("After triple", counter);

        System.out.println("Is count even? " + counter.isCountEven());
    }

    private static void displayCounterState(String message, Counter counter) {
        System.out.println(message + ": " + counter.getCount());
    }
}
```
