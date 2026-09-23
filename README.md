# 🪐 Sistema Solar — POO em Java

Aplicação de console em Java que apresenta informações sobre planetas, estrelas e satélites, construída para exercitar **herança, polimorfismo, classes abstratas e interfaces** sobre uma arquitetura MVC.

### 👉 [Abrir o projeto e a documentação completa](./Projeto%20Maven/)

O código-fonte, o diagrama de classes, a demonstração e as instruções de execução estão na pasta **[`Projeto Maven`](./Projeto%20Maven/)**.

```
├── Projeto Maven/
│   ├── README.md     ← documentação completa
│   ├── pom.xml
│   └── src/main/java/com/example/
│       ├── view/            (Main)
│       ├── controller/      (Controller)
│       ├── service/         (Services)
│       ├── interfaces/      (Rotacao, Translacao, SuperficeRochosa, SuperficeGasosa)
│       └── model/           (Planeta, Estrela, Satelite e suas subclasses)
```

## Execução rápida

Requer **JDK 17+**.

```bash
cd "Projeto Maven"
mvn compile
mvn exec:java -Dexec.mainClass="com.example.view.Main"
```

---

**Luana Rodrigues Chaves** · [github.com/luanarchaves](https://github.com/luanarchaves)
