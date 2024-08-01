package com.kang.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kang.practice.entity.Crud;

public interface CrudRepository extends JpaRepository<Crud, Long> {

}
