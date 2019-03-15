package daily_problems.Problem52;

import java.util.HashMap;
import java.util.Map;

public class LFUCache<K,V> {
    /*
    Implement an LRU (Least Recently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:

set(key, value): sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least recently used item.
get(key): gets the value at key. If no such key exists, return null.
Each operation should run in O(1) time.


     */
    int capacity;

    Map<K,V> map = new HashMap<>();

    public void set(K key, V Value) {

    }

    public V get(K key) {
        return null;
    }

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }
}
