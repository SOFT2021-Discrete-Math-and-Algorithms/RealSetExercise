package app;

public class Main {
    public static void main(String[] args) {
        RangedRealSet mySet = new RangedRealSet(1,18,true,true);
        RangedRealSet mySet1 = new RangedRealSet(5,55,true,true);
        RangedRealSet mySet2 = new RangedRealSet(30,39,true,true);
        UnionRealSet u1 = new UnionRealSet(mySet,mySet2);


        RealSet realSet = mySet.union(mySet2);
        RealSet real = mySet.intersection(mySet1);
        RealSet comreal = mySet.complement();

        System.out.println(real.contains(2));
        System.out.println(real.contains(2));
        System.out.println(comreal.contains(19));
    }
}
