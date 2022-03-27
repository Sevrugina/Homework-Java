/**
 * JAVA.HomeWork2
 * 
 * @author Alla Sevrugina
 * @version 27.03.2021
 */
 class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(checkSumTrue(15, 6));
        checkNumberPositive(-25);
        System.out.println(checkNumberTrue(-1));
        printlineNumber("cats and dogs", 5);
        System.out.println(checkleapYear(2000));
    }
    
    static boolean checkSumTrue(int a, int b) {
        return (a + b >= 10 && a + b <= 20) ? true : false;
    }
    
    static void checkNumberPositive(int a) {
        System.out.println(a >= 0 ? "number is positive" : "number is negative");
    }
    
    static boolean checkNumberTrue(int a) {
        return (a <= 0 ? true : false);
    }
    
    static void printlineNumber(String word, int n) {
        for (int i = 0; i < n ; i++ ) {
            System.out.println(word);
        }
    }
    
    static boolean checkleapYear(int a) {
        return (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0 )) ? true : false;
    }
 }

    