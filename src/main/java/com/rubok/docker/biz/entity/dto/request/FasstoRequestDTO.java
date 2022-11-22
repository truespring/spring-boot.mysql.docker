package com.rubok.docker.biz.entity.dto.request;

import com.rubok.docker.biz.enums.Part;
import lombok.Getter;

@Getter
public class FasstoRequestDTO {
    private Long fasstoSeq;
    private String name;
    private Part part;
}
