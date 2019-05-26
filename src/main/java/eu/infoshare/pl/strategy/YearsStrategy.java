package eu.infoshare.pl.strategy;

public class YearsStrategy implements Stategy {
    @Override
    public int ccalculate(Employye employye) {
        return 10 * employye.getSalary();
    }
}
