import java.util.*;

public class NaiveDisjointSet<T> {
    HashMap<T, T> parentMap = new HashMap<>();

    void add(T element) {
        parentMap.put(element, element);
    }

    // TODO: Implement path compression
    T find(T a) {
        T node = parentMap.get(a);
        if (node.equals(a)) {
            return node;
        } else {
            return find(parentMap.get(a));
        }
    }

    // TODO: Implement union by size or union by rank
    void union(T a, T b) {
        parentMap.put(find(a), find(b));
    }
}
