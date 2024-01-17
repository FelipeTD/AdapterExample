# AdapterExample
Projeto de exemplo de trabalho com Adapter

## Adapter
- Faz parte do GoF
- Padrão de Projeto Estrutural

### Motivação do pattern Adapter
- Converte a interface de uma classe em outra que é esperada pelo cliente
- Permitir que classes que não possuem uma interface comum trabalhem de forma conjunta
- Deixar a possibilidade de futuras implementações para o cliente provendo uma interface pública para seus adaptadores

### Conceitos básicos
- Client -> Cliente que utiliza o serviço
- Target -> Resultado que queremos conseguir
- Adapter -> Classe que faz a adaptação 
- Adaptee -> Classe que será adaptada

### Exemplo
- Client  
  - Target <interface> (insert, update, delete) 
    - MySQLAdapter (insert, update, delete)
      - MySQLCommands(insertMySQL, updateMySQL, deleteMySQL)
