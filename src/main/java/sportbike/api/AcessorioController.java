package sportbike.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/acessorios")
public class AcessorioController {

    private AcessorioPersistency acessorioPersistency;

    @Autowired
    public AcessorioController(AcessorioPersistency acessorioPersistency){
        this.acessorioPersistency = acessorioPersistency;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Acessorio> getAll() {
        return acessorioPersistency.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Acessorio find(@PathVariable long id) {
        return acessorioPersistency.findByCodigoEquals(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Acessorio> create(@RequestBody Acessorio acessorio){
        acessorioPersistency.save(acessorio);
        return acessorioPersistency.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public List<Acessorio> delete(@PathVariable long id){
        acessorioPersistency.delete(id);
        return acessorioPersistency.findAll();
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Acessorio update(@RequestBody Acessorio acessorio, @PathVariable long id) {
        acessorio.setCodigo(id);
        return acessorioPersistency.save(acessorio);
    }

}
