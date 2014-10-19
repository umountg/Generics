import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/29/13
 * Time: 6:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloGeneric {
    // with generic
    List<String> l = new ArrayList<String>();
    // w/o generic
    List list = new ArrayList();
    List<? extends Thread> lll = new ArrayList<Thread>();
    //java 7
    List<String> ll = new ArrayList();


}
