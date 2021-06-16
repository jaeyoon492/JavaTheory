package javatutorials.accessmodifier.outter;

import javatutorials.accessmodifier.inner.*;

public class ClassAccessModifierOuterPackage {
    PublicClass publicClass = new PublicClass();
    //DefaultClass defaultClass = new DefaultClass();
    //다른 패키지에 있는 Default 클래스는 사용할수 없다.
}
