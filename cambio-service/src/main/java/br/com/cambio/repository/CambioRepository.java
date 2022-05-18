package br.com.cambio.repository;

import br.com.cambio.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

    Cambio findByFromAndTo(String from, String to);
}
