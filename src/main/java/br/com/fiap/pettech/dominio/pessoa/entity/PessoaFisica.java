package br.com.fiap.pettech.dominio.pessoa.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private final Collection<PessoaFisica> dependentes = new Vector<>();

    public PessoaFisica() {
    }

    public PessoaFisica(Long id, String nome, LocalDate nascimento, String cpf) {
        super(id, nome, nascimento);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public PessoaFisica setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Collection<PessoaFisica> getDependentes() {
        return Collections.unmodifiableCollection(dependentes);
    }

    public PessoaFisica adicionarDependente(PessoaFisica pessoaFisica) {
        dependentes.add(pessoaFisica);
        return this;
    }

    public PessoaFisica removerDependente(PessoaFisica pessoaFisica) {
        dependentes.remove(pessoaFisica);
        return this;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
