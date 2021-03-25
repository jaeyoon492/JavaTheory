package Practice;

//MjList라는 객체를 생성
//객체 내부에서만 사용될 배열이라 private 접근 제어자로 외부의 접근은 차단.
public class MjList {
    //몇개의 데이터가 List안에 들어있는지 알기위해 size라는 변수를 선언.
    private int size = 0;
    //Object데이터 타입의 배열을 생성해서 elementData에 할당 그배열의 수용할수 있는 값의 수는 100개
    private Object[] elementData = new Object[100];

    public boolean add(Object element){
        //addLast호출시 받아오는 입력값인 element가 elementData[0]에 들어가게 된다.
        //size++; 를 통해 또 addLast호출시 그다음 받아오는 element는 elementData[1]에 들어가게 된다.
        elementData[size] = element;
        size++;
        return true;
    }

}
