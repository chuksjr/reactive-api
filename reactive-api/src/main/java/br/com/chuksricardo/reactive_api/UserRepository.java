package br.com.chuksricardo.reactive_api;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Long>{
  
}
