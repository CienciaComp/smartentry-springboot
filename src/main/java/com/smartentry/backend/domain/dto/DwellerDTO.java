package com.smartentry.backend.domain.dto;

import com.smartentry.backend.domain.Correspondence;
import com.smartentry.backend.domain.Dweller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DwellerDTO {

    private Integer id;

    private String nome;

    private String cpf;

    private String rg;

    private Integer status;

    private Integer residence;

    private Integer contactDweller;

    private Integer car;

    public DwellerDTO(Dweller dweller) {
        id = dweller.getId();
        nome = dweller.getNome();
        cpf = (dweller.getCpf());
        rg = dweller.getRg();
        status = dweller.getStatus();
        residence = dweller.getResidence().getId();
        contactDweller = dweller.getContactDweller().getId();
        car = dweller.getCar().getId();
    }
}
