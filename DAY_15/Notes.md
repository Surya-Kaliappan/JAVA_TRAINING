# Topics


                                            collision resolution techniques
                                                        |
                                                        |
                        +-------------------------------+----------------------------------+
                        |                                                                  |
                     Chaining                                                       Open Addressing
                                                                                        |
                                                                                        +---Linear probing
                                                                                        +---Quadratic probing
                                                                                        +---Double hasing


* Linear probing - just add the elements in the next available space (k mode n means 0 <-> (n-1))
* Quadratic probing - (h+i^2 mod n)
                    - here 'i' is the no of times we checked with index which is empty are not.
                    - h(k) = k mode 10
                    - h(k,i) = (h(k)+i^2)mod10
                    - keys : 42,16,91,33,18,27,36,62


    
                                                                        
                                                                +--->HashMap(C)
                                 +-------------------------+    +--->LinkedListHaspMap(C)
                Map(I)-----------+ Entry(I) (SubInterface) +----+--->HashTable(C)
                                 +-------------------------+    +--->TreeMap(C)
                                                                +--->Properties(C)


# Methods in Map
* Object put(Object key, Object value)
* void putAll(Map M)
* Object get(Object key)
* Object getAll(Object key)
* boolean containsKey(Object key)
* Object getorDefault(key,0)
* boolean containsValue(Object value)
* int size()
* boolean isEmpty()
* void clear()

# Collection views of Map:
    - set keySet()
    - collection values
    - Set entrySet()