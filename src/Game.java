import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Game {


    void reset(Game game, Deck deck, Person firstPlayer, Person secondPlayer){                                          //сброс игры
        game = null;
        deck = null;
        firstPlayer = null;
        secondPlayer = null;
    }
    Game (Deck deck,HangUp hangUp, Person firstPlayer, Person secondPlayer){                                            //начало игры
        deck.shuffleDeck();
        insuenceCard(firstPlayer,secondPlayer,deck,hangUp);
    }
    private static void insuenceCard(Person firstPlayer, Person secondPlayer, Deck deck, HangUp hangUp){                                                                                                //выдача карты
        int delete=0;
        //выдать 7 карт первому игроку
        for(int i =0;i<7;i++){
            firstPlayer.playersCards.add(deck.allDeck.get(i));
        }
        for(int i=0;i<7;i++){
            deck.allDeck.remove(delete);
        }
        //выдать 7 карт второму игроку
        for(int i =0;i<7;i++){
            secondPlayer.playersCards.add(deck.allDeck.get(i));
        }
        for(int i=0;i<7;i++){
            deck.allDeck.remove(delete);
        }
        //покласть одну карту на "отбой"
        hangUp.hangUp.add(deck.allDeck.get(0));
        deck.allDeck.remove(delete);
    }

    void step(Deck deck, Person firstPlayer, Person secondPlayer, HangUp hangUp){                                       //ход игрока
        Scanner scan = new Scanner(System.in);
        if(GlobalVars.define){
            GlobalVars.define=false;
            System.out.println("---Ход игрока "+firstPlayer.getName()+"---");
            System.out.println("[Ваша колода]");
            firstPlayer.getPlayersDeck();


        }
    }

}
