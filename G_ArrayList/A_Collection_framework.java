//! Java Collection Framework
// The java.util package contains one of Java’s most powerful subsystems: The Collections Framework.
// The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

//?  Collections are in 4 basic types:
//*    Lists:
//     The List interface extends Collection to define an ordered collection with duplicates allowed. 
//     The List interface adds position-oriented operations, as well as a new list iterator that enables the user to traverse the list bi-directionally. 
//     Eg: ArrayList, LinkedList, vector and stack are classes implementing List interface.

//*    Sets:
//     The Set interface extends the Collection interface. 
//     It will make sure that an instance of Set contains no duplicate elements. 
//     The concrete class implements hashcode and equals methods to make sure uniqueness of objects. 
//     Eg: HashSet, LinkedHashSet and TreeSet.

//*    Maps:
//     A map is a container that stores the elements along with the keys. 
//     The keys are like indexes. In List, the indexes are integers. 
//     In Map, the keys can be any objects. 
//     A map cannot contain duplicate keys. 
//     Each key maps to one value. 
//     A key and its corresponding value from an entry, which is actually stored in a map. 
//     Eg: HashMap, HashTable,TreeMap and LinkedHashMap are classes implementing Map interface.

//*    Queues:
//     A queue is a first-in, first-out data structure. 
//     Elements are appended to the end of the queue and are removed from the beginning of the queue. 
//     In a priority queue, elements are assigned priorities. 
//     When accessing elements, the element with the highest priority is removed first.
//     Eg: PriorityQueue, Deqeue

//? Methods in Java collections:
// add  
// size
// remove
// iterate
// addAll
// removeAll
// clear