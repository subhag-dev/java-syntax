package collections.hashset;

import java.util.HashSet;

class HashSetHelper {
    private static HashSet<Integer> set;

    void create() {
        System.out.println("Set created");
        set = new HashSet<>();
    }

    void addEntry(int x) {
        System.out.println(x + " added to set");
        set.add(x);
    }

    void removeEntry(int x) {
        if (set.remove(x)) {
            System.out.println(x + " removed from set");
        } else {
            System.out.println(x + " not present in set");
        }
    }

    void search(int x) {
        if (set.contains(x)) {
            System.out.println("Set contains " + x);
        } else {
            System.out.println("Set doesn't contain " + x);
        }
    }

    void printSetValues() {
        for (Integer value : set) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

}
