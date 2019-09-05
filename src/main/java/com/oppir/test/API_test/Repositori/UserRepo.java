package com.oppir.test.API_test.Repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import com.oppir.test.API_test.models.User;

public interface UserRepo extends JpaRepository<User, String> {
	@Query("SELECT user.groupid from User user.userid = :usergroupid")
	public int findGroupingIdBasedIdUser(@Param("usergroupid") String usergroupid);
	
}
