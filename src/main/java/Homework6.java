import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Homework6 {
    public static void main(String[] args) {

        MySet<Integer> myset = new MySet<>();

        System.out.println((myset.add(4165)));
        System.out.println((myset.add(412312)));
        System.out.println((myset.add(0)));
        System.out.println((myset.add(4165)));
        System.out.println((myset.add(0)));
        System.out.println((myset.add(465)));
        System.out.println((myset.add(165)));

        System.out.println(myset);
        Iterator<Integer> iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.println();
        System.out.println(myset.get(0));
        System.out.println(myset.get(1));
        System.out.println(myset.get(10));
    }
}

class MySet<T> {
    private final HashMap<T, Object> map = new HashMap<>();
    private static final Object myo = new Object();

    public boolean add(T value) {
        return map.put(value, myo) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) == myo;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    public Object tos() {
        return map.values().toString();
    }

    public T get(Integer i) {
        ArrayList<T> setmy = new ArrayList<>(map.keySet());
        if (setmy.size() >= i) return setmy.get(i);
        return null;
    }
}
