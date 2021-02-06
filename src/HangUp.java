import java.util.ArrayList;
import java.util.Arrays;

public class HangUp {
    ArrayList<Integer> hangUp;                                                                                          //отбой

    HangUp(){
        this.hangUp=new ArrayList<Integer>();
    }
    public void getHangUp(){
        System.out.println(Arrays.toString(hangUp.toArray()));
    }

}
