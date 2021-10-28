import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) list.add(i+5);

        for(int a : list) System.out.print(a + " ");
        System.out.println();

        list.remove(0);
        for(int a : list) System.out.print(a + " ");
        System.out.println();
        list.remove(1);
        for(int a : list) System.out.print(a + " ");
        System.out.println();

    }
}