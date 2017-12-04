package sportbike.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBaseStarter implements CommandLineRunner{
    private MotoPersistency motoPersistency;
    private VendaPersistency vendaPersistency;

    @Autowired
    public DataBaseStarter (MotoPersistency motoPersistency,VendaPersistency vendaPersistency){
        this.motoPersistency = motoPersistency;
        this.vendaPersistency = vendaPersistency;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Moto> motos = new ArrayList<>();

        motos.add(new Moto("Brutalle", "Ducatti", 900, 35000));
        motos.add(new Moto("CBR600F", "Honda", 600, 29000));
        motos.add(new Moto("Biz", "Honda", 50, 1500));
        motos.add(new Moto("Comet", "Dafra", 500, 18000));
        motos.add(new Moto("Ninja", "Kawasaki", 350, 21000));
        motos.add(new Moto("Tenere", "Yamaha", 800, 24000));

        motoPersistency.save(motos);


        List<Venda> vendas = new ArrayList<>();

        vendas.add(new Venda((long) 10, "Paulo Souza", "11122233344", "3344-5566"));

        vendaPersistency.save(vendas);
    }
}