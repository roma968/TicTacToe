import java.util.Random;
import java.util.Scanner;
public class GameLogic {
    int[][] gameField = new int[3][3];
    Random random;

    public void board() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int hod() {
        System.out.println("Введите координаты хода 0..2");
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        if (a >= 0 & b >= 0 & a <= 2 & b <= 2) {
            System.out.println("Введите 1 или -1");
            c = sc.nextInt();
            if (c == 1 || c == -1) {
                gameField[a][b] = c;
            } else {
                System.out.println(" Вы ввели не правильное число, повторите ввод");
                return hod();
            }
        } else {
            System.out.println("Вы ввели неправильное число, повторите ввод");
            return hod();
        }
        return b;
    }
    
    public boolean check() {
        for (int i = 0; i < 3; i++)
            if (gameField[i][0] == gameField[i][1] && gameField[i][0] == gameField[i][2]&&(gameField[i][1]==1 ||gameField[i][1] ==-1)
                    || (gameField[0][i] == gameField[1][i] & gameField[1][i] == gameField[2][i]&(gameField[1][i]==1 ||gameField[1][i] ==-1 )))
                return true;
        if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] & (gameField[1][1]==1 ||gameField[0][0] ==-1)
                ||(gameField[2][0] == gameField[1][1] && gameField[2][0] == gameField[0][2] & (gameField[1][1]==1 ||gameField[1][1] ==-1)))
            return true;

            return false;
    }
    public boolean fullBoard(){
        for (int i=0;i<3;i++)
            for (int j = 0;j<3;j++)
                if (gameField[i][j] !=0)
                    return false;
        return true;

    }
    }









