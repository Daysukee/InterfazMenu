package backend.model;

/**
 *
 * @author codeli4m
 */
public class Producto {

    private String nombre;
    private String descripcion;
    private float precioCompra;
    private int categoriaId;
    private int stockActual;
    private String unidadMedida;
    private int cantidadMedida;
    private boolean isActive = true;

    public Producto(String nombre, String descripcion, float precioCompra, int categoriaId, int stockActual, String unidadMedida, int cantidadMedida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.categoriaId = categoriaId;
        this.stockActual = stockActual;
        this.unidadMedida = unidadMedida;
        this.cantidadMedida = cantidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getCantidadMedida() {
        return cantidadMedida;
    }

    public void setCantidadMedida(int cantidadMedida) {
        this.cantidadMedida = cantidadMedida;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
