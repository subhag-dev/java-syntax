package collections.hashmap;

import java.util.HashMap;

class HashmapHelper {

    HashMap<Integer, Integer> cache;

    void createHashMap() {
        cache = new HashMap<>();
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
    }

    void update(Integer key, Integer value) {
        cache.put(key, value);
    }

    Integer getValueAt(int key) {
        return cache.getOrDefault(key, -1);
    }

    void remove(Integer key) {
        cache.remove(key);
    }

    void printSize() {
        System.out.println("Size of the map is: " + cache.size());
    }

    void printMap() {
        System.out.println("Map now is: ");
        for (HashMap.Entry entry : cache.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
