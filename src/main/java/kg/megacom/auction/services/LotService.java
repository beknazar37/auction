package kg.megacom.auction.services;

import kg.megacom.auction.model.dto.LotDto;

public interface LotService {
    LotDto saveLot(LotDto lotDto);
}
