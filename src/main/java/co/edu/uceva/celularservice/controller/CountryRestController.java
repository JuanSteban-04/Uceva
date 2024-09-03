package co.edu.uceva.celularservice.controller;

import co.edu.uceva.celularservice.model.entities.Celular;
import co.edu.uceva.celularservice.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase es el controlador de la entidad Celular y se mapea con la URL /api/v1/celular-service.
 * Se encarga de exponer los servicios REST de la entidad Celular para realizar las operaciones CRUD.
 * También recibe las peticiones HTTP y retorna las respuestas HTTP.
 */
@RestController
@RequestMapping("/api/v1/celular-service")
public class CountryRestController {

    @Autowired
    private CelularServiceImpl celularService; // Inyecto el servicio de la entidad Celular para realizar las operaciones CRUD

    /**
     * Este método se encarga de retornar una lista de todos los modelos de celulares.
     * @return Retorna una lista de todos los modelos de celulares.
     */
    @GetMapping("/celulares")
    public List<Celular> listar() {
        return this.celularService.listar();
    }

    /**
     * Este método se encarga de retornar un celular por su ID y se mapea con la URL /api/v1/celular-service/celulares/{id}.
     * @param id es el ID del celular a buscar.
     * @return Retorna un celular por su ID.
     */
    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    /**
     * Este método guarda un celular y me retorna el objeto de tipo Celular ya guardado con su ID asignado.
     * @param celular es el objeto de tipo Celular a guardar (sin el ID).
     * @return Retorna el objeto de tipo Celular guardado con su ID asignado.
     */
    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este método actualiza un celular y me retorna el objeto de tipo Celular ya actualizado.
     * @param celular es el objeto de tipo Celular a actualizar (con el ID).
     * @return Retorna el objeto de tipo Celular actualizado.
     */
    @PutMapping("/celular")
    public Celular actualizarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este método elimina un celular por su ID.
     * @param id es el ID del celular a eliminar.
     */
    @DeleteMapping("/celulares/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id); // Encuentro un celular por su ID
        this.celularService.delete(celular);
    }

}
