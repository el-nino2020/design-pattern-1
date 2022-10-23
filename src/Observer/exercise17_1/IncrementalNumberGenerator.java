package Observer.exercise17_1;

import Observer.NumberGenerator;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int init;
    private int step;
    private int end;
    private int number;


    public IncrementalNumberGenerator(int init, int end, int step) {
        this.init = init;
        this.step = step;
        this.end = end;
    }


    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (number = init; number < end; number += step) {
            notifyObservers();
        }
    }
}
