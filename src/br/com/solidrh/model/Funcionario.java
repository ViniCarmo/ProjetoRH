package br.com.solidrh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate DataUltimoReajuste;

                public String getNome() {
                    return nome;
                }

                public void setNome(String nome) {
                    this.nome = nome;
                }

                public String getCpf() {
                    return cpf;
                }

                public void setCpf(String cpf) {
                    this.cpf = cpf;
                }

                public Cargo getCargo() {
                    return cargo;
                }

                public void setCargo(Cargo cargo) {
                    this.cargo = cargo;
                }

                public BigDecimal getSalario() {
                    return salario;
                }

                public void setSalario(BigDecimal salario) {
                    this.salario = salario;
                }

                public LocalDate getDataUltimoReajuste() {
                    return DataUltimoReajuste;
                }

                public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
                    DataUltimoReajuste = dataUltimoReajuste;
                }

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario ) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
        public void atualizarSalario(BigDecimal novoSalario){
        this.salario = novoSalario;
        this.DataUltimoReajuste = LocalDate.now();
        }

    public void promover(Cargo novoCargo) {
    }
}


