package model;

public record Endereco(String cep,
                       String logradouro,
                       String complemento,
                       String uf,
                       String localidade) {
    //essa classe realiza o de-para do json recebido no response
}
