package backend.controller.Categoria;

import backend.model.Categoria;

import java.util.List;

public interface CategoriaCRUD {
    public void save(Categoria categoria);
    public void update(Categoria categoria);
    public void delete(Categoria categoria);
    public Categoria get(int id);
    public List<Categoria> list();
}
