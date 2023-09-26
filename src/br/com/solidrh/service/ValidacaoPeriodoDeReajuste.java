package br.com.solidrh.service;

import br.com.solidrh.exception.ValidacaoException;
import br.com.solidrh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodoDeReajuste implements ValidacaoReajuste {
    //Só pode receber outro reajuste/aumento depois de 6 meses
    public void validar(Funcionario funcionario, BigDecimal aumento) {

        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesUltimoReajuste < 5) {
            throw new ValidacaoException("Não foi possivel fazer o reajuste do salario, só é possovel depois de 6 meses");
        }
    }
}

