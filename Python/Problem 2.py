class LRUCache(object):

    def __init__(self, capacity):
        """
        :type capacity: int
        """
        if capacity < 0:
            self.capacity = -capacity
        else: 
            self.capacity = capacity
        self.cache = deque()
        

    def get(self, key):
        """
        :type key: int
        :rtype: int
        """
        for arr in self.cache:
            if arr[0] == key:
                self.cache.remove(arr)
                self.cache.appendleft(arr)
                return arr[1]
        return -1
        

    def put(self, key, value):
        """
        :type key: int
        :type value: int
        :rtype: None
        """
        for arr2 in self.cache:
            if arr2[0] == key:
                arr2[1] = value;
                self.cache.remove(arr2)
                self.cache.appendleft(arr2)
                return
        arr = [key,value]
        if self.capacity == 0:
            self.cache.pop()
            self.cache.appendleft(arr)
        else:
            self.cache.appendleft(arr)
            self.capacity -= 1
        
