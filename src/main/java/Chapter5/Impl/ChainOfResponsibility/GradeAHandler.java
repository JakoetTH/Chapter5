package Chapter5.Impl.ChainOfResponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class GradeAHandler extends GradeHandler {
    @Override
    public String handleRequest(int request)
    {
        if(request > 75)
        {
            return "A";
        }
        else{
            successor = new GradeBHandler();
            return successor.handleRequest(request);
        }
    }
}
