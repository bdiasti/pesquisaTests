$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("criar_pesquisa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Criar pesquisa",
  "description": "Como um usuario, \neu quero criar pesquisas \npara as pessoas votarem e saber o resultado facilmente",
  "id": "criar-pesquisa",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Deve criar uma pesquisa sem erros",
  "description": "",
  "id": "criar-pesquisa;deve-criar-uma-pesquisa-sem-erros",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 10,
  "name": "Colocar o titulo do pesquisa",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "colocar perguntas",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "enviar a pergunta",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "a pesquisa deve ser criada",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisaSteps.colocarOTituloDoPesquisa()"
});
formatter.result({
  "duration": 11991802300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.colocarPerguntas()"
});
formatter.result({
  "duration": 314545000,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.enviarAPergunta()"
});
formatter.result({
  "duration": 5062845200,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.aPesquisaDeveSerCriada()"
});
formatter.result({
  "duration": 39660500,
  "status": "passed"
});
formatter.after({
  "duration": 353346200,
  "status": "passed"
});
formatter.after({
  "duration": 704156500,
  "status": "passed"
});
});