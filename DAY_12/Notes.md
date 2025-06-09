# Topics

* In inheritence the child will above the parent, before creating the space of child object it will create the parent object.
* defaultly the child will extend the parent, The super() will automatically added in the child class as in first line.

* Diamond Problem
    - where to fetch the method from which parent, because it should rise when two parent class were extends by the child.


* Interface
    - set of reules or contract
    - In Java, an inerface is a reference type that defines a set of abstract methods along with some optional constants (static final fields). An interface can also include default methods, static methods, and nested types.

    `Class: Template`

* The Class cannot be use both final and abstract.
    
# Interface 
* By default methods in the interface are abstract.
* By default all methods in the ineraface are public.
* Do not reduce visibility of the methods.
* pricate access modifier is not allowed in interface.
* variable(fields or global variable) in the inerface are by default final and static.

`global variable / fields / variable --> private, protected modifier not allowed.`

[Inteface]                                          [Abstraction]
~ All methods are abstract till java 8              ~ one method cna be abstract
~ All variable are final and static                 ~ No, not compulsory
~ uses Implements keyword                           ~ uses extends keyword
~ Constructor is not possible                       ~ Constructor is possible (Child creates object in the Paren object space)


* Interface is 100% Abstract class or not?      No
* can we create object for abstract class?      No
* Can we create an abstract class?              Yes