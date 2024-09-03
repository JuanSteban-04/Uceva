package co.edu.uceva.celularservice.model.dao;

import co.edu.uceva.celularservice.model.entities.Celular;
import org.springframework.data.repository.CrudRepository;

// DAO: Data Access Object: Manejar las operaciones CRUD de la entidad

/**
 * Esta interfaz hereda de CrudRepository y se encarga de realizar las operaciones CRUD de la entidad Celular.
 */
public interface CelularDao extends CrudRepository<Celular, Long> {
}
