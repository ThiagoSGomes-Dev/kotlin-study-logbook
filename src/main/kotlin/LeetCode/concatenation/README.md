# Revisão (v1.0.0)

- Aprender muito bem sobre guardar posições no array.
````kotlin
var idx = 0
````
- Entender muito bem como funciona um array ou listas

 Nesse caso não é só, saber que um array é uma coleção de elementos ou itens, mas ir além disso.
Entender bem como acessar os elementos de um array usando posições.

````kotlin
nums.size // Temos o comprimento do nosso array
````
**Aqui temos a último valor valido do nosso array**

````kotlin
nums.size - 1 
````

**Formas de retorno para nosso array**

Abaixo, temos um array com um tamanho (size) de 4 índice (index)

````kotlin
val array1 = intArrayOf(2, 3, 5, 6) // size = 4
val array2 = intArrayOf(1, 2, 3, 4) // size = 4
````
Podemos acessa-ló:

````kotlin
array.size // Retrona quantos elementos existem
array.indices // Retorna 0..3 todos os índices válidos
array // Retorna o valor real de cada elemento
````

Se fizer isso para retornar o array em um print, o que você vai ver é apenas o valor na memória

````kotlin
array // Retorna o valor real de cada elemento
````

Para ver o valor real use:

````kotlin
println(array.contentToString())
````

Para representação em string do conteúdo.

[Doc Kt - Arrays](https://kotlinlang.org/docs/arrays.html#access-and-modify-elements)
[Doc Kt - Palavras-chave modificadoras](https://kotlinlang.org/docs/keyword-reference.html#modifier-keywords)
