package com.example.bookStationary.Repository;

import com.example.bookStationary.Model.Publish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishRepo extends JpaRepository<Publish,Integer> {
}
