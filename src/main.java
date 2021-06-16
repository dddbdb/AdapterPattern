public class main {
    public static void main(String[] args) {
        Adaptee adaptee=(Adaptee) XMLUtil.getBean();
        adaptee.method();
    }
}
