package backend;

import java.util.Random;

import backend.model.Producto;
import backend.controller.ProductoCRUDImp;

public class Test{
    public static void main(String[] args) {
        ProductoCRUDImp dao = new ProductoCRUDImp();        
        
        Producto prod = new Producto();
        Random rand = new Random();
        int rand_int = rand.nextInt(9000);
        String randomNombre = "Prueba"+rand_int;
        prod.setNombre(randomNombre);        
        prod.setDescripcion("Probando producto");
        prod.setPrecioCompra(99);
        prod.setCategoriaId(100);
        prod.setStockActual(66);
        prod.setUnidadMedida("unidades");
        prod.setCantidadMedida(4);
        
        // dao significa Data Access Object
//        dao.save(prod);
        
        // UPDATE
        Producto prod2 = new Producto();
        prod2.setId(1006);
        prod2.setNombre("PruebaCustomName");        
        prod2.setDescripcion("Probando producto");
        prod2.setPrecioCompra(99);
        prod2.setCategoriaId(100);
        prod2.setStockActual(66);
        prod2.setUnidadMedida("unidades");
        prod2.setCantidadMedida(4);         
        
//        dao.update(prod2);
    }
}