package com.oppir.test.API_test.Repositori;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oppir.test.API_test.models.Kategoridiskon;

public interface KategoriRepo extends JpaRepository<Kategoridiskon, String>{
	@Query("FROM Modulekategori modkat where modkat.groupid = :groupid ")
	public abstract List<KategoriRepo> findAllByUserGroup(@Param("groupid") int groupid); 
}
