public class Adapter_B extends Target_B implements Adaptee{
    @Override
    public void method() {
        System.out.print("适配器B使用了");
        super.targetmethod();
    }

}
