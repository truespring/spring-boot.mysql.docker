package com.rubok.docker.biz.entity.dto.request;

import com.rubok.docker.biz.enums.Part;

public record FasstoRequestDTO(
        String name,
        Part part
) {
}
