<%-- 
    Document   : menu
    Created on : 17-12-2020, 12:32:32
    Author     : Jhonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="ccs/estilos.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">


        <title>Menú</title>
    </head>
    <body>
        <div class="bg-dark p-4">
            <h5 class="text-white h4">Capacitación</h5>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="navbar-collapse" id="navbarTogglerDemo02">
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?menu=programaciones&accion=listar" target="myFrame">Programaciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?menu=despachos&accion=listar" target="myFrame">Despachos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?menu=usuarios" target="myFrame">Usuarios</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?menu=sucursales&accion=listar" target="myFrame">Sucursales</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?menu=productos&accion=listar" target="myFrame">Productos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?menu=venta&accion=listar" target="myFrame">Ingresar Venta</a>
                        </li>
                    </ul>
                </div>
                <div class="btn-group" role="group">
                    <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" 
                            aria-haspopup="true" aria-expanded="false">
                        Nombre: ${personas.getNombre()}
                    </button>
                    <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">

                        <p class="dropdown-item">Position: ${usuario.getCargo()}</p>
                        <p class="dropdown-item">Rut: ${personas.getRut()}-${personas.getDv()}</p>
                        <a class="dropdown-item alert alert-danger" href="index.jsp">Exit</a>
                    </div>
                </div>
            </nav>
            <div class="m-4 iframeOp" id="iframeOp" name="iframeOp" >
                <iframe id="myFrame" name="myFrame"  ></iframe>
            </div>       
        </div>


        <script src="js/main.js" type="text/javascript"></script>
        <!-- Optional JavaScript; choose one of the two! -->

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

        <!-- Option 2: Separate Popper and Bootstrap JS -->
        <!--
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
        -->
    </body>
</html>

