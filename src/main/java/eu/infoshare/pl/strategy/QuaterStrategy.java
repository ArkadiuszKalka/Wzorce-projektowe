package eu.infoshare.pl.strategy;

public class QuaterStrategy implements Stategy {

    @Override
    public int ccalculate(Employye employye) {
        return 5 * employye.getSalary();
    }
}
