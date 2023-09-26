package br.com.solidrh.service;

import br.com.solidrh.exception.ValidacaoException;
import br.com.solidrh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{
    //receber reajuste e so pode receber no maximo 40%
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();

        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0,4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario");
        }
    }
}

