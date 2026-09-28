package recordClasses;

// class Alien{
//     // State Variables
//     private final int id;
//     private final String name;
    
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }
    
//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Alien{");
//         sb.append("id=").append(id);
//         sb.append(", name=").append(name);
//         sb.append('}');
//         return sb.toString();
//     }

//     @Override
//     public int hashCode() {
//         int hash = 7;
//         hash = 53 * hash + this.id;
//         hash = 53 * hash + Objects.hashCode(this.name);
//         return hash;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }
//         if (obj == null) {
//             return false;
//         }
//         if (getClass() != obj.getClass()) {
//             return false;
//         }
//         final Alien other = (Alien) obj;
//         if (this.id != other.id) {
//             return false;
//         }
//         return Objects.equals(this.name, other.name);
//     }    
// }


// // Record class - toString, equals method are already defined in them
// record Alien (int id, String name){ }   // Same as above class
//             // State variables - by default private and final in record class


// record Alien (int id, String name){ 
//     // We can also create a default constuctor - but not recommended
//     public Alien(){
//         this(0,""); // pass default values
//     }
// }

// record Alien (int id, String name){ 
 
//     public Alien(int id, String name){  // Canonical constructor - because it has same parameters as defined in the class
//         if(id==0){  // if i don't want id to be 0
//             throw new IllegalArgumentException("id cannot be zero");
//         }
//         this.id=id;
//         this.name=name;
//     }
// }

record Alien (int id, String name){ 
 
    public Alien{   // Compact canonical constructor
        if(id==0){  // if i don't want id to be 0
            throw new IllegalArgumentException("id cannot be zero");
        }
    }
}

// Record classes are created just to carry data - where we don't want to change data
// Record class cannot extend any other class but can implement interface
// We can create normal methods, static methods and static variables as well in a record class but we cannot create an instance variable in the record class body - to create it, we need to declate it in the parameter section of the class name (E.g. - int id, String name)
// there is no setter -> because we don't want to change any data
// the getter function is defined by default but it is not a1.getName(), it is a1.name();

public class RecordClass {
    public static void main(String[] args) {
        Alien a1=new Alien(1, "Navin");
        Alien a2=new Alien(1, "Navin");
        // Alien a3=new Alien();
        // Alien a4=new Alien(0, "Abhay");

        // System.out.println(a1.getId()); 
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        // System.out.println(a3);
        System.out.println(a2.name());
    }
}
