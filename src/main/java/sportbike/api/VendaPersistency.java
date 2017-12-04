package sportbike.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaPersistency extends JpaRepository<Venda, Long> {
    Venda findByCodVendaEquals(Long id);
    Boolean existsByCodVenda(Long id);
}