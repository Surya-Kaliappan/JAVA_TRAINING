# Topic
1) String Buffer and String Builder

* StringBuffer and StringBuilder is mutable
    - When String Object needs to be modified very often we should not use string object.

* StringBuffer - java.lang - Mutable class - synchronized class
    - We cannot make the string literal as mutable by using the StringBuffer. 'StringBuffer sb = "abc";'

* Synchronized (multi threading is a subset of multi tasking)
    - A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified.
    - all methods are synchronized methods

* StringBuilder - non synchronized class - java.lang - Mutable class - JDK 1.5
    - A mutable sequence of characters. This class provides an API compactible with StringBuffer, but with 'no guarantee of synchronization'

    - This class should generally be used in perference to this one, as to supports all of the same operations but it is faster, as it performs no synchronization.

    - String Builder is not thread sage
    - all methods are not synchronized methods

# Methods (String Builder & String Buffer has same methods)
1) append()
2) insert(offset,"char seq")
3) reverse()
4) deleteCharAt(index)
5) replace(start,end,"char seq")
6) hashCode()
7) setCharAt()

# Problems
1) Write a program to check the given string is palindrome or not
2) Write a program to Remove outmost Paranthesis
3) Write a program to convert String to number
4) Write a program to find the largest Pdd number in a string