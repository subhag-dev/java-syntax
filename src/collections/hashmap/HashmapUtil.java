package collections.hashmap;

class HashmapUtil {

    private static final HashmapHelper hashmapHelper = new HashmapHelper();

    public static void main(String[] args) {
        hashmapHelper.createHashMap();
        hashmapHelper.printMap();
        hashmapHelper.printSize();
        hashmapHelper.printMap();
    }
}
