package org.example;

import java.util.Date;

public class ClienteBuilder {

    private Cliente cliente;

     public ClienteBuilder(){
         cliente = new Cliente();
     }

    public Cliente build() {
        if (cliente.getId() == 0) {
            throw new IllegalArgumentException("id inválida");
        }
        if (cliente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return cliente;
    }

    public ClienteBuilder setId(int id) {
        cliente.setId(id);
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder setCpf(int cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setDataNascimento(Date dataNascimento) {
        cliente.setDataNascimento(dataNascimento);
        return this;
    }

}
