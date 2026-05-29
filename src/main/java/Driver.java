```java id="edited_driver"
public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        printHeader();

        showCounterState("Initial count", counter);

        counter.increment();
        showCounterState("After increment", counter);

        counter.increaseBy(10);
        showCounterState("After increaseBy(10)", counter);

        counter.decreaseBy(3);
        showCounterState("After decreaseBy(3)", counter);

        counter.triple();
        showCounterState("After triple()", counter);

        counter.powerBy(2);
        showCounterState("After powerBy(2)", counter);

        displayFinalStatus(counter);
    }

    private static void showCounterState(String action, Counter counter) {
        System.out.println(action + " : " + counter.getCount());
    }

    private static void printHeader() {
        System.out.println("==================================");
        System.out.println("       COUNTER APPLICATION        ");
        System.out.println("==================================");
    }

    private static void displayFinalStatus(Counter counter) {
        System.out.println("\n========== FINAL STATUS ==========");
        System.out.println("Final Count : " + counter.getCount());
        System.out.println("Even Number : " + counter.isCountEven());
    }
}
```
