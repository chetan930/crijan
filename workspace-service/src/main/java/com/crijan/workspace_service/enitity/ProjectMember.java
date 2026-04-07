package com.crijan.workspace_service.enitity;

import com.crijan.common_library.enums.ProjectRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)  //to make field private without explicitly setting each field as private
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="project_members")
public class ProjectMember {

    @EmbeddedId
    ProjectMemberId id;

    @ManyToOne
    @MapsId("projectId")
    Project project;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
