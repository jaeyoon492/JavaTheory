package javatutorials.Polymorphism.example6;

public class IfElse {
   public void ifelse(){
       InputValue inputValue = new InputValue();
       int input = inputValue.setValue();
       Fruit fruit;
       if (input == 1){
           fruit = new Peach();
           fruit.show();
       }else {
           fruit = new Banana();
           fruit.show();
       }
   }
}
