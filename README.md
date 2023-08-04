# Testes na API de "Star Wars" com Rest Assured

## Sobre o projeto

Essa é uma aplicação de testes automatizados em uma API com informações sobre a saga de filmes "Star Wars". Os testes foram aplicados em alguns endpoints da API, cujos resultados são disponibilizados em relatório gerado pelo Allure. 

Além disso, foi desenvolvida uma pipeline no Github Actions para que os testes sejam executados e o relatórios sejam gerados a cada push ou pull request na branch main do repositório.

## Link da API
https://swapi.dev/

## Tecnologias utilizadas

- Rest Assured
- Allure Report
- Github Actions

## Endpoints com testes automatizados

- [GET] Listar todos os filmes (/films)
- [GET] Obter um filme específico (/films/{id})
- [GET] Listar todos os personagens (/people)
- [GET] Obter um personagem específico (/people/{id})
- [GET] Listar todas as espaçonaves (/starships)
- [GET] Obter uma espaçonave específica (/starships/{id})
- [GET] Listar todos os veículos (/vehicles)
- [GET] Obter um veículo específico (/vehicles/{id})

## Relatório gerado
![image](https://github.com/pauloliveiram/swapi-rest-assured/assets/39312072/c4cbba45-5664-4435-87c6-8ec3d8e09a0b)

## Como executar os testes

### Pré-requisitos

- Java 8+
- Maven

```bash

# Clonar repositório
git clone https://github.com/pauloliveiram/swapi-rest-assured.git

# Entrar na pasta do projeto
cd swapi-rest-assured

# Executar os testes
mvn clean test
					
# Gerar os relatórios do Allure
allure serve										
```

# Autor
Paulo Oliveira
