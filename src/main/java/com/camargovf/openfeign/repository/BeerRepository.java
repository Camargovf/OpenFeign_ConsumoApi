package com.camargovf.openfeign.repository;

import com.camargovf.openfeign.client.BeerClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<BeerClient, String> {

}
