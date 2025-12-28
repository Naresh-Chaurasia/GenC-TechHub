package com.tutorials.repository;

import com.tutorials.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Spring Data JPA repository for User entity with Long as ID type
// Provides CRUD operations (Create, Read, Update, Delete) and pagination/sorting out of the box
public interface UserRepository extends JpaRepository<User, Long> {

    // save(S entity)
    // saveAll(Iterable<S> entities)
    // findById(ID id)
    // existsById(ID id)
    // findAll()
    // findAllById(Iterable<ID> ids)
    // count()
    // deleteById(ID id)
    // delete(T entity)
    // deleteAllById(Iterable<? extends ID> ids)
    // deleteAll(Iterable<? extends T> entities)
    // deleteAll()
    // findAll(Sort sort)
    // findAll(Pageable pageable)
}