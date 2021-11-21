# Bridge

    Desacoplar uma abstração de sua implementação para que os dois possam variar independentemente.

Problema:

 - Como é possível fazer com que a abstração e a implementação possam variar independentemente?

 - Como esta implementação pode variar em tempo de execução?


Solução:

 - Definir um conjunto hierárquivo para ambos os lados: abstração e implementação;

 - Em tempo de execução, será possível escolher a classe concreta para a abstração e para a implementação
 (**compatíveis graças às interfaces**).
