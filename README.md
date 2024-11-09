# Controle de inventário

<h3>Descrição</h3>
Este projeto tem como objetivo desenvolver um sistema de controle de inventário para gerenciar produtos em estoque. O sistema permite a adição, remoção, consulta e cálculo do valor total dos produtos no estoque. Através de uma interface simples no terminal, o usuário pode interagir com os produtos, suas categorias e obter informações detalhadas sobre o inventário.

<h3>Funcionalidades</h3>
<ul>
<li><strong>Adicionar Produto</strong>: Adiciona um novo produto ao inventário.</li>
<li><strong>Remover Produto</strong>: Remove um produto do inventário usando o ID.</li>
<li><strong>Listar Produtos</strong>: Exibe todos os produtos registrados no inventário.</li>
<li><strong>Buscar Produto</strong>: Permite buscar um produto específico pelo ID.</li>
<li><strong>Calcular Valor Total</strong>: Calcula o valor total do estoque com base no preço e quantidade dos produtos.</li>
</ul>

<h3>UML do projeto</h3>

<pre>
+--------------------------------+
|           Inventario           |
+--------------------------------+
| - produtos: List<Produto>      |
+--------------------------------+
| - reescreveId(): int           |
| + adicionarProduto(produto: Produto): void |
| + removerProduto(produtoId: int): void     |
| + listarProdutos(): void       |
| + buscarProduto(produtoId: int): Produto   |
| + calcularValorTotal(): double |
+--------------------------------+

                    |
                    |
                    |
                    ▼

+--------------------------------+
|            Produto             |
+--------------------------------+
| - id: int                      |
| - nome: String                 |
| - preco: double                |
| - quantidade: int              |
+--------------------------------+
| + getId(): int                 |
| + getNome(): String            |
| + getPreco(): double           |
| + getQuantidade(): int         |
| + setId(id: int): void         |
| + setQuantidade(quantidade: int): void |
| + calcularValorTotal(): double |
+--------------------------------+

                    |
                    |
                    |
                    ▼

+--------------------------------+
|           Categoria            |
+--------------------------------+
| - nome: String                 |
| - descricao: String            |
+--------------------------------+
| + getNome(): String            |
| + getDescricao(): String       |
| + setDescricao(descricao: String): void |
+--------------------------------+
</pre>
