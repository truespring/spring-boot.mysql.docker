package com.rubok.docker.biz.controller;

import com.rubok.docker.biz.entity.dto.request.FasstoRequestDTO;
import com.rubok.docker.biz.entity.dto.response.FasstoResponseDTO;
import com.rubok.docker.biz.service.FasstoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FasstoController {

    private final FasstoService fasstoService;

    @GetMapping("/fasstos")
    public List<FasstoResponseDTO> findAllFassto() {
        return fasstoService.findFasstosByUseYnTrue();
    }

    @PostMapping("/fasstos")
    public FasstoResponseDTO saveNewFassto(@RequestBody final FasstoRequestDTO requestDTO) {
        return fasstoService.saveNewFassto(requestDTO);
    }

    @DeleteMapping("/fasstos")
    public FasstoResponseDTO softDeleteFassto(@RequestParam final Long fasstoSeq) {
        return fasstoService.deleteOfFassto(fasstoSeq);
    }

    @PatchMapping("/fasstos")
    public FasstoResponseDTO softUseFassto(@RequestParam final Long fasstoSeq) {
        return fasstoService.useOfFassto(fasstoSeq);
    }
}
