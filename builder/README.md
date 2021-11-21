# Builder

    Separar a construção de um objeto complexo de sua representação para que o mesmo processo de
    construção possa criar representações diferentes.

Problema:

 - Como uma classe pode criar diferentes representações de um mesmo objeto complexo?


Solução:

 - Delegar a criação do objeto para um builder ao invés de instanciar o objeto concreto diretamente;

 - Dividir a criação do objeto em partes;

 - Encapsular a criação e montagem dessas partes em um builder separado.
