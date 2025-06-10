* Check if you can create private class - No
* Check if you can create the private main method - No
* Check if you can create Method local variable as private - No

* cannot make a static reference to the non-static method, but it can make it from non-static to non-static



# Colletions

                                                                   +--------------------+
                                                                   | ~ BlockingDeque(1) |      +--------------------+
                                           +----------+            | ~ BlockingQueue(1) |----->| ~ PriorityQueue(c) |
                                      |--->| Queue(1) |----------->| ~ Deque(1)         |      | ~ LinkedList(c)    |
                                      |    +----------+            | ~ TransferQueue(1) |      +--------------------+
                                      |                            +--------------------+
                                      |
                                      |
                                      |                            +-------------------+       +--------------------+
                +---------------+     |    +--------+              | ~ NavigableSet(1) |       | ~ HashSet(c)       |
                | Collection(1) |-----+--->| Set(1) |------------->| ~ SortedSet(1)    |------>| ~ LinkedHashSet(c) |
                +---------------+     |    +--------+              +-------------------+       | ~ TreeSet(c)       |
                                      |                                                        +--------------------+
                                      |
                                      |                            +------------------------+
                                      |    +---------+             | ~ ArrayList(c)         |
                                      |--->| List(1) |------------>| ~ LinkedList(c)        |
                                           +---------+             | ~ Stack(Legacy class)  |
                                                                   | ~ Vector(Legacy class) |
                                                                   +------------------------+




# Exception handling

1) What is Exception?
     - Abnormal Behaviour in programs
     - JVM----->Object----->Class
* Exception --> Whenever Exception occurs, the corresponding exception Object will be thrown.

# Throwable class
     - Throwable class is the superclass of all error and exception in the java language.

                                                       Object
                                                         |
                                                         |
                                                     Throwable
                           |-----------------------------|---------------------------------------|
                       Exception                                                               Errors 
        |------------------|---------------|                                                     |
Checked Exception                  Uncheck Exception                                             |-- StackOVerFlowError
  |                                  |                                                           |-- VirtualMachineError
  |-- IOException                    |-- ArithmeticException                                     |-- OutOfMemoryError
  |-- SQLException                   |-- NullPointerException
  |-- ClassNotFoundException         |-- IndexOutOfBoundException
                                          |   
                                          |-- ArrayIndexOutOfBoundsException
                                          |-- StringIndexOutOfBoundsException   


# Exception 
     ~ Checked exception --> compile time Exception
     ~ unchecked exception --> Runtime Exception

     1. Stack-Line No
     2. Exception Name
     3. Message String


# Error - Exception
     [Error]     - An error is a subclass of Throwable that indicates serious problem that a reasonable application should not try to catch. Most such errors are abnormal conditions.

     (Exception) - The Class Exception and its subclass are a form of throwable that indicates conditions that a reasonable application might want to catch.

# Runtime Exception
     - RuntimeException and its sublass are unchecked exception.
     - unchecked exception are known at runtime.
     - All runtume exception are RuntimeException.

