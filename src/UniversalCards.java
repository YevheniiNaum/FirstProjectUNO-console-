import java.util.ArrayList;
import java.util.Arrays;

class UniversalCards extends Deck {
    private static ArrayList<Integer> universalCards = new ArrayList<Integer>();

    UniversalCards(){
        universalCards.add(allDeck.get(12));
        universalCards.add(allDeck.get(25));
        universalCards.add(allDeck.get(38));
        universalCards.add(allDeck.get(51));
    }
    static void getUniversalCards(){                                                                                    //Вывести универсальные карты
        System.out.println(Arrays.toString(universalCards.toArray()));
    }
}
