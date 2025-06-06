# Topics

* What is an Object
    - Object is a combination of state and behaviour
* what is meaning of state
    - state refers the structure
* Usage
    - every object has its own properties.
    - 

* Class
    - Class is a template or a blueprint
    - It is logical entiry
    - Class is a container  (objects are belongs to the class)
    - class is collection of object
    - Class does not occupy space.
    - Class defines the variables and methods common to all objects of a certain kind.
    - When you create an Object from a class, you are said to have created an Instance of the class.

* Object 
    - Object is a real-time entity
    - Object is combination of states and behaviour
    - Object is an instance of class, each object stores about what is current state.
    - Object is  a memory reference of a class
    - Object occupy space

Modifier        class   Package     Subclass    World  (World -> other Package, Package-> same Package)
pulbic            Y        Y            Y         Y
protected         Y        Y            Y         N
no modifier       Y        Y            N         N    (no modifier -> Package private)
private           Y        N            N         N


* Access Modifier or Specifier:
    - In java, access specifiers are the keywords which are used to define the access method, class, or a variable
    - Four Access Specifier
        -> Public
        -> Protected
        -> Private
        -> No Modifier

* Package
    - to compile "javac -d . Filename.java"
    - to run "java packagename.classname"

* Constructor
    - constructor is useful for initializing object specific values.
    - It is created using the same name of our class name.
    - constructor area is getting called automatically when object/instance is created
    - constructor doesn't have any return type
    - Default constructor is invisible.


# Problems
1) Write a program to check the given string is rotated of another string.
2) Write a program to find the number of commas upto the given number.