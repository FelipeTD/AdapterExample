# Projeto de exemplo para utilização de Adapter

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
    - connections.MySQLAdapter (insert, update, delete)
      - connections.MySQLCommands(insertMySQL, updateMySQL, deleteMySQL)

### Referências e links utilizados:
- Textos do README.md foram retirados do vídeo: 
  - Design Pattern Adapter na Prática 
    - Disponível em https://www.youtube.com/watch?v=5AiiHFizQWY&list=PL5aY_NrL1rjtP1GVk1lxifkeob1F09L4p&index=3

- Exemplo de Código que está em connections também foi retirado do vídeo
- 


