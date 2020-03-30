package kg.megacom.auction.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "statues")
public class Status {
    @Id
    @GeneratedValue
    @Column(name = "status_id")
    private Long id;
    private String name;
}
