# Observer

    Definir uma dependência um-para-muitos entre objetos para que quando um objeto mudar de estado,
    todos os seus dependentes sejam notificados e atualizados automaticamente.

Problema:

 - Como posso modelar uma relacionamento 1-N sem deixar todos eles acoplados?

 - Como um objeto pode notificar outros objetos quando necessário?


Solução:

 - Criar um estrutura de observer para que ele possa notificar todos os objetos que solicitaram
 ser avisados quando um determinado evento ocorra.
