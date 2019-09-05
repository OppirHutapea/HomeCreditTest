package com.oppir.test.API_test.Repositori;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oppir.test.API_test.models.Modulekategori;

public interface ModuleRepo extends JpaRepository<Modulekategori, String>{
	@Query("FROM Modulekategori modkat where modkat.groupid = :groupid ")
	public abstract List<Modulekategori> findAllByUserGroup(@Param("groupid") int groupid); 
}
