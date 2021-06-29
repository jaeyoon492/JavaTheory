package javatutorials.Inheritance;

public interface Fightable {
    void move(int x , int y);
    void attack();
}

 abstract class Fighter implements Fightable{
    public void move(int x, int y){
        System.out.println("움직인다!");
    }
}