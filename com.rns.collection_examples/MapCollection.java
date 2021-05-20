https://www.programiz.com/java-programming/concurrenthashmap

https://javaconceptoftheday.com/how-hashmap-works-internally-in-java/

https://www.youtube.com/watch?v=c3RVW3KGIIE&t=632s

https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/#:~:text=Contract%20between%20hashCode()%20and%20equals()&text=If%20two%20objects%20are%20equal,lang.

hashcode() and equals() contract :

equal objects must have equal hash codes.

>Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified.
This integer need not remain consistent from one execution of an application to another execution of the same application.

> If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.

>It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode method on each of the two objects must produce distinct integer results.

However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.


>> Java hashCode() and equals() best practices :

> Always use same attributes of an object to generate hashCode() and equals() both. As in our case, we have used employee id.

> equals() must be consistent (if the objects are not modified, then it must keep returning the same value).

> Whenever a.equals(b), then a.hashCode() must be same as b.hashCode().

> If you override one, then you should override the other.


https://www.baeldung.com/java-hashcode


https://javaconceptoftheday.com/initial-capacity-and-load-factor-of-hashmap-in-java/


https://javaconceptoftheday.com/differences-between-hashmap-vs-hashset-in-java/


Best Practice : Key in a hashmap must be either immutable or never change its state once interted in hasmap.

Why?? 
-- 
	Bcoz hashcode of a mutable object can be changed after changing the state of that object.And internally Hashmap calls hashcode method on keys frequently (in case of rehashing, and inserting elemnts)
	
	
https://www.falkhausen.de/Java-8/java.util/Collection-Hierarchy-simple.html

Methods of Map Interface :

1. void	clear() - Removes all of the mappings from this map (optional operation).

2. boolean	containsKey(Object key) - Returns true if this map contains a mapping for the specified key.

3. boolean	containsValue(Object value) - Returns true if this map maps one or more keys to the specified value.

4. Set<Map.Entry<K,V>>	entrySet() - Returns a Set view of the mappings contained in this map.

5. boolean	equals(Object o) - Compares the specified object with this map for equality.

6. V	get(Object key) - Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

7. int	hashCode() - Returns the hash code value for this map.

8. boolean	isEmpty() - Returns true if this map contains no key-value mappings.

9. Set<K>	keySet() - Returns a Set view of the keys contained in this map.

10. V	put(K key, V value) - Associates the specified value with the specified key in this map (optional operation).

11. void	putAll(Map<? extends K,? extends V> m) - Copies all of the mappings from the specified map to this map (optional operation).

12. V	remove(Object key) - Removes the mapping for a key from this map if it is present (optional operation).
 
13. int	size() - Returns the number of key-value mappings in this map.

14. Collection<V>	values() - Returns a Collection view of the values contained in this map.


https://www.programiz.com/java-programming/concurrenthashmap


Collections Utility methods :
BinarySearch()
reverse()
shuffle()
sort()
frequency()
copy()
unmodifiable-List/set/map
synchronized-List/set/map

https://docs.oracle.com/javase/tutorial/java/generics/index.html


	
	