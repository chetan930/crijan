package com.crijan.workspace_service.repository;

import com.crijan.workspace_service.enitity.ProcessedEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedEventRepository extends JpaRepository<ProcessedEvent, String> {
}
