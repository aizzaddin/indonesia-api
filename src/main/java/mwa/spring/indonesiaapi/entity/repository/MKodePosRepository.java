package mwa.spring.indonesiaapi.entity.repository;

import mwa.spring.indonesiaapi.entity.MKodePos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MKodePosRepository extends JpaRepository<MKodePos, String>, JpaSpecificationExecutor<MKodePos> {
    List<MKodePos> findByKodepos(String kodepos);
}