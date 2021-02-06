import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;                                                                                                // имя игрока
    ArrayList<Integer> playersCards;                                                                                    //карты игрока

    Person(){
        playersCards= new ArrayList<Integer>();
    }
//    void addCard(ArrayList<Integer> deck){
//        playersCards.add();
//    }+


    public String getName(){                                                                                            //получение имени
        return name;
    }
    public void setName(String name){                                                                                   //ввод имени
        this.name=name;
    }
    public void getPlayersDeck(){
        System.out.println(Arrays.toString(playersCards.toArray()));
    }

}
