package Chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Support a = new NoSupport("A");
        Support b = new LimitSupport("B", 100);
        Support c = new SpecialSupport("C", 429);
        Support d = new LimitSupport("D", 200);
        Support e = new OddSupport("E");
        Support f = new LimitSupport("F", 300);

        a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);

        for (int i = 0; i < 500; i += 33) {
            a.support(new Trouble(i));
        }
    }
}
