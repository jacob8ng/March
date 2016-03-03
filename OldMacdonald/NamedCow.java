public class NamedCow extends Cow{
    private String myName;
    NamedCow(String type, String sound, String name){
        super(type, sound);
        myName = name;
    }
    public String getName(){
        return myName;
    }
}