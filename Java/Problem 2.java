class LRUCache {
    int capacity;
    LinkedList<int[]> cache = new LinkedList<int[]>();

    public LRUCache(int capacity) {
        if (capacity < 0)
            this.capacity = -capacity;
        else
            this.capacity = capacity;
    }

    public int get(int key) {
        Iterator<int[]> iterator = cache.iterator();
        while (iterator.hasNext()) {
            int[] arr = iterator.next();
            if (arr[0] == key) {
                cache.remove(arr);
                cache.addFirst(arr);
                return arr[1];
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        Iterator<int[]> iterator = cache.iterator();

        while (iterator.hasNext()) {
            int[] arr2 = iterator.next();
            if (arr2[0] == key) {
                arr2[1] = value;
                cache.remove(arr2);
                cache.addFirst(arr2);
                return;
            }
        }
        int[] arr = { key, value };
        if (capacity == 0) {
            cache.removeLast();
            cache.addFirst(arr);
        } else {
            cache.addFirst(arr);
            capacity--;
        }

    }
}
