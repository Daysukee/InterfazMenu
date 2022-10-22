package backend;

import backend.model.Producto;
import backend.controller.ProductoCRUDImp;

public class Test{
    public static void main(String[] args) {
        Producto prod = new Producto();
        prod.setNombre("Prueba");        
        prod.setDescripcion("Probando producto");
        prod.setPrecioCompra(99);
        prod.setCategoriaId(100);
        prod.setStockActual(66);
        prod.setUnidadMedida("unidades");
        prod.setCantidadMedida(4);
        
        // dao significa Data Access Object
        ProductoCRUDImp dao = new ProductoCRUDImp();
        dao.save(prod);
        
    }
}