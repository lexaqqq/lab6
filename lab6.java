
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class lab6 {
    private static final int Size = 25;

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(Size);

        for(int i = 0; i < Size; i++) {
            List.add((int)(1 + Math.random() * 10));
        }
        System.out.println("List: " + List);

        HashSet<Integer> colHashSet = new HashSet<>(List);
        System.out.println("Set: " + colHashSet + " number of unique numbers: " + colHashSet.size());

        HashMap<Integer, Integer> HashMap = new HashMap<>();
        Iterator<Integer> i = colHashSet.iterator();

        int Num;
        while (i.hasNext()) {
            Num = i.next();
            HashMap.put(Num, List.indexOf(Num));
        }
        System.out.println("Map: " + HashMap);
    }
}