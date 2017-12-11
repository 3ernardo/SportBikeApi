package sportbike.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessorioPersistency extends JpaRepository<Acessorio, Long> {
        Acessorio findByCodigoEquals(Long id);
}
