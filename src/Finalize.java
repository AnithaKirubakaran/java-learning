/*
 *Finalize is used to perform clean up processing just before object is garbage collected.
 * Finalize is a method.
 * */
public class Finalize {
    public static void main(String[] args) {
        Finalize f1 = new Finalize();
        Finalize f2 = new Finalize();
        f1 = null;
        f2 = null;
        System.gc();
    }

    public void finalize() {
        System.out.println("finalize called");
    }
}
