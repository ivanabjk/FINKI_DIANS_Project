package dians.hw.winespotter.repository;
import dians.hw.winespotter.model.Winery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WineryRepository extends JpaRepository<Winery,Long> {
    List<Winery> findByName(String name);
    Streamable<Winery> findByNameContaining(String name);
    List<Winery> findByNameContainsIgnoreCase(String name);
}
