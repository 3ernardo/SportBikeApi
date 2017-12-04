package sportbike.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoPersistency extends JpaRepository<Moto, Long>{
    Moto findByCodigoEquals(Long id);
    Boolean existsByCodigo(Long id);
}