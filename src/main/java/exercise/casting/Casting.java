package exercise.casting;

public class Casting {

    int myInt = 9;
    double myDouble = myInt; // auto casts from int to double
    double someDouble = 3.14d;
    int someInt = (int) someDouble; // manual cast from double to int

    public Casting() {
    }

    public int getMyInt() {
        return myInt;
    }

    public double getMyDouble() {
        return myDouble;
    }

    public double getSomeDouble() {
        return someDouble;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void display() {
        System.out.println("Widening Casting\n" + "Auto cast: int -> double");
        System.out.println(getMyInt() + "->" + getMyDouble());
        System.out.println("\nNarrowing Casting\n" + "Manual cast: double -> int");
        System.out.println(getSomeDouble() + "->" + getSomeInt());
    }
}
