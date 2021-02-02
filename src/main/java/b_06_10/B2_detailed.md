# Java Core Detailed Syllabus

## Lesson 6

- OOP main concepts
  - abstraction: it works, it has a contract, I don't want to know how it works
  - encapsulation: put data and code together into the one box
  - polymorphism: different behavior based on subtyping
  - inheritance
- OOP idea - split declaration, instantiation (object creation) and behavior
- classes / objects(instances)
- towards OOP
  - how to make our code OOP
  - steps, entities, structure. thinking in terms of responsibilities
- default values for class fields / members
- equals
- Java Memory Model:
  - all objects in the Heap
  - all static in the class loader area
  - all references to the objects in the stack 
- Collections
  - intro
- Streams
  - intro
- CLASS CODING: zoo
  
## Lesson 7

- CLASS CODING: geometric figures
- constructors: primary, secondary
- interfaces, abstract classes
- Collections
  - basic types
    - Array, ArrayList
    - LinkedList
    - Set (Hash/Tree) 
    - Map (Hash/Tree)
    - Tree (idea)
    - Graph (idea)
  - basics methods: length/size, get/set, push/pull, add/remove
  - traverse
- Streams, Optional
  - basics
- comparing objects
- equals, hashcode, relations between them
- towards lambda and method references (java 8)
  - anonymous classes
  - functional interfaces
  - lambdas
  - method reference
  - constructor reference
  - functions
  - composition
  - high order function
    - function as a parameter
    - function as a result
- internal / nested classes

## Lesson 8

- collections
  - generics in details
  - list: ArrayList, LinkedList
  - set: HashSet, TreeSet
  - map: HashMap, TreeMap
- different types of classes: Structural, POJO, Beans
- comparing objects
- equals, hashcode, contract between equals and hashcode
- mutability / immutability
- visibility modifiers:
  - private, protected, public, default (package protected)
  - visibility modification during inheritance
  - multiple inheritance
- getters / setters
- Streams, Optionals (java 8)
  - initiating (from collections, from any structures, )
  - processing
  - terminating (collect/group/foreach)
  - parallel
  - most common operations: map, flatmap, filter, collect
- CLASS CODING: collections, hashcode, equals, set, list, streams

## Lesson 9

- maven
  - dependencies
- Testing Java code - basic
  - junit
- 50 shades of null
  - null
  - Optional
  - exception
  - "magic" value
- Exceptions, handling:
  - syntax
  - errors, checked, unchecked
  - convert checked -> unchecked an vice versa. And why.
  - try catch finally
  - try with resources
- collections
  - Comparator / Comparable
  - Iterator / Iterable
  - Queue, PriorityQueue
  - Linked List
- SOLID
  - SRP: Single Responsibility
  - OCP: Open for extension, closed for modification
  - LSP: Substitution in the tree
  - ISP: Interface Segregation
  - DIP: Dependency Inversion (Interfaces)
- OOP main patterns:
  - composition
    - decorator
    - facade
  - building
    - builder
    - factory
  - behavior
    - command
  - DAO
  - MVC

## Lesson 10

- I/O
  - console, file, socket, stream, memory
- NIO
- Input/Output Streams vs Readers, Writers, Printers.
- encoding: ASCII, UTF16, UTF8  
- Date / Time API. Instant
- prefix / infix notation
- regular expressions basics (RegEx)
- cutting corners by using interfaces
- lombok
- logging
- serialization
- maven
  - dependencies
  - project properties
  - build automation
  - tests automation
- JUnit
  - parametrized tests
  - exceptions tests
  - annotations:
    - before/beforeEach
    - after/afterEach
- Testing Java code - advanced
  - assertj (assertion)
  - hamcrest (matchers)
- Framework vs Library
