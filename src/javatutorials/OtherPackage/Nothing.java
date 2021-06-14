package javatutorials.OtherPackage;

public class Nothing {
    private void _private(){
        System.out.println("private");
    }

    void _default(){
        System.out.println("default");
    }

    protected void _protected(){
        System.out.println("protected");
    }

    public void _public(){
        System.out.println("public");
    }
}

class OtherPackageChecker extends Other{
    public OtherPackageChecker(){
        Nothing nothing = new Nothing();
        nothing._public();
//        nothing._protected();
//        nothing._default();
//        nothing._private();
    }
}
