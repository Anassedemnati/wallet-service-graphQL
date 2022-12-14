package org.sid.waleetservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Currency {
    @Id
    private String code;
    private String name;
    private String symbol;
    private Double salePrice;
    private Double purchasePrice;

}
