import java.util.Random;
public class maxminkarci {
    public  static void main (String[]args) {
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i ++) {

            array [i] = random.nextInt(100) + 1;
        }


        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        if (array[i] > largest ){


        }
    }
    System.out.print("array: ");
    for (int i = 0; i < array.length; i++)

    {


        SYstem.out.print(array[i] + "");

    }
    System.out.println();
    System.out.println("smallest" + smallest);
    System.out.println("largest" + largest);

}
}





