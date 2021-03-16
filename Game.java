public class Game {
    public static void main(String[] args) {
        GameLogic array = new GameLogic();
        while (true) {
            array.board();
            if (array.fullBoard()) {
                System.out.println(" FULL BOARD");
                break;
            }
            array.hod();
            if (array.check()) {
                System.out.println("YOU WIN");
                array.board();
                break;
            }
        }
    }
}

