package LVTI;

class LocalVariableTypeInference{
    // var num=10;  // var is not allowed here
    public static void main(String[] args) {
        int a=9;
        var b=8;    // introduced in java 10 - compiler will itself convert to int at compile time
        String var="Hello"; // along with keyword, var can also be used as a variable name

        int c;
        // var d;   // not acceptable because compiler will not be able to assign data type

        int[] nums=new int[10];
        var arr=new int[10];

    }
}

// class var{   // var cannot be used as a class name

// }