# String
    -> String is a class. It represents a sequence of characters, Java treats strings as objects of the 'String' class rather than as primitive data types.
    -> String is Immutable in nature.
    -> It has two ways to declare.  (object & string literals)
    -> The Strig will store in SCP(String Constant Pool) when it is directly diclare 

# String Methods
    -> length()     -> Length of the String
    -> isBlank()    -> true if whitespace or just "" else false
    -> isEmpty()    -> true if the length of the String has 0 else false.
    -> toLowerCase()-> Convert the string to lowercase, but it doesn't change the String.
    -> toUpperCase()-> same as toLowerCase() but here it will convert to uppercase.
    -> tim()        -> remove the trailing and ending space of the String but not changing the original String.
    -> stripleading()-> 
    -> stripTrailing()->
    -> repeat(count)-> repeate the string at count times, but not affect the original
    -> indent(int)  -> leaves space(identation) at starting at given number.
    -> toCharArray()-> converts the String into array of character
    -> matches()    -> 
    -> replace()
    -> replaceFirst()
    -> replaceAll()
    -> split()
    -> join()

# Comparison Methods
    -> equals() (boolean)
    -> equalsIgnoreCase() (boolean) -> Ignore cases
    -> compareTo() (int)
            - return positive s1>s2
            - return negative s1<s2
            - return zero s1==s1
    -> compareToIgnoreCase() (int) -> Same as compareTo() but it ingore case;
    -> startsWith(prefix,fromIndex) (boolean)
    -> endsWith() (boolean)
    -> contentEquals(charSeq) (boolean)
    -> contentEquals(StringBuffer) (boolean)
    -> contains() (boolean)

# Searching Method
    -> indexOf("ASCII/character seq") (int) -> gives that index of the char in the String
    -> indexOf("ASCII/character seq",from index) (char) -> same as indexOf but it will start from index as in parameter.
    -> lastIndexOf("ASCII/character sql" and fromIndex) 
    -> substring(BeginIndex, EndIndex); (String) -> gives the substring from and to of given index.
    -> charAt(index) 
    -> subSequence(BeginIndex, EndIndex);
