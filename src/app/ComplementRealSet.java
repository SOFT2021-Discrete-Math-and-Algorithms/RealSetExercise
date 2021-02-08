package app;

public class ComplementRealSet implements RealSet {
    private RealSet realset1;
    public ComplementRealSet(RealSet realset1) {
        this.realset1 = realset1;
    }
    @Override
    public boolean contains(double real) {
        return !realset1.contains(real);
    }

}
