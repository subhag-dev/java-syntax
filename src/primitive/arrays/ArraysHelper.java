package primitive.arrays;

class ArraysHelper {

    int[] get123Array() {
        return new int[] {1, 2, 3};
    }

    int[][] get1234Array2D() {
        return new int[][] {{1, 2}, {3, 4}};
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\n");
    }

    void printArray2D(int[][] arr) {
        for (int[] row : arr) {
            for (int j : row) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    void printArray2DWithIndices(int[][] arr) {
        for (int i=0; i<arr.length; ++i) {
            for (int j=0; j<arr[i].length; ++j) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
