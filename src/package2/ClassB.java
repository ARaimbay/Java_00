package package2;

public class ClassB {
    public void publicMethod() {
        System.out.println("This is a public method of ClassB.");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is the private method of ClassB");
    }

    protected void protectedMethod() {
        System.out.println("This is the protected method of ClassB");
    }

    void packageProtected() {
        System.out.println("This is package protected method of ClassB");
    }
}
