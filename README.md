# Gerenciador de Contas

<h3>Descrição</h3>
O Gerenciador de Contas é uma aplicação simples desenvolvida em Java para ajudar na organização e no controle de contas financeiras. Este sistema permite ao usuário cadastrar, editar, listar e excluir contas, além de visualizar o saldo total das contas cadastradas.

<h3>Funcionalidades</h3>
<ul>
<li><strong>Cadastrar Contas</strong>: Adicione novas contas com nome, valor, categoria e data de vencimento.</li>
<li><strong>Listar Contas</strong>: Visualize todas as contas cadastradas de forma organizada.</li>
<li><strong>Editar Contas</strong>: Modifique os detalhes de contas existentes.</li>
<li><strong>Excluir Contas</strong>: Remova contas que não são mais necessárias.</li>
<li><strong>Calcular Saldo Total</strong>: Calcule o saldo total das contas cadastradas.</li>
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
