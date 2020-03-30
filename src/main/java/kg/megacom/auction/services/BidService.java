package kg.megacom.auction.services;

import kg.megacom.auction.model.dto.BidDto;
import kg.megacom.auction.model.entity.Bid;

public interface BidService {
    BidDto saveBid(BidDto bidDto);
}
