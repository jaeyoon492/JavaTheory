package HonGongJa.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board1> list = new Vector<>();
        List<Board1> list2 = new ArrayList<>();
        ArrayList<Board1>list3 = new ArrayList<>();

        list.add(new Board1("제목1", "내용1", "글쓴이1"));  //0
        list.add(new Board1("제목2", "내용2", "글쓴이2"));  //1
        list.add(new Board1("제목3", "내용3", "글쓴이3"));  //2
        list.add(new Board1("제목4", "내용4", "글쓴이4"));  //3
        list.add(new Board1("제목5", "내용5", "글쓴이5"));  //4

        list2.add(new Board1("제1","내1","글1"));
        list2.add(new Board1("제2","내2","글2"));
        list2.add(new Board1("제3","내3","글3"));

        list2.add(new Board1("제4","내4","글4"));
        list2.add(new Board1("제5","내5","글5"));


        list.remove(2);
        list.remove(3);

        list2.remove(1);
        list2.remove(2);

        for (int i = 0; i < list.size(); i++) {
            Board1 board = list.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }

        for (int i = 0; i < list2.size(); i++) {
            Board1 board = list2.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }
    }
}