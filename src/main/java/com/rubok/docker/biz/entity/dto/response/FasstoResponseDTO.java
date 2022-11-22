package com.rubok.docker.biz.entity.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rubok.docker.biz.enums.Part;

public record FasstoResponseDTO(
        @JsonProperty("fassto_seq") Long fasstoSeq,
        @JsonProperty("name") String name,
        @JsonProperty("part") Part part
) {
    public FasstoResponseDTO(@JsonProperty("fassto_seq") Long fasstoSeq, @JsonProperty("name") String name, @JsonProperty("part") Part part) {
        this.fasstoSeq = fasstoSeq;
        this.name = name;
        this.part = part;
    }
}
