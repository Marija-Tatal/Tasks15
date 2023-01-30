package Tasks;

public class Task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    int Lnumber(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }


    public static void main(String[] args) {
        Task1 task1=new Task1();
        System.out.println(task1.Lnumber(7,9));
    }
}
