# PCMania (Java)

Projeto simples para o exercício de POO.

## Estrutura
```
PCMania/
└── src/
    └── pcmania/
        ├── app/PCMania.java
        ├── model/{Cliente,Computador,HardwareBasico,MemoriaUSB,SistemaOperacional}.java
        └── util/ProcessarPedido.java
```

## Como usar no IntelliJ
1. Abra o IntelliJ IDEA → **Open** → selecione a pasta `PCMania`.
2. Clique com o botão direito na pasta `src` → **Mark Directory as** → **Sources Root**.
3. Abra `pcmania/app/PCMania.java` e **edite a variável `matricula`** com o seu número.
4. Execute a classe `PCMania` (ícone ▶️ ao lado do `main`).

## Observações
- Entrada do usuário apenas para escolher promoções.
- Sem uso de `ArrayList` (apenas arrays).
- Atributos `private` e construtores em todas as classes.
- `ProcessarPedido.enviarPedido(...)` é um helper estático que imprime `Pedido enviado...`.
