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
    
    	
    		  
    		
    		  
    		    <script>
  
  function mudarSelect(valor){
	  window.location.href = "http://127.0.0.1:8080/ocorrencia/filtro3/" + valor;


	}
  
  
  function mudarSelect2(valor){
	  window.location.href = "http://127.0.0.1:8080/ocorrencia/filtro2/" + valor;

	}
  </script>
  
    <a href="/ocorrencia/cadastro">Cadastrar ocorrencia</a>
    
        <p></p>
      Filtro de estudante
      
      	<select class="form-control"  onchange="mudarSelect(this.value)" id="teste3">
  
    <c:forEach items="${estudantes}" var="item">
        <option value="${item.matricula}">${item.nome}</option>
    
    		</c:forEach>
    		  </select>
    <p></p>
      Filtro de professor
    		    <select class="form-control"onchange="mudarSelect2(this.value)" id="teste4">
  
    <c:forEach items="${professores}"  var="item">
        <option   value="${item.codigo}">${item.nome}</option>
    
    
    		</c:forEach>
    		  </select>
   <table>
                       <tr>
       <th>Ocorrências</th>    
           </tr>
           </table>
      
          <c:forEach items="${ocorrencias}" var="item">
          <style>P.blocktext {
    margin-left: auto;
    margin-right: auto;
    width: 6em
}</style>
          
         <P class="blocktext"><h1></h1>.</P>
            <table>
                  
            
            <tr>
                            <th>ID</th>
            
                <th>Data</th>
                <th>Local </th>
                                <th>Descrição </th>
                                <th>Informação adicional </th>
                                                                <th>Estudante </th>
                                                                <th>Professor </th>
                                
                                                <th>Editar </th>
                                                <th>Excluir </th>
                
            </tr>
            
			<tr>
							
		
				
				
				
							
		
				<td>${item.id}</td>
				
								<td>${item.data}</td>
				
											<td>${item.local}</td>
											<td>${item.descricao}</td>
											<td>${item.infoAdicional}</td>
											
											<td><a href="/estudante/ver/${item.estudante.matricula}">${item.estudante.nome}</a></td>
											<td><a href="/professor/ver/${item.professor.codigo}">${item.professor.nome}</a></td>
							
	
								<td><a href="/professor/editar/${item.id}">${item.id}</a></td>
								<td><a href="/ocorrencia/excluir/${item.id}">${item.id}</a></td>
				
				</tr>
				
					
				
		        </table>
		        	
		<p></p>
		</c:forEach>
    </main>

    <footer>

    </footer>
</body>

</html>

