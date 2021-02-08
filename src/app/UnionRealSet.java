package app;

public class UnionRealSet implements RealSet {
    private RealSet realset1;
    private RealSet realset2;

    public UnionRealSet(RealSet realset1, RealSet realset2) {
        this.realset1 = realset1;
        this.realset2 = realset2;
    }

    @Override
    public boolean contains(double real) {
        return realset1.contains(real) || realset2.contains(real);
    }
}
