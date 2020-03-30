package kg.megacom.auction.database;

import kg.megacom.auction.model.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid,Long> {

}
