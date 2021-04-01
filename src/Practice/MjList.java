package Practice;

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

    public boolean add(Object element1, Object element2, Object element3){
        elementData[0] = element1;
        elementData[1] = element2;
        elementData[2] = element3;
        return true;
    }

    public boolean add(Object element){
        //addLast호출시 받아오는 입력값인 element가 elementData[0]에 들어가게 된다.
        //size++; 를 통해 또 addLast호출시 그다음 받아오는 element는 elementData[1]에 들어가게 된다.
        elementData[size] = element;
        size++;
        return true;
    }

    //이 기능은 단순히 element를 추가하는 메서드를 호출하여 해당 엘리먼트에 index값을 0번으로 지정해 항상 첫번째 자리에 배치하는 메서드 이다.
    public boolean addFirst(Object element){
        return add(0 , element);
    }

    // 에드인데 또다른 느낌의 기능????? 일때 오버로딩 하면 이름도 하나로 재탕 가능하고 사용하는 사람도 편해
    public boolean add(int index, Object element){
        //배열의 위치를 인자로 받아 index로 초기화하고, 해당 배열에 새로들어올 element 값을 인자로 받는다.
        //반복문으로 변수 i 에 배열의 요소의 갯수에서 -1 하여 초기화 하고, i 원하는 위치에 도달할수 있도록 조건문에 index인 동안을 넣음
        //반복문의 결과엔 현재 elementData[i]를 한칸 옆으로 밀기 위해 elementData[i+1]에 저장함.
        for(int i = size-1; i >= index; i-- ){
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element; //인덱스의 역할을 만들어주는 코드.
        size++;
        return true;
    }

    //toString 이라는 것을 구현하게 되면 객체를 문자로 출력하는 상황에서 toString 이라는 이름의 메소드가 호출되도록 약속 되어있다.
    //임의의 변수 str에 "[" 을 저장하고 return 값에 str + "]" 하여 그 사이에 포문을 돌려 배열의 길이 만큼 가리키는 값을 추가한다.
    public String toString(){ //이거슨 오버라이딩임 자바의 toString 보다 우선순위에 있다.
        String str = "[";
        for(int i = 0; i < size; i++) {
            str += elementData[i];
            if(i < size-1) {
                str += ",";
            }
        }
        return str + "]";
    }

     //해당인덱스를 삭제하고 그 자리로 다음 인덱스 들을 당겨오는 메서드이다.
    //반복문으로 당겨올 인덱스를 지정하는것은 삭제할 인덱스 바로 옆자리 이기 때문에 index+1 로 시작한다.
    //반복문의 끝은 인덱스의 배열마지막 번호인데 그것을 특정할수 없으므로 총 배열갯수에서 -1 을 한 size-1 까지로 정한다.
    //반복할 내용은 빠진 자리를 메우는 기능을 하기 위해선 원래 있던 기존 index자리에서 -1 즉 element[i-1]에 저장하면 된다.
    //반복문을 통해 한칸씩 당겨졌지만 마지막 인덱스의 값은 그대로 존재 하기 때문에       ex: 4번칸에 5번을 저장한것이지 5번을 삭제한것은 아님
    //가장 마지막 배열을 가리키는 element[size]를 null로 초기화해준다.
     public Object remove(int index){
        Object removed = elementData[index];
        for(int i = index + 1; i <= size - 1; i++){
            elementData[i - 1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        return removed;
     }
     public Object removeFirst(){
        return remove(0);
     }

     public Object removeList(){
        return remove(size-1);
     }

     //해당 위치의 [인덱스번호]를 입력하면 그 해당 배열의 (값)을 알려주는 메서드.
     public Object get(int index){
        return elementData[index];
     }

     //배열의 길이를 나타내주는 메서드 굳이 메서드로 만든 이유는 외부에서 size를 맘대로 변경할수 없게 하기 위해서 이다.
     public int size(){
        return size;
     }

     /*indexOf 배열의 벨류값을 파라매터로 입력시 해당 벨류의 인덱스 번호를 알려줌 for문을 통해 0~size까지 전부 확인할 필요가 있고
     if문을 통해 받아온 인자값과 elementData[i]의 값이 같으면 i 즉 배열의 인덱스 번호를 리턴하고 포문을 강제종료 시키는 메서드 이다.
    만일 해당하는 값이 없으면 -1을 출력한다.*/
     public  int indexOf(Object o){
        for(int i = 0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
     }

}
