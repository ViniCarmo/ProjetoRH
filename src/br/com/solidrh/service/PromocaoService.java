package br.com.solidrh.service;

import br.com.solidrh.exception.ValidacaoException;
import br.com.solidrh.model.Cargo;
import br.com.solidrh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE ==  cargoAtual){
            throw new ValidacaoException("Gerentes nao podem ser promovidos");

        }if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else {
            throw new ValidacaoException("O funcionario não bateu a meta");
        }
    }
}
