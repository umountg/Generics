import org.h2.engine.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/29/13
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaoBaseImpl<T> implements DaoBase {

    @Autowired
    SessionFactory sf;

    private Class<T> entityClass;



}
