package backend.controller;
// import producto model
import backend.model.Producto;
// import database config
import backend.FarmaciaDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
        
import java.util.List;
/**
 *
 * @author codeli4m
 */

public class ProductoCRUDImp implements ProductoCRUD {
    
    @Override
    public void save(Producto producto){
        try {
            Connection con = FarmaciaDb.getConnection();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Producto_stock_actual, Producto_unidad_medida, Producto_cantidad_unidades) VALUES (?,?,?,?,?,?,?)");
            pstmt.setString(1, producto.getNombre());
            pstmt.setString(2, producto.getDescripcion());
            pstmt.setFloat(3, producto.getPrecioCompra());
            pstmt.setInt(4, producto.getCategoriaId());
            pstmt.setInt(5, producto.getStockActual());
            pstmt.setString(6, producto.getUnidadMedida());
            pstmt.setInt(7, producto.getCantidadMedida());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void update(Producto producto){
        try {
            Connection con = FarmaciaDb.getConnection();        
        PreparedStatement pstmt = con.prepareStatement("UPDATE Productos SET Producto_nombre=?, Producto_descripcion=?,  Producto_precio_compra=?, Categoria_id=?, Producto_stock_actual=?, Producto_unidad_medida=?, Producto_cantidad_unidades=? WHERE Producto_id = ?");
            pstmt.setString(1,producto.getNombre());       
            pstmt.setString(2, producto.getDescripcion());
            pstmt.setFloat(3, producto.getPrecioCompra());
            pstmt.setInt(4, producto.getCategoriaId());
            pstmt.setInt(5, producto.getStockActual());
            pstmt.setString(6, producto.getUnidadMedida());
            pstmt.setInt(7, producto.getCantidadMedida());
            pstmt.setInt(8, producto.getId());
            pstmt.executeUpdate();
            
            } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    @Override
    public void delete(Producto producto){
        try {
            Connection con = FarmaciaDb.getConnection();
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Productos WHERE Producto_id=?");
            pstmt.setInt(1, producto.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

    @Override
    public Producto get(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Producto> list() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
