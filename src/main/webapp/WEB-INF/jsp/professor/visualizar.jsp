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
    <title>Denuncia Pesada</title>
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
    <a href="professor/cadastrar">Cadastrar</a>
    
       <table>
                       <tr>
       <th>Professores</th>    
           </tr>
           </table>
      
          <c:forEach items="${professores}" var="item">
          <style>P.blocktext {
    margin-left: auto;
    margin-right: auto;
    width: 6em
}</style>
          
         <P class="blocktext"><h1></h1>.</P>
            <table>
                  
            
            <tr>
                <th>Matricula</th>
                <th>Nome </th>
                                <th>Curso </th>
                                <th>Disciplina </th>
                                                <th>Editar </th>
                                                <th>Excluir </th>
                
            </tr>
            
			<tr>
							
		
				<td><a href="/professor/ver/${item.codigo}">${item.codigo}</a></td>
				
				
				
							
		
				<td>${item.nome}</td>
				
				
							
		
				<td>${item.curso}</td>
				
				
							
		
				<td>${item.materiaLecionada}</td>
								<td><a href="/professor/editar/${item.codigo}">${item.codigo}</a></td>
								<td><a href="/professor/excluir/${item.codigo}">${item.codigo}</a></td>
				
				</tr>
				
					
				
		        </table>
		        	
		<p></p>
		</c:forEach>
    </main>

    <footer>

    </footer>
</body>

</html>

