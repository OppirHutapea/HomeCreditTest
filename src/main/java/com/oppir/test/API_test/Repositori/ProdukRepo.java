package com.oppir.test.API_test.Repositori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oppir.test.API_test.models.Produk;

public interface ProdukRepo extends JpaRepository<Produk, String> {

}
