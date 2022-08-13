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
    <link rel="stylesheet" href="../css/listaSorteioStyle.css">
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
      
        <h1>RESULTADO</h1>
        <div id="numeros-sorteio">
            <h1><a href="/resultado/${resultados}">${resultados}</a></h1>
        </div>

    </main>

    <footer>

    </footer>
</body>

</html>


<style>

main {
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    width: 100vw;
    height: 100vh;

}

main table,
td,
th {

    border: 1px solid #000;
    border-collapse: collapse;
    font-weight: 700;
}

main table {

    box-shadow: 3px 3px 4px rgb(24, 139, 233);
}

main td,
th {
    padding: 5px 10px;
}

main th {
    background-color: rgb(37, 37, 39);
    color: #FFF;
}

main td {
    letter-spacing: 3px;
}

main table tr:nth-child(odd) {
    background-color: #ddd;
}

main table tr:nth-child(even) {
    background-color: #FFF;
}</style>

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
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    width: 100vw;
    height: 100vh;

}

main h1 {
    font-weight: 700;
    letter-spacing: 3px;
}

#numeros-sorteio {
    display: flex;
    align-items: center;
    justify-content: center;
    width: 800px;
    height: 100px;
    background-color: rgb(37, 37, 39);
    box-shadow: 2px 3px 4px rgb(24, 139, 233);
}

#numeros-sorteio h1 {

    color: #FFF;
    letter-spacing: 6px;
    font-weight: 700;
}</style>