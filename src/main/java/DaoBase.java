import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/29/13
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DaoBase {
    List<T> loadAll();
    void save();
    void delete(T t);
    void update(T t);
    T getByPK(long pk);

}
