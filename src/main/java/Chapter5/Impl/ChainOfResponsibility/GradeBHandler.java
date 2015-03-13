package Chapter5.Impl.ChainOfResponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class GradeBHandler extends GradeHandler{
    @Override
    public String handleRequest(int request)
    {
        if(request > 70 & request < 75)
        {
            return "B";
        }
        else{
            successor = new GradeCHandler();
            return successor.handleRequest(request);
        }
    }
}

