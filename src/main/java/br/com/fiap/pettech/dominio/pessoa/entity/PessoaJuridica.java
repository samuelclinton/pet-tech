package br.com.fiap.pettech.dominio.pessoa.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private final Collection<Pessoa> socios = new Vector<>();

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long id, String nome, LocalDate nascimento, String cnpj) {
        super(id, nome, nascimento);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public Collection<Pessoa> getSocios() {
        return Collections.unmodifiableCollection(socios);
    }

    public PessoaJuridica adicionarSocio(Pessoa socio) {
        socios.add(socio);
        return this;
    }

    public PessoaJuridica removerSocio(Pessoa socio) {
        socios.remove(socio);
        return this;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", socios=" + socios +
                "} " + super.toString();
    }
}
