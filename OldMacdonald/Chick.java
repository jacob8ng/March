import java.util.*;
public class Chick implements Animal{
    private String myType;
    private String mySound;
    private String mySound2;
    Chick(String type, String sound, String sound2){
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }
    public String getSound(){
        Random ran = new Random();
        int random = ran.nextInt(2);
        if(random == 0){
            return mySound;
        }else{
            return mySound2;
        }
    }
    public String getType(){
        return myType;
    }
}