public class StaticVsInstanceMethod {
    static void staticMethod() {
        System.out.println("Static method called without object");
    }

    void instanceMethod() {
        System.out.println("Instance method called using object");
    }

    public static void main(String[] args) {
        staticMethod();

        StaticVsInstanceMethod obj = new StaticVsInstanceMethod();
        obj.instanceMethod();
    }
}
