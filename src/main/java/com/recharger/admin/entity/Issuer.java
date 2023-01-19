package com.recharger.admin.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "issuer", uniqueConstraints = {@UniqueConstraint(columnNames = {"issuerName"})})
public class Issuer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long issuerId;

    @Column(name = "issuerName", nullable = false)
    private String issuerName;

    @Column(name = "issuerAddress", nullable = false)
    private String issuerAddress;
}
