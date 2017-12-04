package sportbike.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/motos")
public class MotoController {

    private MotoPersistency motoPersistency;

    @Autowired
    public MotoController(MotoPersistency motoPersistency){
        this.motoPersistency = motoPersistency;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Moto> getAll() {
        return motoPersistency.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Moto find(@PathVariable long id) {
        return motoPersistency.findByCodigoEquals(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Moto> create(@RequestBody Moto moto){
        motoPersistency.save(moto);
        return motoPersistency.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public List<Moto> delete(@PathVariable long id){
        motoPersistency.delete(id);
        return motoPersistency.findAll();
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Moto update(@RequestBody Moto moto, @PathVariable long id) {
        moto.setCodigo(id);
        return motoPersistency.save(moto);
    }

//        if (motoPersistency.existsByCodigo(id)){
//            moto.setCodigo(id);
//            return motoPersistency.save(moto);
//        } else {
//            return null;
//        }
//    }

}
