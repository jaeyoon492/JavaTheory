package TestList;

//MjList라는 객체를 생성
//객체 내부에서만 사용될 배열이라 private 접근 제어자로 외부의 접근은 차단.
public class MjList {
    //몇개의 데이터가 List안에 들어있는지 알기위해 size라는 변수를 선언.
    private int size = 0;
    //Object데이터 타입의 배열을 생성해서 elementData에 할당 그배열의 수용할수 있는 값의 수는 100개
    //ㅇㅇ 오브젝트가 갓파더 거든 그냥 모든 클래스의 조상
    // 그 말은 오브젝트에 뭘 담으려고 해도 다 담을수 있다는 이야기임
    // 오브젝트를 쓰면 Integer, String, Long, Short, .. 등등 다 담을수 있으니까 저거 하나ㅏㄴ 만들면되는데
    // 만약에 오브젝트 배열이 아니고 인티저, 스트링, 롱 배열을 만들면
    // 저 변수를 하나만 만드는게 아니라 타입별로 다 만들어줘야되고
    // 만들어지는 타입에 따라서 메소드를 다 따로 만들어야 되니까
    // 오브젝트로 하는게 맞아

    private Object[] elementData = new Object[100];

    public boolean add(Object element){
        //addLast호출시 받아오는 입력값인 element가 elementData[0]에 들어가게 된다.
        //size++; 를 통해 또 addLast호출시 그다음 받아오는 element는 elementData[1]에 들어가게 된다.
        elementData[size] = element;
        size++;
        return true;
    }

    // 에드인데 또다른 느낌의 기능????? 일때 오버로딩 하면 이름도 하나로 재탕 가능하고 사용하는 사람도 편해
    public boolean add(int index, Object element){
        //배열의 위치를 인자로 받아 index로 초기화하고, 해당 배열에 새로들어올 element 값을 인자로 받는다.
        //반복문으로 변수 i 에 배열의 요소의 갯수에서 -1 하여 초기화 하고, i 원하는 위치에 도달할수 있도록 조건문에 index인 동안을 넣음
        //반복문의 결과엔 현재 elementData[i]를 한칸 옆으로 밀기 위해 elementData[i+1]에 저장함.
        for(int i = size-1; i >= index; i-- ){
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element){
        return add(0 , element);
    }

}
