package com.vaibhav.maximaBackendTask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaibhav.maximaBackendTask.Model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {

}
