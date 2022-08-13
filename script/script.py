import mysql.connector
import getpass



def conectarnobanco(texto,host,user,password):
    con = mysql.connector.connect(host=host,database='jogodobicho',user=user,password=password)
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
      mycursor.execute("CREATE DATABASE jogodobicho")
      print("Banco criado com sucesso :D")
      
    except:
      print("ERRO EM CRIAR DATABASE jogodobicho\n verifique se existe um banco de dados chamado jogodobicho no seu mysql")


    textos = []
    print("-" * 30 + "Criar tabelas" + "-" *30)

    texto = """
     CREATE TABLE resultado (
     id int NOT NULL AUTO_INCREMENT,
            resultado1 int,
            resultado2 int,
            resultado3 int,
            resultado4 int,
            resultado5 int,
        PRIMARY KEY (id)
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
	

    print("\n\n\n\n " + "-" * 30 + "CRIADO PARA O SISTEMA DO JOGO DO BICHO" + "-" * 30)


criarTabelas('127.0.0.1','root','')