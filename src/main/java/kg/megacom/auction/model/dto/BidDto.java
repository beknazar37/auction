package kg.megacom.auction.model.dto;

import kg.megacom.auction.model.entity.Customer;
import kg.megacom.auction.model.entity.Lot;
import lombok.Data;

import java.util.Date;

@Data
public class BidDto {
    private Long id;
    private Date addDate;
    private double bidValue;
    private boolean active;
    private Lot lot;

    private Customer customer;
}
