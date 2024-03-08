package ITIS.lab04;

import java.util.Collection;
import java.util.Set;

public interface MapInf304<K,V> {
    V put(K key, V value);

    V get(K key);

    V remove(K key);

    boolean containsKey(K key);

    Set<K> keySet();

    Collection<V> values();
}
