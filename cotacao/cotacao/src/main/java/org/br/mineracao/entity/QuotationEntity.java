package org.br.mineracao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "quotation")
public class QuotationEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Data data;

    @Column(name = "currency_price")
    private BigDecimal currencyPrice;

    @Column(name = "pct_change")
    private String pctChange;

    private String pair;
}
