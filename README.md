# Java-Interview-Prep

There are several built-in data structures in Java, some of the most commonly used ones include:

# ArrayList:
This is a dynamic array implementation of the List interface. It allows for the storage of a collection of elements. Commonly used functions include:
* ___add(E element)___: Adds an element to the ArrayList
* ___get(int index)___: Returns the element at the specified index
* ___remove(int index)___: Removes the element at the specified index
* ___size()___: Returns the number of elements in the ArrayList
* ___clear()___: Removes all elements from the ArrayList

# LinkedList: 
This is an implementation of the List interface that uses a doubly-linked list. It allows for the storage of a collection of elements. Commonly used functions include:
* ___add(E element)___: Adds an element to the LinkedList
* ___get(int index)___: Returns the element at the specified index
* ___remove(int index)___: Removes the element at the specified index
* ___size()___: Returns the number of elements in the LinkedList
* ___clear()___: Removes all elements from the LinkedList

# HashMap: 
This is an implementation of the Map interface that uses a hash table for storage. It allows for the storage of key-value pairs, where keys are unique. Commonly used functions include:
* ___put(K key, V value)___: Adds a key-value pair to the HashMap
* ___get(Object key)___: Returns the value associated with the specified key
* ___remove(Object key)___: Removes the key-value pair associated with the specified key
* ___size()___: Returns the number of key-value pairs in the HashMap
* ___clear()___: Removes all key-value pairs from the HashMap

# HashSet:
This is an implementation of the Set interface that uses a hash table for storage. It allows for the storage of unique elements. Commonly used functions include:
* ___add(E element)___: Adds an element to the HashSet
* ___remove(Object element)___: Removes the specified element from the HashSet
* ___size()___: Returns the number of elements in the HashSet
* ___clear()___: Removes all elements from the HashSet
* ___contains(Object element)___: Returns true if the HashSet contains the specified element, false otherwise

Note that these are just a few examples and each data structure has its own specific use cases, and other functions available.

# Map, Filter, Reduce for the built-in Data Structures
You can use the stream() method to create a stream of the elements in a built-in data structure in Java, and then use the map(), filter(), and reduce() methods on the stream. Here are some examples of how to use these methods on each of the data structures mentioned in the previous answer:

* ArrayList:
```
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

// Use map to square each number
ArrayList<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toCollection(ArrayList::new));

// Use filter to get only even numbers
ArrayList<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(ArrayList::new));

// Use reduce to get the sum of all numbers
int sum = numbers.stream().reduce(0, (a, b) -> a + b);
```

* Linked List:
```
LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

// Use map to square each number
LinkedList<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toCollection(LinkedList::new));

// Use filter to get only even numbers
LinkedList<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(LinkedList::new));

// Use reduce to get the sum of all numbers
int sum = numbers.stream().reduce(0, (a, b) -> a + b);
```

* HashMap:
```
HashMap<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
map.put("Three", 3);

// Use map to increase each value by one
HashMap<String, Integer> incrementedMap = map.entrySet().stream()
                                            .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue() + 1));

// Use filter to get only entries with value greater than 1
HashMap<String, Integer> filteredMap = map.entrySet().stream()
                                            .filter(e -> e.getValue() > 1)
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

// Use reduce to get the sum of all values
int sum = map.values().stream().reduce(0, (a, b) -> a + b);
```
* HashSet:
```
HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

// Use map to square each number
HashSet<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toCollection(HashSet::new));

// Use filter to get only even numbers
HashSet<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(HashSet::new));

// Use reduce to get
```