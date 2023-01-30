# Exercicio 1 REST

## GET - Listar as pessoas

**Para listar todas as pessoas**

- localhost:8080/pessoas/findAll

**Para retornar uma pessoa pelo ID**

- localhost:8080/pessoas/{id} 

{id} -> inserir o id desejado

## POST - Inserir as pessoas

- localhost:8080/pessoas/save

Seguir esse padrão de body


{
  "nome": "Nome da pessoa",<br>
  "cpf": "000.000.000-00",<br>
  "rg": "0000000000",<br>
  "dataNascimento": "dd/mm/aaaa",<br>
  "estadoCivil": "Estado civil da pessoa",<br>
  "telefone": "Telefone da pessoa",<br>
  "email": "email@exemplo.com"<br>

}

## PUT - Editar as informações de uma pessoa

- localhost:8080/pessoas/update/{id}

{id} -> inserir o id desejado

Seguir esse padrão de body


{
  "nome": "Nome da pessoa",<br>
  "cpf": "000.000.000-00",<br>
  "rg": "0000000000",<br>
  "dataNascimento": "dd/mm/aaaa",<br>
  "estadoCivil": "Estado civil da pessoa",<br>
  "telefone": "Telefone da pessoa",<br>
  "email": "email@exemplo.com"<br>

}

## DELETE - Remover uma pessoa

- localhost:8080/pessoas/delete/{id}

{id} -> inserir o id desejado


