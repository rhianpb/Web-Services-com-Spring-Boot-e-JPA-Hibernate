package com.java.coursejava.repositories;

import com.java.coursejava.entities.Order;
import com.java.coursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
