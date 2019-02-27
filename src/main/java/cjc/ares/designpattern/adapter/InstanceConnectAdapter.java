package cjc.ares.designpattern.adapter;

public class InstanceConnectAdapter implements Target{

    private UsbLine usbLine;

    public InstanceConnectAdapter(UsbLine usbLine) {
        this.usbLine = usbLine;
    }

    @Override
    public void connect() {
        usbLine.connect();
    }
}
