package com.crijan.workspace_service.mapper;

import com.crijan.common_library.dto.FileNode;
import com.crijan.workspace_service.enitity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
