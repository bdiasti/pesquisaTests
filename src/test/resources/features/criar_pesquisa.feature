#language: pt

Funcionalidade: Criar pesquisa
	Como um usuario, 
	eu quero criar pesquisas 
	para as pessoas votarem e saber o resultado facilmente
	
	
Cenário: Deve criar uma pesquisa sem erros
	Quando Colocar o titulo do pesquisa
	E colocar perguntas
	E enviar a pergunta
  Então a pesquisa deve ser criada
	
