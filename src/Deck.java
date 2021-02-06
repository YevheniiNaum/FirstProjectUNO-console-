import java.util.*;

class Deck {
    private int quantity;                                                                                               //кол-во карт в колоде
    static ArrayList<Integer> allDeck;                                                                           //колода
    Deck(){
        quantity=52;
        int n=1;
        this.allDeck = new ArrayList<Integer>();
        for(int i=0;i<quantity;i++){
            allDeck.add(n);
            n++;
        }


    }

    void shuffleDeck(){                                                                                          //перетасовка колоды
        Collections.shuffle(allDeck);
    }

    void getDeck(){                                                                                                     //Вывести колоду
        System.out.println(Arrays.toString(allDeck.toArray()));
    }


}