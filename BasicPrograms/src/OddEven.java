public class OddEven {

    public static void checkEvenOdd(int n){
        if ((n & 1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(6);
    }

}
