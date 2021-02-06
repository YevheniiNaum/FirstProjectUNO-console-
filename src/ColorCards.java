import java.util.ArrayList;
import java.util.Arrays;

class ColorCards extends Deck {

    private static ArrayList<Integer> redCards = new ArrayList<Integer>();
    private static ArrayList<Integer> yellowCards= new ArrayList<Integer>();
    private static ArrayList<Integer> greenCards = new ArrayList<Integer>();
    private static ArrayList<Integer> blueCards = new ArrayList<Integer>();


    ColorCards(){
        for(int i =0;i<12;i++){
            redCards.add(allDeck.get(i));
        }
        for(int i =13;i<25;i++){
            yellowCards.add(allDeck.get(i));
        }
        for(int i =26;i<38;i++){
            greenCards.add(allDeck.get(i));
        }
        for(int i =39;i<51;i++){
            blueCards.add(allDeck.get(i));
        }
    }
    static void getRedCards(){                                                                                          //Вывести красные карты
        System.out.println(Arrays.toString(redCards.toArray()));
    }
    static void getYellowCards(){                                                                                       //Вывести жёлтые карты
        System.out.println(Arrays.toString(yellowCards.toArray()));
    }
    static void getGreenCards(){                                                                                        //Вывести зелёные карты
        System.out.println(Arrays.toString(greenCards.toArray()));
    }
    static void getBlueCards(){                                                                                         //Вывести синие карты
        System.out.println(Arrays.toString(blueCards.toArray()));
    }
}
