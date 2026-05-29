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
        count += i;
    }

    public void decrement() {
        count--;
    }

    public void decreaseBy(int i) {
        count -= i;
    }

    public void multiplyBy(int i) {
        count *= i;
    }

    public void triple() {
        multiplyBy(3);
    }

    // FIX: sebelumnya XOR (^), sekarang benar-benar pangkat
    public void powerBy(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Exponent tidak boleh negatif");
        }

        int result = 1;
        for (int j = 0; j < i; j++) {
            result *= count;
        }
        count = result;
    }

    public boolean isCountEven() {
        return count % 2 == 0;
    }

    public int getCount() {
        return count;
    }
}