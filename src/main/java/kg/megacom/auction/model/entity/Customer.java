package kg.megacom.auction.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private String id;
    private String phone;



}
