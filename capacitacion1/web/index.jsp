<%-- 
    Document   : index
    Created on : 17-12-2020, 12:06:37
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


        <title>Login!</title>
    </head>
    <body>
        
        <div class="col-md-5 mx-auto mt-5 ml-3">
            <div class="card">   
                <h5 class="card-header">Login</h5>
                <div class="card-body formulary">
                    <form action="Validar" method="POST" class="was-validated mt-5" name="frmLogin" id="frmLogin">
                        <div class="mb-6">
                            <label for="txtRut">Rut</label>
                            <div class="input-group is-invalid">
                                <input type="text" class="form-control is-invalid" aria-describedby="validatedInputGroupPrepend" 
                                       id="txtRut" name="txtRut"required>
                            </div>
                            <div id="rut" class="form-text">Debes ingresar los 8 primeros digitos de tu rut</div>
                        </div>
                        <div class="mb-2">
                            <label for="txtpass">Password</label>
                            <div class="input-group is-invalid">
                                <input type="password" class="form-control is-invalid" aria-describedby="validatedInputGroupPrepend" id="txtPass" name="txtPass"required>
                            </div>
                        </div>
                        <small type="hidden" class="badge badge-pill badge-danger mt-3"><%= request.getAttribute("res")%></small><br>
                        <div class="checkbox mb-1">
                            <label>
                                <input type="checkbox" value="remember-me"> Remember me
                            </label>
                        </div>
                        <a href="registro" class="mt-3">Resgistrarse</a> <br>

                        <button type="submit" value="Ingresar" name="btnIngresar" id="btnIngresar" class="btn btn-primary mt-3">Ingresar</button>

                    </form>
                </div>
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
