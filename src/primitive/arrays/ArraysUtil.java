package primitive.arrays;

class ArraysUtil {

    private static final ArraysHelper arraysHelper = new ArraysHelper();

    public static void main(String[] args) {
        int[] arr = arraysHelper.get123Array();
        arraysHelper.printArray(arr);
        int[][] arr2d = arraysHelper.get1234Array2D();
        arraysHelper.printArray2D(arr2d);
        int[][] arrTest = new int[][] {{1, 2}, {4, 5}};
        arraysHelper.printArray2DWithIndices(arrTest);
    }

}
