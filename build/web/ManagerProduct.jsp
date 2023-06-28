<%-- 
    Document   : ManagerProduct
    Created on : Dec 28, 2020, 5:19:02 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Manager Product</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="" style="float: left;">
                            <h2>Manage <b>Product</b></h2>
                        </div>
                        <div >
                            <a href="#add" class="btn btn-success" data-toggle="modal"
                               style="float: right;"><i class="material-icons">&#xE147;</i>
                                <button id="btn-success" style="background-color:#5cb85c ; border: none;cursor: pointer;">
                                    <span>Add New Product</span>

                                </button>
                            </a>

                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th style="width: 10%">ID</th>
                            <th style="width: 15%">Name</th>
                            <th style="width: 20%">Image</th>
                            <th style="width: 10%">Price</th>
                            <th style="width: 10%">Price_Sale</th>
                            <th style="width: 10%">Sale</th>
                            <th style="width: 5%">Quantity</th>
                            <th style="width: 10%">Actions</th>
                        </tr>
                    </thead>
                    <tbody>                 
                        <c:forEach items="${listP}" var="o">
                            <tr>
                                <td>${o.pid}</td>
                                <td>${o.pname}</td>
                                <td>
                                    <img src="${o.pimage}" >
                                </td>
                                <td>${o.price} đ</td> 
                                <td>${o.price_sale} đ</td>
                                <td>${o.sale} %</td>
                                <td>${o.quantity} </td>
                                <td>
                                    <a href="loadProduct?pid=${o.pid}" class="edit" data-toggle="modal"><i
                                            class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                    <a href="delete?pid=${o.pid}" class="delete" data-toggle="modal"><i
                                            class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>


        </div>
        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal">
            <div class="modal-content" id="modal-content" style="top:5px;">
                <form action="add" method="post">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Product</h4>
                        <button type="button" id="btn-close" data-dismiss="modal" aria-hidden="true"
                                style="cursor: pointer;">&times;</button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label>ID</label>
                            <input name="pid" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Name</label>
                            <input name="pname" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Image</label>
                            <input name="pimage" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Price</label>
                            <input name="price" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Price_Sale</label>
                            <input name="price_sale" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Sale</label>
                            <input name="sale" type="text" class="form-control" required>
                        </div>


                        <div class="form-group">
                            <label>Quantity</label>
                            <input name="quantity" class="form-control" required>
                        </div>

                        <div class="form-group">
                            <label>Category</label>
                            <select name="category" class="form-select" aria-label="Default select example">
                                <c:forEach items="${listC}" var="o">
                                    <option value="${o.cid}">${o.cname}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>

        </div>
        <a href="pageServlet"><button type="button" class="btn btn-primary">Back to home</button>
            <script src="manager.js" type="text/javascript"></script>
    </body>
</html> 