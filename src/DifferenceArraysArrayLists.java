//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class  DifferenceArraysArrayLists {
    public static void main(String[] args) {
        /*Array:
        An array is one of the most basic data structures in Java.
        It is a fixed-size container used to store elements of the same data type.
        The length of the array is determined when it is created and cannot be changed later.
        */
        System.out.print("numbers1: " );
        int[] numbers1 = new int[10];
        for (int i = 0; i<10; i++){
            numbers1[i]=i;
            System.out.print(numbers1[i]);
        }
        System.out.println();

        ArrayList<Integer> numbers2 =new ArrayList<>();
        for (int i = 0; i<10; i++){
            numbers2.add(i);
        }
        System.out.print("numbers2: "+numbers2);
        //We can see that the array(numbers1) output is tightly contiguous,
        // similar to how it is arranged and stored in memory.

        // Suppose need to add an element to numbers1 and numbers2 relatively
        System.out.println();
        System.out.println("*******************Add An Element(Index 10)*******************");

        int[] newNumbers1 =new int[15];
        System.arraycopy(numbers1,0,newNumbers1,0, numbers1.length);
        newNumbers1[10] = 10;


        for (int i : newNumbers1){
            System.out.print(i);
        }
        System.out.println();

        numbers2.add(10);
        System.out.print("numbers2(added): "+numbers2);
        System.out.println();
//        ArrayList:
//        ArrayList is a dynamic array class provided by Java. It can automatically expand as the amount of data increases and belongs to the Java Collections Framework.
//        Its underlying layer is actually implemented with arrays. Arrays store data directly, while ArrayList stores objects internally through wrapper classes.
//        In other words, ArrayList requires boxing and unboxing, which will have a certain performance overhead.
        System.out.println("**************How About Add Uncertain Elements? Much Difficult to Array**************");
    }
}