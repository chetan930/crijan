package com.crijan.workspace_service.mapper;

import com.crijan.workspace_service.dto.member.MemberResponse;
import com.crijan.workspace_service.enitity.ProjectMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId",source = "id.userId")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
