<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Login</title>
</head>
    <body>

        <div id="titulo">
            <h1>Login</h1>
        </div>

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 offset-sm-3 text-left">
                        <form class="form-group" method="POST" action="LoginServlet">
                            <h3>Ingresa tus datos</h3>
                            <p>
                                <label for="txtUsuario">Usuario: </label>
                                <input class="form-control" type="text" name="txtUsuario" id="txtUsuario" required>
                            </p>
                            <p>
                                <label for="txtPassword">Contrase&ntilde;a:  </label>
                                <input class="form-control" type="password" name="txtPassword" id="txtPassword" required>   
                            </p>
                            <p>
                                <input class="btn btn-success" type="submit" value="Ingresar">
                            </p>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/script.js"></script>
</body>
</html>