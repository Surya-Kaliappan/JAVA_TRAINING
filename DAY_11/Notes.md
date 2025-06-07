# Topic

* Polymorphism, tow types -> runtime polymorphism
                          -> compile time polymorphism

* Method Overloading
    - If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
    - Method overloading increases the readability of the program
    - The runtime polymorphism can be achieved by method overriding  -  This is trigger when more that one same method applied.
    - Compile time Polymorphism is achieved by Method overloading 

* Static Block & Non-Static Block
    - Static Block always loaded in the RAM only one time. Non-Static Block loaded depends on the Number of Object Created.
    - Non-Static Executed one time.

* this keyword
    - 'this' keyword in java that refers to the current instance of the class. In OOPS it is used to:
        -> pass the current object as a parameter to another method.
        -> refer to the current class instance variable.

* Inheritance
    - Inheritance is a process in which one object acquires all the properties and behaviours of its parent object automatically. In sucha a way, you can reuse
    - In java, the class which inherits the memebers of another class is called derived class and the class whose memebers are inherited is called base class. 

    Types: 
        -> Single inheritance: 

        -> Hierarchical inheritance: Hierarchical inheritance is defined as the process of deriving more than one class froma base class.

        -> Multilevel inheritance: Multilevel inheritance is a process of deriving a class from another derived class.

        -> Hybrid inheritance: Hybrid inheritance is a combination of single, multiple inheritance and hierarchical inheritance.

        -> Multiple inheritance



        * Single        class A <-------- class B

        * Multilevel  class A <-------- class B <--------- class C

                                      |-------- class B <-------|
        * Hybrid        class A <-----|                         |------- class D
                                      |-------- class C <-------| 


                        class A <--------|
        * Hierarchical                   |------- class C
                        class B <--------|