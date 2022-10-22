package backend.model;

/**
 *
 * @author codeli4m
 */
public class Product {

    private int id;
    private String nombre;
    private float precioCompra;
    private int categoriaId;
    private int stockActual;
    private String unidadMedida;
    private String cantidadMedida;
    private boolean isActive = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getCantidadMedida() {
        return cantidadMedida;
    }

    public void setCantidadMedida(String cantidadMedida) {
        this.cantidadMedida = cantidadMedida;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public Product(int id, String nombre, float precioCompra, int categoriaId, int stockActual, String unidadMedida, String cantidadMedida) {
        this.id = id;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.categoriaId = categoriaId;
        this.stockActual = stockActual;
        this.unidadMedida = unidadMedida;
        this.cantidadMedida = cantidadMedida;
    }
    
}
