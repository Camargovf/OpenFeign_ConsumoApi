<img src="https://1.bp.blogspot.com/-7PAIFZ86bWo/Xr5VEz7Hg2I/AAAAAAAAA_I/hPsrPoOcbW4xWU9kIzUC1nruEccfJGqdgCPcBGAYYCw/s1600/download.png" width="950px" alt="openfeign" class="center">


<h1 align="center">🎯 Sobre a API</h1>

Consumo de API Externa utilizando OpenFeign. 
Api pública: https://api.punkapi.com/v2/beers

<h1 align="center">📦 Desenvolvimento</h1>

Realizado com framework SpringBoot em Java 11, gestor de dependência com Maven - uso de DevTools para agilidade durante a produção de desenvolvimento. Hibernate e JPA para persistir os dados no banco de dados MySQL, Lombok para perfomance e diminuir boiler plate code. 

<h1 align="center"> 💻 Requisitos de inicialização do projeto</h1>

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento.

Consulte *Implantação* para saber como implantar o projeto.


### Iniciando com OpenFeign

```

@SpringBootApplication
@EnableFeignClients
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@FeignClient("name")
	static interface NameService {
		@RequestMapping("/")
		public String getName();
	}
}

```

### 📋 Pré-requisitos

De que coisas você precisa para instalar o software e como instalá-lo?

- [Maven](http://maven.apache.org)
- [JDK](https://www.oracle.com/java/technologies/downloads/)

<h3>Unix</h3>

`
sudo apt install openjdk-11-jre-headless
`

 <h1 align="center">📍 Rodando a aplicação</h1>

```
bash

 Clone este repositório
$ git clone https://github.com/Camargovf/Software-ViaCep

 Acesse a pasta do projeto no terminal/cmd
$ cd README-nomeprojeto

 Vá para a pasta nomeprojeto
$ cd project-nomeprojeto

 Instale as dependências
$ mvn install
$ mvn clean package

 Execute a aplicação em modo de desenvolvimento
$ javac -nomedoprojeto.jar

 O servidor iniciará na porta:8080 - acesse http://localhost:8080 \
 
```


<div align="center">
<img src="https://i.postimg.cc/FsCyWP5n/Captura-de-Tela-2022-05-12-s-21-51-20.png" width="700px" />
</div>

<h1 align="center">✔️ Vericando projeto ON</h1>

A tela da sua aplicação deve estar:

<div align="center">
<img src="https://i.postimg.cc/vHxppdnp/Captura-de-Tela-2022-05-12-s-13-21-30.png" width="680px" />
</div>

<h1 align="center">🛠️ Construído com as tecnologias  </h1>


* [Springboot](https://spring.io/projects/spring-boot)
* [OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* [Maven](http://maven.apache.org)
* [Lombok](https://projectlombok.org/download)
* [DevTools](https://www.quickdev.org/?gclid=Cj0KCQjwsdiTBhD5ARIsAIpW8CLGWx99TFjAY-Xgu5fSe-Kno98jVPCa0ZxdyOvnbCZT3bDrFZgbxF0aAs3sEALw_wcB)

<h1 align="center">💪 Como contribuir com o projeto </h1>

1. Faça um *fork* do projeto.
3. Crie uma nova branch com as suas alterações: `git checkout -b nomedoarquivo`
4. Salve as alterações e crie uma mensagem de commit contando o que você fez: `git commit -m "atualização"`
5. Envie as suas alterações: `git push origin nomedoarquivo`


 <h1 align="center">✒️  Desenvolvedor </h1>

| [<img src="https://avatars.githubusercontent.com/u/59845047?v=4" width=115><br><sub>Valdeir Camargo</sub>](https://github.com/Camargovf)
| :---: | 

