package Tasks;

public class Tasks2 {
    // Create a method that will take a number and prints whether the number is even or odd.

  String Number(int num1){
        if (num1%2==0){
            return num1+ " is even";
        }else{
            return num1+ " is odd";
        }
    }

    public static void main(String[] args) {
        Tasks2 task2=new Tasks2();
        System.out.println(task2.Number(5));
    }
}
