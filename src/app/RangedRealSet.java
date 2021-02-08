package app;
public class RangedRealSet implements RealSet {
    private double min;
    private double max;
    private boolean minIncluded;
    private boolean maxIncluded;

    public RangedRealSet(double min, double max, boolean minIncluded, boolean maxIncluded) throws IllegalArgumentException {

        if (min > max) {
            throw new IllegalArgumentException("Min Can't be bigger than max");
        }
        this.min = min;
        this.max = max;
        this.minIncluded = minIncluded;
        this.maxIncluded = maxIncluded;
    }

    @Override
    public boolean contains(double real) {
        if (!minIncluded && !maxIncluded) {
            return real > min && real < max;
        } else if (minIncluded && !maxIncluded) {
            return real >= min && real < max;
        } else if (!minIncluded && maxIncluded) {
            return real > min && real <= max;
        } else return real >= min && real <= max;
    }
}
