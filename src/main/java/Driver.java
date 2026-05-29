public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        printCount("Initial count", counter);

        counter.increment();
        printCount("After increment", counter);

        counter.decrement();
        printCount("After decrement", counter);
    }

    private static void printCount(String label, Counter counter) {
        System.out.println(label + ": " + counter.getCount());
    }
}