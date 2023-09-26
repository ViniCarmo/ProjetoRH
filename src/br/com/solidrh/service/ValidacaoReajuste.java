package br.com.solidrh.service;

import br.com.solidrh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
     void validar(Funcionario funcionario, BigDecimal aumento);
}
