package com.crijan.workspace_service.service;

import com.crijan.workspace_service.dto.project.DeployResponse;

public interface DeploymentService {

    DeployResponse deploy(Long projectId);
}
