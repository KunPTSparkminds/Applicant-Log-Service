package net.sparkminds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sparkminds.entity.LoggerInfo;

public interface LoggerRepository extends JpaRepository<LoggerInfo, Long>{

}
