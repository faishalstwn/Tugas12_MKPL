public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void increaseBy(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Nilai tidak boleh negatif");
        }
        count += i;
    }

    public void decrement() {
        count--;
    }

    public void decreaseBy(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Nilai tidak boleh negatif");
        }
        count -= i;
    }

    public void multiplyBy(int i) {
        count *= i;
    }

    public void triple() {
        count *= 3;
    }

    // FIX: pakai Math.pow agar sesuai Java standard
    public void powerBy(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Exponent tidak boleh negatif");
        }
        count = (int) Math.pow(count, i);
    }

    public boolean isCountEven() {
        return count % 2 == 0;
    }

    public int getCount() {
        return count;
    }
}