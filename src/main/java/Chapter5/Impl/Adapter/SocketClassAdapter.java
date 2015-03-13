package Chapter5.Impl.Adapter;

/**
 * Created by student on 2015/03/13.
 */
public class SocketClassAdapter extends Socket implements SocketAdapter {
    @Override
    public Voltage get240Volt() {
        return getVoltage();
    }
    @Override
    public Voltage get12Volt() {
        Voltage v = getVoltage();
        return convertVolt(v, 10);
    }
    @Override
    public Voltage get3Volt() {
        Voltage v = getVoltage();
        return convertVolt(v, 40);
    }
    private Voltage convertVolt(Voltage v, int i) {
        return new Voltage(v.getVolts()/i);
    }

}
