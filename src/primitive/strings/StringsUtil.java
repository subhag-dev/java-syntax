package primitive.strings;

class StringsUtil {
    private static final StringsHelper stringsHelper = new StringsHelper();

    public static void main(String[] args) {
        String test = stringsHelper.createString();
        stringsHelper.printString(test);
    }
}
