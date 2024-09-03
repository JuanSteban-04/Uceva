package co.edu.uceva.celularservice.model.service;

import co.edu.uceva.celularservice.model.dao.CelularDao;
import co.edu.uceva.celularservice.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase implementa los métodos de la interfaz ICelularService y se encarga de realizar
 * las operaciones CRUD de la entidad Celular.
 */
@Service
public class CelularServiceImpl implements ICelularService {

    @Autowired
    CelularDao celularDao;

    /**
     * Este método se encarga de listar los celulares.
     *
     * @return Retorna una lista de celulares.
     */
    @Override
    public List<Celular> listar() {
        return (List<Celular>) celularDao.findAll();
    }

    /**
     * Este método se encarga de eliminar un celular.
     *
     * @param celular Celular a eliminar.
     */
    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    /**
     * Este método se encarga de guardar un celular.
     *
     * @param celular Celular a guardar.
     * @return Retorna el objeto celular guardado, incluyendo el ID.
     */
    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    /**
     * Este método se encarga de buscar un celular por su ID.
     *
     * @param id ID del celular a buscar.
     * @return Retorna un celular por su ID.
     */
    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    /**
     * Este método se encarga de actualizar un celular.
     *
     * @param celular Celular a actualizar.
     * @return Retorna el objeto celular actualizado.
     */
    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }
}