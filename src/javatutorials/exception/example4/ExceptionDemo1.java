package javatutorials.exception.example4;

class A{
    private int arr[] = new int[3];

    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
    }

    public void y(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void x(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void q(int first, int second){
        try{
            System.out.println(arr[first] / arr[second]);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("그 외에 다른 예외");
        }finally {
            System.out.println("finally");
        }
    }
}



public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.q(10,0); //배열의 길이가 3칸인데 인자로 10을 넣어서 배열의 10번째 인덱스를 불러오려 하니 ArrayIndexOutOfBoundsException 이 발생함
        a.q(1,0);  //ArithmeticException
        a.q(2,1);  //예외 없음
    }
}
