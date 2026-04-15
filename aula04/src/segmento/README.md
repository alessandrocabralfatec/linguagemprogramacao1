
## Exercicio aula 4

Para cada uma das imagens contidas nos slides seguintes, faça o que
se pede nos itens seguintes.

- a)  Faça os diagramas UML de três classes, cujos possíveis objetos
estão exibidos nas imagens. Cada classe deve ter três atributos e
três métodos, sem contar os métodos de acesso.
- b) Implemente as classes definidas no item a em Java.
- c) Construa uma classe principal, que deve conter o método main para
instanciação de objetos e testes das classes codificadas no item b

Ali temos 3 imagens: uma farmácia, uma feira e um salão de beleza.




```mermaid
classDiagram
title Feira
    
     Barraca o-- Hortifruti : possui
     Pedido *-- PedidoItem : contém
     PedidoItem --> Hortifruti : refere
    
    class Hortifruti {
        -String nome
        -float estoque
        -String unidade
        -float preco
        
        +abastecer(float entradaKg) void
        +vender(float entradaKg) void
        +perda(float entradaKg) void
    }
    
    class Barraca {
        -String vendedor
        -String codigoLicenca
        -List~Hortifruti~ catalogo
        
        +CadastrarProduto(Hortifruti novo) void
        +ListarProdutos(String nome) List~Hortifruti~
        +Abrir() void
        +Fechar() void
    }
    
    class Pedido{
    
        -List~PedidoItem~ PedidoItem
        -float desconto
        -String nomeCliente
        
        +calcularTotal() float
        +AddItem(PedidoItem item) void
        +DelItem(PedidoItem item) void
        +FecharPedido() float
    }
    
    class PedidoItem{
        -Hortifruti item
        -float quantidade
        
        +calcularTotal() float
    }
 
  
```


```mermaid
classDiagram
title Farmacia

     Receita o-- Remedio : possui
     Receita *-- ReceitaItem : contém
     ReceitaItem --> Remedio : refere
     Receita ..> EstoqueItem : consulta
     EstoqueItem *-- Lote : pertence

    
    class Remedio {
        -String nome
        -String agenteAtivo
        -boolean exigeReceita
        -int idadeMinimaIndicada
        -String bula
        
        +buscarSimilares(List~Remedio~ lista) List~Remedio~
        +buscarSintoma(String sintoma) bool
        +verificarIdadeMinima(int idadePaciente) bool
        
    }
    class Receita {
        -String paciente
        -String medico
        -List~ReceitaItem~ lista
        
    
        +buscarEstoqueSemSimilares(List~EstoqueItem~ estoque) List~EstoqueItem~
        +buscarEstoqueComSimilares(List~EstoqueItem~ estoque) List~EstoqueItem~
        +validarPaciente(String nomeDoRG) bool
    }
    
    class ReceitaItem {
        -boolean atendido
        -Remedio remedio
        -String doseReceitada
        
        
    }
    
    class EstoqueItem{
        -Remedio remedio
        -float quantidade
        -Lote lote

        +abastecer(float quantidade) void
        +vender(float quantidade) void
        +perda(float quantidade) void
    }
    
    class Lote {
        -String codigo    
        -Datetime validade
        -Datetime fabricacao
        
        
    }
   
```


```mermaid
classDiagram
title Salao

    Servico o-- Insumo : utiliza
    Cadeira o-- Servico : permite
        
    class Servico {
        -String nome
        -List~Insumo~ insumos
        -float horasExecucao
        -float margemLucro
        
        +calcularPrecoCusto()float
        +calcularPrecoVenda() float
        +verificarSeTemInsumosParaAtender() bool
        
    }
    
    class Insumo {
        -String nome 
        -String quantidade
        -Datetime validade
        -float preco
        
        +deveComprarMais() boolean
        +usar(float quantidade) void
        +abastecer(float quantidade)
    }
    
    class Cadeira {
        -long codigo
        -boolean ocupada
        -List<Servico> servicosAcessiveis
        
        +ocupar() void
        +desocupar() void
        +verificarSeAtende(Servico servico) boolean
        
    }  
    
   
```