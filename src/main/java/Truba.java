public class Truba implements Instrument{
    int d;
    @Override
    public void play() {
        System.out.println("Играет труба в ключе " + KEY +  " её диаметр "+ d + " см");
    }
}
