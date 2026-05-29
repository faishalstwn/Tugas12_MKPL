```java id="qyzl6e"
public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        displayHeader("COUNTER APPLICATION");

        performOperation("Initial count", counter);

        counter.increment();
        performOperation("After increment", counter);

        counter.increaseBy(5);
        performOperation("After increaseBy(5)", counter);

        counter.multiplyBy(2);
        performOperation("After multiplyBy(2)", counter);

        counter.powerBy(2);
        performOperation("After powerBy(2)", counter);

        System.out.println("\nFinal Result");
        System.out.println("Current count: " + counter.getCount());
        System.out.println("Is even number? " + counter.isCountEven());
    }

    private static void performOperation(String operation, Counter counter) {
        System.out.println(operation + " -> " + counter.getCount());
    }

    private static void displayHeader(String title) {
        System.out.println("=================================");
        System.out.println(title);
        System.out.println("=================================");
    }
}
```
