package entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/incidentes")
public class ControladorIncidente {

    private List<Incidente> incidentes = new ArrayList<>();

    @GetMapping
    public List<Incidente> getAllIncidents() {
        return incidentes;
    }

    @GetMapping("/{id}")
    public Incidente getIncidente(@PathVariable int id) {
        return incidentes.stream()
                .filter(incidente -> incidente.getId_incident() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Incidente CriarIncidente(@RequestBody Incidente incidente) {
        incidentes.add(incidente);
        return incidente;
    }

    @PutMapping("/{id}")
    public Incidente updateIncidente(@PathVariable int id, @RequestBody Incidente updatedIncident) {
        Incidente incident = incidentes.stream()
        		.filter(incidente -> incidente.getId_incident() == id)
                .findFirst()
                .orElse(null);

        if (incident != null) {
            incident.setName(updatedIncident.getName());
            incident.setDescription_incident(updatedIncident.getDescription_incident());
        }

        return incident;
    }

    @DeleteMapping("/{id}")
    public void deletaIncident(@PathVariable int id) {
        incidentes.removeIf(incident -> incident.getId_incident() == id);
    }
}