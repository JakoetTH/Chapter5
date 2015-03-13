package Chapter5.Impl.Adapter;


public class Socket {
    public Voltage getVoltage()
    {
        return new Voltage(240);
    }
}
