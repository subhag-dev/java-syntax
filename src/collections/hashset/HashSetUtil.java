package collections.hashset;

class HashSetUtil {
    public static final HashSetHelper hashsetHelper = new HashSetHelper();
    public static void main(String[] args) {
        hashsetHelper.create();
        hashsetHelper.addEntry(1);
        hashsetHelper.addEntry(2);
        hashsetHelper.addEntry(3);
        hashsetHelper.printSetValues();
        hashsetHelper.removeEntry(3);
        hashsetHelper.removeEntry(5);
    }
}
