package extend;

public class MainClass {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println("안녕하세요!");
        child.parentFun();
        child.childFun();
    }
}
