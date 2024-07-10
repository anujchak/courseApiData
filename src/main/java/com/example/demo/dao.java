package com.example.demo;

import java.lang.annotation.Native;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
@Repository
public interface dao extends CrudRepository<topic,String>{
	@Query(value = "select * from topic where duration= :n",nativeQuery = true)
	Optional<topic> getdu(@Param("n") String duration);

	

}
