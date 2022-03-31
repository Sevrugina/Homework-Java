/**
 * JAVA.HomeWork3
 * 
 * @author Alla Sevrugina
 * @version 29-30.03.2022
 */
    import java.util.Arrays;
    
 class HomeWork3 {
    public static void main(String[] args) {
        
        int[] arr01 = {1, 1, 1, 1, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arr01));
        System.out.println(Arrays.toString(reverseArray(arr01)));
        
        int[] arr100 = new int[100];
        System.out.println(Arrays.toString(arrayLength100(arr100)));
        
        int[] arr06 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr06));
        System.out.println(Arrays.toString(arrayLess6(arr06)));
        
        int[][] table = new int[5][5];
        printArray(arrayDiagonal(table));
        
        System.out.println(Arrays.toString(initialValue(7,100)));
        
        int[] arrMaxMin = {1, 5, 3, 12, 11, 4, -5, 2, 4, 8, 107, 1};
        System.out.println(Arrays.toString(arrMaxMin));
        maxMin(arrMaxMin);
    }
    
    static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        return arr;
    }
    
    static int[] arrayLength100(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        return arr;
        }
        
    static int[] arrayLess6(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        return arr;
    }
    
    static void printArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
    
    static int[][] arrayDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
             arr[i][i] = 1;
             arr[i][arr.length-1-i] = 1;
        }
        return arr;
    }
    static int[] initialValue(int len, int value) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) 
             arr[i] = value;
         return arr;
    }
    static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
        }
        System.out.println("max number =" + max);
        System.out.println("min number =" + min);
    }
 }
 