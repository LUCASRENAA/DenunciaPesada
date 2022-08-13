import mysql.connector
import getpass



def conectarnobanco(texto,host,user,password):
    con = mysql.connector.connect(host=host,database='DenunciaPesada',user=user,password=password)
    if con.is_connected():
        db_info = con.get_server_info()
        print("Conectado ao servidor MySQL versão ",db_info)
        cursor = con.cursor()
        
        cursor.execute(texto)
        linha = cursor.fetchone()
        print("Conectado ao banco de dados ",linha)
    if con.is_connected():
        cursor.close()
        con.close()
        print("Conexão ao MySQL foi encerrada")
def criarTabelas(host,user,password):
    print("-" * 30 + "Criando banco de dados" + "-" * 30)




    print("Se conectando ao banco")
    try:
      print("Verificando os dados")
      cnx = mysql.connector.connect(host=host,user=user,password=password)

      mycursor = cnx.cursor()
      mycursor.execute("CREATE DATABASE DenunciaPesada")
      print("Banco criado com sucesso :D")
      
    except:
      print("ERRO EM CRIAR DATABASE DenunciaPesada\n verifique se existe um banco de dados chamado DenunciaPesada no seu mysql")


    textos = []
    print("-" * 30 + "Criar tabelas" + "-" *30)

    texto = """
     CREATE TABLE Professor (
    codigo VARCHAR(40),
    nome VARCHAR(40),
    curso VARCHAR(40),
    materiaLecionada VARCHAR(40),

        PRIMARY KEY (codigo)
    );
    """
    textos.append(texto)


    texto = """
     CREATE TABLE Estudante (
  matricula VARCHAR(40),
    nome VARCHAR(40),
    curso VARCHAR(40),
      anoEntrada int(40),

        PRIMARY KEY (matricula)
    );

       
    """
    textos.append(texto)
    texto = """

         CREATE TABLE Ocorrencia (
     id int NOT NULL AUTO_INCREMENT,
         data VARCHAR(40),

    local VARCHAR(40),
    descricao VARCHAR(40),
    infoAdicional VARCHAR(40),

        PRIMARY KEY (id),

        codigoProfessor VARCHAR(40),

        matriculaEstudante VARCHAR(40),

           FOREIGN KEY (matriculaEstudante) REFERENCES Estudante(matricula),
        FOREIGN KEY (codigoProfessor) REFERENCES Professor(codigo)

    );  

    """
    textos.append(texto)

    #conectarnobanco(texto,host,user,password)
    for texto in textos:
        print(texto)
        try:
            conectarnobanco(texto,host,user,password)
            print("Tabela criada com sucesso")

        except:
            #print(texto)
            print("Opa, algum erro aconteceu na criação da tabela")
            #conectarnobanco(texto,host,user,password)
	

    print("\n\n\n\n " + "-" * 30 + "CRIADO PARA O SISTEMA DO DENUNCIAPESADA						" + "-" * 30)


criarTabelas('127.0.0.1','root','')