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
    private AcessorioPersistency acessorioPersistency;

    @Autowired
    public DataBaseStarter (MotoPersistency motoPersistency, VendaPersistency vendaPersistency, AcessorioPersistency acessorioPersistency){
        this.motoPersistency = motoPersistency;
        this.vendaPersistency = vendaPersistency;
        this.acessorioPersistency=acessorioPersistency;
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

        /*
        List<Venda> vendas = new ArrayList<>();

        vendas.add(new Venda("{\"codigo\": 10, \"modelo\": \"Brutalle\", \"marca\": \"Ducatti\", \"cilindradas\": 900, \"preco\": 35000}", "Paulo Souza", "11122233344", "3344-5566"));
        vendas.add(new Venda((long) 15, "Jairo Silva", "77744499900", "3311-7766"));
        vendas.add(new Venda((long) 13, "Diogo Braga", "88822233311", "3300-5544"));
        vendas.add(new Venda((long) 12, "Luiza Costa", "55544488877", "3388-1188"));

        vendaPersistency.save(vendas);
        */
    }
}
