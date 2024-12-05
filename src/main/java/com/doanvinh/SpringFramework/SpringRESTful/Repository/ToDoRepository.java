package com.doanvinh.SpringFramework.SpringRESTful.Repository;

import com.doanvinh.SpringFramework.SpringRESTful.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<Todo, Long> {
}
