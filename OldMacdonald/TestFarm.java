public class TestFarm{
    public static void main(String[] args){
        NamedCow c = new NamedCow("cow", "moo", "Bob");
        System.out.println(c.getName()+" the "+c.getType()+" goes "+c.getSound());
        Chick small = new Chick("chick", "cheep", "cluck");
        System.out.println(small.getType()+" goes "+small.getSound());
        Pig p = new Pig("pig", "oink");
        System.out.println(p.getType()+" goes "+p.getSound());
    }
}