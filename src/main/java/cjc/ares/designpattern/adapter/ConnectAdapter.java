package cjc.ares.designpattern.adapter;

/**
 * 类适配器
 */
public class ConnectAdapter extends UsbLine implements Target{
    @Override
    public void connect() {
        super.connect();
    }
}
