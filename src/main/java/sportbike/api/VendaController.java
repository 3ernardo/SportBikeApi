package sportbike.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {

    private VendaPersistency vendaPersistency;

    @Autowired
    public VendaController(VendaPersistency vendaPersistency){
        this.vendaPersistency = vendaPersistency;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Venda> getAll() {
        return vendaPersistency.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Venda find(@PathVariable long id) {
        return vendaPersistency.findByCodVendaEquals(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Venda> create(@RequestBody Venda venda){
        vendaPersistency.save(venda);
        return vendaPersistency.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public List<Venda> delete(@PathVariable long id){
        vendaPersistency.delete(id);
        return vendaPersistency.findAll();
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Venda update(@RequestBody Venda venda, @PathVariable long id) {
        venda.setCodVenda(id);
        return vendaPersistency.save(venda);
    }
}
