package primitive.strings;

class StringsHelper {

    String createString() {
        return "Hello, World!";
    }

    void printString(String str) {
        for (int i=0; i<str.length(); ++i) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}
