package com.rubok.docker.biz.service;

import com.rubok.docker.biz.entity.dto.request.FasstoRequestDTO;
import com.rubok.docker.biz.entity.dto.response.FasstoResponseDTO;

import java.util.List;

public interface FasstoService {
    List<FasstoResponseDTO> findFasstosByUseYnTrue();
    FasstoResponseDTO saveNewFassto(final FasstoRequestDTO requestDTO);
    FasstoResponseDTO deleteOfFassto(final Long fasstoSeq);

}
