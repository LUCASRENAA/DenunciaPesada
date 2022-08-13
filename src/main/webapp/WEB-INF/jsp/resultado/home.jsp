<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/homeStyle.css">
    <title>Jogo do bixo</title>
</head>

<body>
    <nav id="menu-horizontal">
        <ul>

            <li><a href="/home">Home</a></li>
            <li><a href="/sorteio">Sorteio</a></li>
            <li><a href="/index">Ultimos jogos</a></li>
            <li>
                <h3>JOGO DO BIXO</h3>
            </li>
        </ul>
    </nav>

    <main>
        <div id="introducao">

            <h1>JOGO DO BIXO</h1>
            <p>Simulador de sorteio de "Jogo do Bixo" feito para a disciplina de Padrões de Projetos de Software
                Orientado a Objetos no objetivo de aplicar padrões de projeto no desenvolvimento.
            </p>
        </div>
        <div id="bloco-inform">

            <div id="img-div">
                <img src="../img/tabelaJogoDoBixo2.jpg">
            </div>
            <div id="texto">

                <p>A brincadeira foi criada em 1892 pelo barão João Batista Viana Drummond, fundador do zoológico do Rio
                    de
                    Janeiro. No início, o zoológico não era muito popular, então o jogo surgiu para incentivar as
                    visitas e
                    evitar que o estabelecimento fechasse as portas.
                </p>
                <p>Funcionava assim: na compra do ingresso, os visitantes recebiam um cupom com a estampa de um entre 25
                    animais. Um dos animais era sorteado no final do dia, e quem tivesse o cupom premiado recebia até 20
                    vezes o valor que pagou pelo bilhete.</p>
                <p>
                    O “incentivo” promovido pelo zoológico deu certo, mas não da maneira que o barão imaginava. Em 1894,
                    já
                    era possível comprar vários bilhetes – motivando o surgimento do bicheiro, que os vendia pela
                    cidade.
                    Assim, o sorteio virou jogo de azar. No ano seguinte, o jogo foi proibido, mas aí já tinha virado
                    febre.
                </p>
            </div>

        </div>
    </main>

    <footer>

    </footer>
</body>

</html>



<style>

@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;800&family=Open+Sans&family=Roboto:wght@400;700&display=swap');

* {
    margin: 0 auto;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Noto Sans', 'Roboto', 'Open Sans', sans-serif;
}

#menu-horizontal ul li h3 {
    color: #FFF;
    padding: 20px;
    display: inline-block;
    letter-spacing: 3px;
    font-weight: 700;
}

#menu-horizontal ul {
    list-style: none;
    padding: 0;
    background-color: rgb(37, 37, 39);

}

#menu-horizontal ul li {

    display: inline;

}

#menu-horizontal ul li a {
    color: #FFF;
    padding: 20px;
    display: inline-block;
    text-decoration: none;
    transition: background .4s;
}

#menu-horizontal ul li a:hover {
    background-color: rgb(24, 139, 233);
    padding: 20px;
    display: inline-block;
    text-decoration: none;
}

#menu-horizontal ul li:last-child {

    float: right;
}</style>


<style>
main {

    width: 100vw;
    height: 100vh;
}

#introducao {
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    width: 97%;
    height: 400px;
    background-color: rgb(37, 37, 39);
    box-shadow: 0px 3px 10px rgb(24, 139, 233);
}

#introducao h1 {
    color: #FFF;
    letter-spacing: 4px;
    font-weight: 800;

}

#introducao p {
    color: #FFF;
}

#bloco-inform {
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: row;
    padding: 10px;
}


#bloco-inform p {
    padding: 10px;
    color: #000;
    font-weight: 700;
}


#img-div {

    width: 400px;
    height: 400px;
    margin-top: 30px;
    margin-left: 30px;
    box-shadow: 3px 3px 5px rgb(24, 139, 233);
}

#img-div img {
    width: 400px;
    height: 400px;
}</style>