<%-- 
    Document   : listDokter
    Created on : 08-Oct-2017, 09:07:33
    Author     : LENOVO
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Dokter</title>
    </head>
    <body>
        <table border="2" align="center">
            <thead>
                <tr align="center">
                    <td>NO</td>
                    <td>Nama</td>
                    <td>Spesialis</td>
                    <td>Aksi</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listDokter}" var="d" varStatus="index">
                <tr align="center">
                    <td>${index.count}</td>
                    <td>${d.nama}</td>
                    <td>${d.spesialis}</td>
                    <td>
                        
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
