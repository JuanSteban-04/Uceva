package co.edu.uceva.celularservice.model.service;

import co.edu.uceva.celularservice.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar();
    void delete(Celular celular); // Elimina un celular de la base de datos
    Celular save(Celular celular); // Guarda un celular y me retorna un objeto de tipo Celular
    Celular findById(Long id); // Busca un celular por su id y me retorna un objeto de tipo Celular
    Celular update(Celular celular); // Actualiza un celular y me retorna un objeto de tipo Celular
}
