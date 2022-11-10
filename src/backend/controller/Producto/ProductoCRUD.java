package backend.controller.Producto;
import backend.model.Producto;
import java.util.List;
/**
 *
 * @author codeli4m
 */

public interface ProductoCRUD {
    public void save(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
    public Producto get(int id);
    public List<Producto> list();
}
