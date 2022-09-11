public class Main {
    public static void main(String[] args) {
        Gitara g1 = new Gitara();
        g1.ks = 5;
        Gitara g2 = new Gitara();
        g2.ks = 6;
        Baraban b1 = new Baraban();
        b1.s = 3;
        Truba t1 = new Truba();
        t1.d = 8;
        Instrument[] mi = {g1, t1, g2, b1};
        for(int i = 0; i<mi.length; i++){
            mi[i].play();
        }
    }
}
