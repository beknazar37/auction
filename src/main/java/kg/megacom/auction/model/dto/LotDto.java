package kg.megacom.auction.model.dto;

import kg.megacom.auction.model.entity.Status;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class LotDto {
    private Long id;
    private double minPrice;
    private double maxPrice;
    private double step;
    private Date startDate;
    private Date endDate;
    private Status status;

}
