# POO Programação Orientada a Objetos

Linguagens de:
- baixo nível: Linguagem de máquina
- alto  nível: Linguagem mais parecida com a linguagem humana

## Classes
É o contrato que deve ser seguido.

Projeto baseado em Classes arquivo.java, que apos compilado gera o arquivo.class

Classes: Estrutura para criação de objetos
identificador: A Classe deve ser bem clara a sua identificação 
caracteristicas: (states) Atributos, ou propriedades que esse objeto pode ter
comportamentos: behavior a ação que sera feita pelo método
Instanciar: new Casa(); Criar objeto a partir da estrutura já criada.

### Convenções

- model: Estruturas de domínio. Ex: Cliente, Pedido, Nota Fiscal
- sevices: Regras de negócio e validações.
- repository: integração com banco de dados
- controller: Classe que disponibiliza comunicação entre aplicação, web services ou requisições http
- util: classe que sera utilizada por todo projeto

## Pacotes (Pastas para cadatipo de arquivo)

convenção de pacotes
Comercial: com.nomeempresa
Governamental gov.nomeempresa
Codigo Aberto: org.nomeempresa

exemplo: br.com.nomeempresa
exemplo: br.com.nomeempresa.model.Usuario


## Package

Quando queremos utilizar uma class existente em outro pacote, utilizamos o package com a sintaxe abaixo.

```java
package import ... //classe existente em outro pacote

public class MinhaClasse {

}
```

## Visualização de recursos





























