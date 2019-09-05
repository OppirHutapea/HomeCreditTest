package com.oppir.test.API_test.Repositori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oppir.test.API_test.models.Historitransaksi;

public interface HistoriTransaksiRepo extends JpaRepository<Historitransaksi, String> {

}
