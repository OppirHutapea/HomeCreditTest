package com.oppir.test.API_test.Repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oppir.test.API_test.models.Kontak;

@Repository
public interface KontakRepo extends JpaRepository<Kontak, Long> {

}
