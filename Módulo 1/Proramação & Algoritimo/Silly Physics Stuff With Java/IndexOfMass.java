import java.util.*;
public class IndexOfMass {
    public static void main(String[] args) {
        Masses e1 = new Masses();
        e1.mass = 40;
        e1.height = 1.20;
        e1.add();

        Masses e2 = new Masses();
        e2.mass = 70;
        e2.height = 1.50;
        e2.add();

        Masses e3 = new Masses();
        e3.mass = 100;
        e3.height = 2;
        e3.add();

        Masses e4 = new Masses();
        e4.mass = 150;
        e4.height = 1.80;
        e4.add();

        Masses e5 = new Masses();
        e5.mass = 200;
        e5.height = 1.70;
        e5.add();

        double[] masses = {e1.mass, e2.mass, e3.mass, e4.mass, e5.mass};
        double[] heights = {e1.height, e2.height, e3.height, e4.height, e5.height};
        double[] indexes = {};
        for (int i = 0; i < 5; i++) {
            indexes[i] = masses[1] / ((heights[i]) * (heights[i]));
        }

        for (double index : indexes) {
            System.out.println(index);
        }
    }
}