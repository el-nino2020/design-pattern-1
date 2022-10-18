package Singleton.exercise5_2;

public class Triple {
    private static Triple[] triples;

    static {
        triples = new Triple[3];
        for (int i = 0; i < triples.length; i++) {
            triples[i] = new Triple();
        }
    }

    private Triple() {
    }

    public static Triple getInstance(int id) {
        //check argument
        return triples[id];
    }
}
