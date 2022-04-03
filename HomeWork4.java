
import java.util.Random;
import java.util.Scanner;

class HomeWork4 {
    Random random;
    Scanner scanner;
    char[][] table;
    public static void main (String[] args) {
        new HomeWork4().game();
    }
    
    HomeWork4() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
    
    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin('x')) {
                System.out.println("Human WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW!");
                break;
            }
            turnAI();
            if (checkWin('o')) {
                System.out.println("AI WON");
                break;
            }
             if (isTableFull()) {
                System.out.println("SORRY, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }
    
        void initTable() {
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    table[x][y] = '.';
                }
            }
        }
        
        void printTable() {
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    System.out.print(table[x][y] + " ");
                }
                System.out.println();
            }
        }
        
        void turnHuman() {
            int x, y;
            do {
                System.out.print("Enter x y [1..3]:");
                x = scanner.nextInt() -1;
                y = scanner.nextInt() -1;
            } while(!isCellValid(x, y));
            table[x][y] = 'x';
        }
        
        void turnAI() {
            int x, y;
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);
            } while(!isCellValid(x, y));
            table[x][y] = 'o';
        }
        
        boolean isCellValid(int x, int y) {
            if (x < 0 || y < 0 || x > 2 || y > 2) {
                return false;
            }
            return table[x][y] == '.';
        }
        
        boolean checkWin(char ch) {
            int count = 0;
            for (int i = 0; i <3; i++ ){
                 if (table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) return true;
            }
            for (int i = 0; i <3; i++ ){
                 if (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch) return true;
            }
            for (int i = 0; i < 3; i++) {
                if (table[i][i] == ch) count++;
            }
            if (count ==3) return true;
            count = 0;
            for (int i = 0; i < 3; i++) {
                if (table[i][3 -i -1] == ch) count++;
            }
            if (count ==3) return true;
            return false;
        }
        
        boolean isTableFull() {
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    if (table[x][y] == '.') {
                        return false;
                    }
                }
            }
            return true;
        }
}
 
