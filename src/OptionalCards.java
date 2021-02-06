import java.util.ArrayList;
import java.util.Arrays;

public class OptionalCards extends ColorCards {
    private static ArrayList<Integer> optionalCards = new ArrayList<Integer>();
    OptionalCards(){
        optionalCards.add(allDeck.get(9));
        optionalCards.add(allDeck.get(10));
        optionalCards.add(allDeck.get(11));
        optionalCards.add(allDeck.get(22));
        optionalCards.add(allDeck.get(23));
        optionalCards.add(allDeck.get(24));
        optionalCards.add(allDeck.get(35));
        optionalCards.add(allDeck.get(36));
        optionalCards.add(allDeck.get(37));
        optionalCards.add(allDeck.get(48));
        optionalCards.add(allDeck.get(49));
        optionalCards.add(allDeck.get(50));
    }
    static void getOptionalCards(){                                                                                          //Вывести красные карты
        System.out.println(Arrays.toString(optionalCards.toArray()));
    }
}
