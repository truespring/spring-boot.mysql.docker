package com.rubok.docker.biz.entity;

import com.rubok.docker.biz.entity.dto.request.FasstoRequestDTO;
import com.rubok.docker.biz.entity.dto.response.FasstoResponseDTO;
import com.rubok.docker.biz.enums.Part;
import com.rubok.docker.common.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
@Table(name = "fassto")
public class Fassto extends BaseTimeEntity {
    @Id
    @Column(name = "fassto_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fasstoSeq;

    @Column(name = "name", length = 10, nullable = false)
    private String name;

    @Column(name = "part", length = 10, nullable = false)
    private Part part;

    @Column(name = "use_yn", nullable = false)
    private boolean useYn;

    private Fassto(String name, Part part) {
        this.name = name;
        this.part = part;
        this.useYn = true;
    }

    public static Fassto saveOf(final FasstoRequestDTO requestDTO) {
        return new Fassto(requestDTO.name(), requestDTO.part());
    }

    public void deleteOf() {
        this.useYn = false;
    }

    public void useOf() {
        this.useYn = true;
    }

    public static FasstoResponseDTO fasstoToFasstoResponseDTO(final Fassto fassto) {
        return new FasstoResponseDTO(fassto.getFasstoSeq(), fassto.getName(), fassto.getPart(), fassto.getCreatedDate(), fassto.getModifiedDate());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
