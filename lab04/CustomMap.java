package ITIS.lab04;

import java.util.*;

public class CustomMap<K, V> implements MapInf304<K, V> {
    private List<Map.Entry<K, V>> entries = new LinkedList<>();

    @Override
    public V put(K key, V value) {
        for (Map.Entry<K, V> entry : entries) {
            if (Objects.equals(key, entry.getKey())) {
                V oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        entries.add(new AbstractMap.SimpleEntry<>(key, value));
        return null;
    }

    @Override
    public V get(K key) {
        for (Map.Entry<K, V> entry : entries) {
            if (Objects.equals(key, entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        Iterator<Map.Entry<K, V>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (Objects.equals(key, entry.getKey())) {
                iterator.remove();
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        for (Map.Entry<K, V> entry : entries) {
            if (Objects.equals(key, entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (Map.Entry<K, V> entry : entries) {
            values.add(entry.getValue());
        }
        return values;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }
}
