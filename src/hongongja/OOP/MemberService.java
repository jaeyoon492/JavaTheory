package hongongja.OOP;

public class MemberService {
    boolean logIn(String id, String password){
        if (id.equals("hong") && password.equals("12345")){
            return true;
        }else{
            return false;
        }
    }

   void logOut(String id){
        if (id.equals("hong")){
            System.out.println("로그아웃 되었습니다.");
        }
   }
}
