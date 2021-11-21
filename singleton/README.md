# Singleton

    Garantir que uma classe só tenha uma única instância e prover um ponto de acesso global a ela.

***Obs: estado global mutável.***

Problemas:

 - Como posso garantir que uma classe tenha apenas **uma instância**?
 
 - Como fazer com que esta instância única possa ser **acessível globalmente**?


Solução:

 - Esconder o construtor da classe;

 - Definir um ponto de criação estático (**getInstance**) que retorne esta instância única.
