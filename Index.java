import java.util.*;

public class Index {
    static int[][] cross = new int[3][3];
    static boolean[] fill = new boolean[9];
    static int m = 3, n = 3;

    public static boolean isFill(int pos) {
        return fill[pos];
    }

    public static void set() {
        int count = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cross[i][j] = count;
                count++;
            }
        }
        Arrays.fill(fill, false);
    }

    public static void printStatus() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cross[i][j] == -1) {
                    System.out.print("X ");
                } else if (cross[i][j] == -2) {
                    System.out.print("O ");
                } else {
                    System.out.print(cross[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean win(int player) {
        return (cross[0][0] == player && cross[0][1] == player && cross[0][2] == player) ||
               (cross[1][0] == player && cross[1][1] == player && cross[1][2] == player) ||
               (cross[2][0] == player && cross[2][1] == player && cross[2][2] == player) ||
               (cross[0][0] == player && cross[1][0] == player && cross[2][0] == player) ||
               (cross[0][1] == player && cross[1][1] == player && cross[2][1] == player) ||
               (cross[0][2] == player && cross[1][2] == player && cross[2][2] == player) ||
               (cross[0][0] == player && cross[1][1] == player && cross[2][2] == player) ||
               (cross[0][2] == player && cross[1][1] == player && cross[2][0] == player);
    }

    public static int checkWin() {
        if (win(-1)) {
            return 1;
        } else if (win(-2)) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] Args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        set();
        int count = 0;

        System.out.println("Tic-Tac-Toe");
        System.out.println("You (X)");
        System.out.println("System (O)");
        printStatus();

        while (count < 9) {
            System.out.println("Enter your move (1-9):");
            int pos = sc.nextInt();
            int i = (pos - 1) / 3;
            int j = (pos - 1) % 3;

            if (isFill(pos - 1)) {
                System.out.println("Position already filled.");
                continue;
            } else {
                fill[pos - 1] = true;
                cross[i][j] = -1;
            }

            printStatus();

            if (checkWin() == 1) {
                System.out.println("You win!");
                break;
            }

            int sysPos;
            do {
                sysPos = (int) (Math.random() * 9) + 1;
            } while (isFill(sysPos - 1));

            int sysI = (sysPos - 1) / 3;
            int sysJ = (sysPos - 1) % 3;
            fill[sysPos - 1] = true;
            cross[sysI][sysJ] = -2;

            System.out.println("System's move:");
            printStatus();

            if (checkWin() == 2) {
                System.out.println("System wins.");
                break;
            }

            count++;
        }

        if (count == 9) {
            System.out.println("Draw!");
        }

        sc.close();
    }
}
