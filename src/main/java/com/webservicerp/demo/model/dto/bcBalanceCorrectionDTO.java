package com.webservicerp.demo.model.dto;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class bcBalanceCorrectionDTO {
    private Integer BPRRN;
    private Double amount;
    private String usersId;
}
