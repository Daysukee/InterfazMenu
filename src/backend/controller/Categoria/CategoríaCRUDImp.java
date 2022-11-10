package backend.controller.Categoria;

import backend.FarmaciaDb;
import backend.model.Categoria;
import backend.model.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CategoríaCRUDImp implements CategoriaCRUD {

    @Override
    public void save(Categoria categoria) {
        try {
            Connection con = FarmaciaDb.getConnection();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO Productos(Producto_nombre,Producto_descripcion, Categoria_id) VALUES (?,?,?)");
            pstmt.setInt(1, categoria.getId());
            pstmt.setString(2, categoria.getNombre());
            pstmt.setString(3, categoria.getDesc());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Categoria categoria) {
        try {
            Connection con = FarmaciaDb.getConnection();
            PreparedStatement pstmt = con.prepareStatement("UPDATE Productos SET Producto_nombre=?, Producto_descripcion=?, Categoria_id=?");
            pstmt.setString(1,categoria.getNombre());
            pstmt.setString(2, categoria.getDesc());
            pstmt.setInt(3, categoria.getId());
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Categoria categoria) {
        try {
            Connection con = FarmaciaDb.getConnection();
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Productos WHERE Producto_id=?");
            pstmt.setInt(1, categoria.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Categoria get(int id) {

        Categoria categoria = new Categoria();
        try {
            Connection con = FarmaciaDb.getConnection();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Productos WHERE Producto_id=?");
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                categoria.setId(rs.getInt("Producto_id"));
                categoria.setNombre(rs.getString("Producto_nombre"));
                categoria.setDesc(rs.getString("Producto_descripcion"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return categoria;
    }

    @Override
    public List<Categoria> list() {
            throw new UnsupportedOperationException("Aún no es compatible.");
        }
}
