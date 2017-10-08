<%-- 
    Document   : listPasien
    Created on : 08-Oct-2017, 15:48:35
    Author     : LENOVO
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Pasien</title>
    </head>
    <body>
        <table border="2" align="center">
            <thead>
                <tr align="center">
                    <td>NO</td>
                    <td>Nama</td>
                    <td>Alamat</td>
                    <td>Tanggal Lahir</td>
                    <td>Aksi</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listPasien}" var="p" varStatus="index">
                <tr align="center">
                    <td>${index.count}</td>
                    <td>${p.nama}</td>
                    <td>${p.alamat}</td>
                    <td>${p.tanggalLahir}
                    <td>
                        <a href="${pageContext.servletContext.contextPath}/pasien/delete?kodePasien=${p.id}">Hapus</a>
                        <a href="${pageContext.servletContext.contextPath}/pasien/edit?kodePasien=${p.id}">Edit</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
