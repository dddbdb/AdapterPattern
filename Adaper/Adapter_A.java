public class Adapter_A extends Target_A implements Adaptee{
    @Override
    public void method() {
        System.out.print("适配器A使用了");
        super.targetmethod();
    }

}
