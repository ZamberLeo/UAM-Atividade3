# Estrutura de Dados - Atividade 1 - Universidade Anhembi Morumbi
## Enunciado
Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 
 
O programa desenvolvido pelo aluno e a sua justificativa deverá ser postado em um ambiente virtual. Esse programa será avaliado pelo tutor responsável pela disciplina. 
## Resposta

As estruturas de dados solicitadas na declaração possuem o seguinte conceito de ordenação:
A lista é ordenada, portanto, usa um loop para iterar sobre os itens preservando a ordem em que você adiciona os itens.
As pilhas têm um conceito LIFO (Last In First Out), portanto, a iteração segue esse conceito.
Já a fila usa o conceito FIFO (First In First Out). Isso também é levado em consideração ao iterar sobre essa estrutura final.
Portanto, em nossa ordem, primeiro percorremos a lista e, em seguida, colocamos os elementos dessa lista na pilha em ordem. Isso esvazia a lista, coloca-os em uma fila e esvazia a pilha.
A impressão que se obtém será: A ordem da lista será:
1 2 3 4 5
Ou seja, a ordem de posicionamento do anúncio foi preservada e colocada primeiro. 
A impressão seguinte fica: 
5 4 3 2 1 
Isso ocorre porque o que foi colocado por último foi colocado em primeiro lugar. Ou seja, a ordem é inversa. Então ele entrou na fila de cabeça para baixo. No entanto, as dicas seguem a ordem de inserção, portanto, quando impressas, seguem a ordem de entrada. Isso também se parece com isso: 
5 4 3 2 1 
Após o ponto solicitado de imprimir a fila. Pede-se para repetir a operação de inserção com a lista agora vazia e os números da fila de 6 a 10. Novamente, isso lhe dá uma impressão inicial da lista com base no exposto acima. 
6 7 8 9 10 
e por consequência na pilha
10 9 8 7 6 
Assim termina-se com essa expressão para a fila resultante, que é de 10 elementos na seguinte ordem: 
5 4 3 2 1 10 9 8 7 6 
Isso ocorre porque primeiro os números de 1 a 5 foram enfileirados na ordem em que foram retirados da pilha e, em seguida, os números de 6 a 10 foram enfileirados na ordem em que foram retirados da pilha. Depois que os números foram invertidos novamente de 6 para 10, eles foram inseridos após o último elemento da primeira inserção, o número 1. 
Abaixo está uma tela de impressão do console onde você pode ver o acima. A partir das impressões do tamanho da estrutura, podemos ver que o tamanho máximo da lista e da pilha é de 5 células e o tamanho máximo da pilha é de 10 células. As filas são sempre respeitadas:

## Código

[Main.Java](https://github.com/ZamberLeo/UAM-Atividade3/blob/2854eed3293caeefbb658b2ec017ae30f6f1dcba/mAIN.JAVA)
