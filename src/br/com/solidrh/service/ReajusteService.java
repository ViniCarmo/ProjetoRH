package br.com.solidrh.service;

import br.com.solidrh.model.Funcionario;

import java.math.BigDecimal;

import java.util.List;

public class ReajusteService {
    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    //receber reajuste e so pode receber no maximo 40%
    public void reajusteSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
       this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
