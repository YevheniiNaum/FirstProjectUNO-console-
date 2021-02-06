import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        //создание колоды
        Deck newDeck= new Deck();
        new UniversalCards();
        new OptionalCards();
        new ColorCards();
        //создания "отбоя"
        HangUp hangUp= new HangUp();

        //Создание игроков
        //первый игрок
        System.out.print("Введите имя первого игрока: ");
        Person firstPlayer= new Person();
        String name=sc.nextLine();
        firstPlayer.setName(name);

        //второй игрок
        System.out.print("Введите имя второго игрока: ");
        Person secondPlayer = new Person();
        name = sc.nextLine();
        secondPlayer.setName(name);

        //Создание игры
        clearScreen();
        System.out.print("Universal: ");
        UniversalCards.getUniversalCards();
        System.out.print("Red: ");
        ColorCards.getRedCards();
        System.out.print("Yellow: ");
        ColorCards.getYellowCards();
        System.out.print("Green: ");
        ColorCards.getGreenCards();
        System.out.print("Blue: ");
        ColorCards.getBlueCards();
        System.out.print("Optional: ");
        OptionalCards.getOptionalCards();
        Game newGame= new Game(newDeck,hangUp,firstPlayer,secondPlayer);
        System.out.println("Первый игрок: "+firstPlayer.getName()+"\nВторой игрок: "+secondPlayer.getName());

        newGame.step(newDeck,firstPlayer,secondPlayer,hangUp);

    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
