# Java8

Streams

* If we want to process the object from collection, then we should use a stream. (Utils Package)

Stream operations are classified into two operations:

1. InterMediate Operations: Transfer a stream into another stream.
EG. filter, map, distinct, sorted, limit etc.

2. Terminal Operations: It produce a result and terminate the stream.
EG. forEach, collect, reduce, count etc.

1. Filter: It is used to filter the data from stream, and create new stream. Filter takes predicate as argument which returns boolean 
Syntax: Stream filteredStream = originalStream.filter(element -> /* Predicate (Functional Interface) (true/false) */);

Example: Find Even number from array list using stream.
List<Integer> list = Arrays.asList(5, 10, 15, 20);
List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
System.out.println(filteredList);


2. Map: Map is used to transform each element of stream and returns a new stream. Map takes function as argument, return type based on the type of the data. 
Syntax: Stream mappedStream = originalStream.map(element -> /* transformation function*/);

Example: Multiple by two for each element of the list.

3. Count: to count the number of elements in stream. 


4. Sorted:  to sort the order of elements in the stream. Sorted according to natural order.

5. Min & Max: both method takes comparator as argument and based on comparator result will be return the value.

min(Comparator) -> will return 1st element from comparator result;
max(Comparator) -> will return last element from comparator result;

6. ForEach: to perform an action  for each element of this stream. (Terminal operation)
