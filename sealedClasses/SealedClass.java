package sealedClasses;

// Sealed class -> only limited classes can inherit them
sealed class A permits B, C, F {    // class A can extend any other class & can implement any interface - permits should always be the last thing in class definition

}

// class B, C & F should be final, sealed or non-sealed & must extend A
final class B extends A {

}

sealed class C extends A permits E {

}

non-sealed class F extends A {  // can be extended by any class

}

class D {    // cannot extend class A

}

final class E extends C {    // cannot extend class A but can extend C

}

class G extends F {

}

sealed interface X permits Y, Z{    // interface Y & Z can extend this interface. 

}

sealed interface Y extends X permits W{   // must be extended by some class/interface

}

non-sealed interface Z extends X{   // it can extend interface X

}

non-sealed interface W extends Y{

}

public class SealedClass {
    public static void main(String[] args) {
        
    }
}
