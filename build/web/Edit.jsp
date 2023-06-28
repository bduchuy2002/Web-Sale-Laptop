<%-- 
    Document   : Edit
    Created on : May 5, 2023, 8:51:00 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/edit.css"/>
        <title>Manager</title>
    </head>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Edit <b>Product</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="edit" method="post">

                            <div class="modal-body">					
                                <div class="form-group">
                                    <label>ID</label>
                                    <input value="${detail.pid}" name="pid" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Name</label>
                                    <input value="${detail.pname}" name="pname" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Image</label>
                                    <input value="${detail.pimage}" name="pimage" type="text" class="form-control" required>
                                </div>
                                
                                <div class="form-group">
                                    <label>Price</label>
                                    <input value="${detail.price}" name="price" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Price_Sale</label>
                                    <input value="${detail.price_sale}" name="price_sale" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Sale</label>
                                    <input value="${detail.sale}" name="sale"  type="text"class="form-control" required>
                                </div>
                                

                                <div class="form-group">
                                    <label>Quantity</label>
                                    <input value="${detail.quantity}" name="quantity" type="text" class="form-control"  required>
                                </div>

                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-success" value="Edit">
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
