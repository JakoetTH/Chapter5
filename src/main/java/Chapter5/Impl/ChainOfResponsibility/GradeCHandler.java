package Chapter5.Impl.ChainOfResponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class GradeCHandler extends GradeHandler {
    @Override
    public String handleRequest(int request)
    {
        if(request > 65 & request < 70)
        {
            return "C";
        }
        else{
            return successor.handleRequest(request);
        }
    }
}
