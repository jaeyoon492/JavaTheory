package javatutorials.finals;

class A {
    final void b (){

    }
}

class B extends A{
//    void b(){ "'b()'은(는) 'javatutorials.finals.A'에서 'b()'을(를) 재정의할 수 없습니다. 재정의된 메서드는 final입니다" }
}