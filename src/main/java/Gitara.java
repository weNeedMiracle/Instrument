public class Gitara implements Instrument{
    int ks;
    @Override
    public void play() {
        System.out.println("Играет гитара в ключе " + KEY +  " у неё "+ ks + " струн");
    }
}
