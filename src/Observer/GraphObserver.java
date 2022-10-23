package Observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        System.out.print("GraphObserver: ");
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
