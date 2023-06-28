<%-- 
    Document   : comment
    Created on : Jun 5, 2023, 5:24:49 PM
    Author     : Dell
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <div class="comment-session">
        <div class="comment-box">
            <form action="addCommentControl" method="post">
                <div class="user">
                <div class="image">
                    <img src="https://cdn-icons-png.flaticon.com/512/21/21104.png" alt="">

                </div>
                <input name="username" type="text">
            </div>
            
                <textarea name="comment" id="" cols="30" rows="10" placeholder="Your comment"></textarea>
<!--                <button class="submit">Comment</button>-->
                <input type="submit" class="submit" value="Comment">
            
            </form>
            
        </div>
        <div class="post-comment">
            <c:forEach items="${listC}" var="o">
                <div class="list">
                <div class="user">
                    <div class="user-img">
                        <img src="https://cdn-icons-png.flaticon.com/512/21/21104.png" alt="">
                    </div>
                    <div class="user-meta">
                        <div class="name">${o.username} </div>
                        
                    </div>
                </div>
                <div class="content-comment">${o.content}</div>
            </div>
                
            </c:forEach>
            
            
        </div>
        
    </body>
</html>
