public class PacMan {
    int x, y, width, height;

    void moveLeft() {
        y -= 1;
    }
    void moveRight() {
        y += 1;
    }
    void moveUp() {
        x -= 1;
    }
    void moveDown() {
        x += 1;
    }

    void printPosition() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == x && j == y) {
                    System.out.print(" ^<^ ");
                } else {
                    System.out.print("  *  ");
                }
            }
            System.out.println("");
        }
    }
}
