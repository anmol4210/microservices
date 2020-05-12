package com.nagp.user.repostories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nagp.user.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>  {
	
	@Query("from User where id = :userId")
	public User search(@Param("userId") int userId);

}
