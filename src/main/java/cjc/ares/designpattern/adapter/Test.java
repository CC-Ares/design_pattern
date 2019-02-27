package cjc.ares.designpattern.adapter;

public class Test {
    public static void main(String[] args) {
        Target target = new TypeCLine();
        target.connect();
        Target targetAdapter = new ConnectAdapter();
        targetAdapter.connect();


        UsbLine usbLine = new UsbLine();
        Target instanceConnectAdapter = new InstanceConnectAdapter(usbLine);
        instanceConnectAdapter.connect();
    }


}
