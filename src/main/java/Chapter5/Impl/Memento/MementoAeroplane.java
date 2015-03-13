package Chapter5.Impl.Memento;

/**
 * Created by student on 2015/03/13.
 */
public class MementoAeroplane {
    private static MementoAeroplane aeroplane = null;
    private static MementoAeroplane savedaeroplane = null;
    private String model = "Boeing-474";
    private MementoAeroplane()
    {

    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel()
    {
        return this.model;
    }
    public static MementoAeroplane getInstance()
    {
        if(aeroplane==null)
            aeroplane = new MementoAeroplane();
        return aeroplane;
    }
    public void saveInstance(MementoAeroplane aeroplane)
    {
        this.savedaeroplane = aeroplane;
    }
    public void restoreInstance()
    {
        if(this.savedaeroplane!=null)
            this.aeroplane = this.savedaeroplane;
    }
}
