public class Farm{
    private Animal[] a = new Animal[3];
    Farm(){
        a[0] = new NamedCow("cow", "moo", "Bob");
        a[1] = new Chick("chick", "cheep", "cluck");
        a[2] = new Pig("pig", "oink");
    }
    public void animalSounds(){
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i].getType()+" goes "+a[i].getSound());
        }
        System.out.println("The cow's name is "+((NamedCow)a[0]).getName());
    }
}