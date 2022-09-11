public class Baraban implements Instrument{
    int s;
    @Override
    public void play() {
        System.out.println("Играет барабан в ключе " + KEY +  " он "+ s + "-ого размера");
    }
}
