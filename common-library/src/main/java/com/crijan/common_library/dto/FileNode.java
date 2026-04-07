package com.crijan.common_library.dto;


public record FileNode(
        String path
) {

    @Override
    public String toString() {
        return path;
    }
}