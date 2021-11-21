# Monostate

    Garantir que uma classe só tenha uma única instância e prover um ponto de acesso global a ela.

O padrão Monostate difere do Singleton, por impor um comportamento singular, sem impor restrições à estrutura.

 - Monostate força um comportamento(**apenas um valor ao longo de todas as instâncias de classe**)

 - Singleton força uma restrição estrutural (**apenas uma instância**)

Problemas:

 - Como posso garantir que uma classe tenha apenas **uma instância**?
 
 - Como fazer com que esta instância única possa ser **acessível globalmente**?
