import java.util.*;
public class PacMan_Main {
    static int select;
    static Scanner sc = new Scanner(System.in);
    static PacMan pacman = new PacMan();
    public static void main(String[] args) {
        
        System.out.print("Input 'X' Position : ");
        pacman.x = sc.nextInt();
        System.out.print("Input 'Y' Position : ");
        pacman.y = sc.nextInt();
        System.out.print("Input Board Height : ");
        pacman.height = sc.nextInt();
        System.out.print("Input Board Width : ");
        pacman.width = sc.nextInt();

        System.out.println();
        pacman.printPosition();
        menu();
    }

    static void menu() {
        System.out.println("1] MOVE UP");
        System.out.println("2] MOVE DOWN");
        System.out.println("3] MOVE LEFT");
        System.out.println("4] MOVE RIGHT");
        System.out.println("5] EXIT");
        System.out.print("SELECT : ");
        select = sc.nextInt();

        if (select == 1) {
            System.out.println();
            pacman.moveUp();
            pacman.printPosition();
            System.out.println();
            menu();
        }
        else if (select == 2) {
            System.out.println();
            pacman.moveDown();
            pacman.printPosition();
            System.out.println();
            menu();
        }
        else if (select == 3) {
            System.out.println();
            pacman.moveLeft();
            pacman.printPosition();
            System.out.println();
            menu();
        }
        else if (select == 4) {
            System.out.println();
            pacman.moveRight();
            pacman.printPosition();
            System.out.println();
            menu();
        } 
        else if (select == 5) {
            System.out.println("You Are Out From The Game");
        }
        else {
            System.out.println("Incorrect Input");
            System.out.println();
            pacman.printPosition();
            menu();
        }
    }     
}