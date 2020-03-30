package kg.megacom.auction.services.impl;


import kg.megacom.auction.database.BidRepository;
import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.model.dto.BidDto;
import kg.megacom.auction.model.entity.Bid;
import kg.megacom.auction.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {
    @Autowired
private BidRepository bidRepository;
    @Autowired
private ClassMapper classMapper;

    @Override
    public BidDto saveBid(BidDto bidDto) {
    Bid bid=classMapper.bidDtoToBid(bidDto);
     bid=bidRepository.save(bid);
     bidDto=classMapper.bidToBidDto(bid);
        return bidDto;
    }
}
