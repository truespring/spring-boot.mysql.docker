package com.rubok.docker.biz.entity.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rubok.docker.biz.enums.Part;

import java.time.LocalDateTime;

public record FasstoResponseDTO(
        @JsonProperty("fassto_seq") Long fasstoSeq,
        @JsonProperty("name") String name,
        @JsonProperty("part") Part part,
        @JsonProperty("created_date") LocalDateTime createdDate,
        @JsonProperty("modified_date") LocalDateTime modifiedDate
        ) {
}
