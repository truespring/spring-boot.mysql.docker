package com.rubok.docker.biz.service.impl;

import com.rubok.docker.biz.entity.Fassto;
import com.rubok.docker.biz.entity.dto.request.FasstoRequestDTO;
import com.rubok.docker.biz.entity.dto.response.FasstoResponseDTO;
import com.rubok.docker.biz.repository.FasstoRepository;
import com.rubok.docker.biz.service.FasstoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FasstoServiceImpl implements FasstoService {

    private final FasstoRepository fasstoRepository;
    @Override
    public List<FasstoResponseDTO> findFasstosByUseYnTrue() {
        List<Fassto> fasstos = fasstoRepository.findFasstosByUseYnTrue();
        return fasstos.parallelStream().map(Fassto::fasstoToFasstoResponseDTO).toList();
    }

    @Override
    @Transactional
    public FasstoResponseDTO saveNewFassto(final FasstoRequestDTO requestDTO) {
        Fassto fassto = Fassto.saveOf(requestDTO);
        return Fassto.fasstoToFasstoResponseDTO(fasstoRepository.save(fassto));
    }

    @Override
    @Transactional
    public FasstoResponseDTO deleteOfFassto(final Long fasstoSeq) {
        Fassto fassto = fasstoRepository.findByFasstoSeq(fasstoSeq);
        fassto.deleteOf();
        return Fassto.fasstoToFasstoResponseDTO(fassto);
    }

    @Override
    @Transactional
    public FasstoResponseDTO useOfFassto(final Long fasstoSeq) {
        Fassto fassto = fasstoRepository.findByFasstoSeq(fasstoSeq);
        fassto.useOf();
        return Fassto.fasstoToFasstoResponseDTO(fassto);
    }
}
