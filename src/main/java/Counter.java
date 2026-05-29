public class Counter {

    private int count;

    public Counter() {
        reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void increaseBy(int value) {
        validateNonNegative(value);
        count += value;
    }

    public void decrement() {
        count--;
    }

    public void decreaseBy(int value) {
        validateNonNegative(value);
        count -= value;
    }

    public void multiplyBy(int value) {
        count *= value;
    }

    public void triple() {
        multiplyBy(3);
    }

    public void powerBy(int exponent) {
        validateNonNegative(exponent);
        count = (int) Math.pow(count, exponent);
    }

    public boolean isCountEven() {
        return count % 2 == 0;
    }

    public int getCount() {
        return count;
    }

    private void validateNonNegative(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }
}