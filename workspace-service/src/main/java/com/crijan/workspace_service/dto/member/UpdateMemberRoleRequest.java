package com.crijan.workspace_service.dto.member;

import com.crijan.common_library.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
