package app;

public interface RealSet {
    boolean contains(double real);


    default  RealSet intersection(RealSet other){
        return new IntersectionRealSet(this,other);
    }

    default RealSet complement(){
        return  new ComplementRealSet(this);
    }

    default RealSet union(RealSet other) {
        return new UnionRealSet(this, other);
    }
}
