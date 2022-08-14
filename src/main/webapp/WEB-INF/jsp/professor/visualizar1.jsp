<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/listaSorteioStyle.css">
    <title>Denuncia Pesada</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>

<body>
    <nav id="menu-horizontal">
        <ul>

            <li><a href="/home">Inicio</a></li>
            <li><a href="/estudantes">Estudante</a></li>
            <li><a href="/professores">Professor</a></li>
            <li>
                <h3>DenunciaPesada</h3>
            </li>
        </ul>
    </nav>

    <main>
   <table>
                       <tr>
       <th>Professor</th>    
           </tr>
           </table>
    </main>

    <footer>

    </footer>
    	<div class="container">
	
      <form method="post" action="/professor/cadastro">
  <div class="form-group">
    <label for="exampleInputEmail1">codigo</label>
    <input disabled value="${estudante.codigo}" name="codigo" type="text" class="form-control" id="codigo" aria-describedby="emailHelp" placeholder="Digite o codigo do aluno">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Nome</label>
    <input disabled value="${estudante.nome}" name="nome"type="text" class="form-control" id="nome" placeholder="Nome">
  </div>
  
  
    <div class="form-group">
    <label for="exampleInputPassword1">Curso</label>
    <input disabled value="${estudante.curso}"  name="curso"type="text" class="form-control" id="nome" placeholder="Curso">
  </div>
  
    <div class="form-group">
    <label for="exampleInputPassword1">Ano de Entrada</label>
    <input disabled value="${estudante.materiaLecionada}"  name="anoEntrada"type="text" class="form-control" id="anoEntrada" placeholder="Ano de Entrada">
  </div>
  
  
</form>
      </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
</html>

