<%-- 
    Document   : editDokter
    Created on : 08-Oct-2017, 11:40:37
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Dokter</title>
    </head>
    <body>
        <form action="${pageContext.servletContext.contextPath}/dokter/edit" method="post">
            <input type="hidden" name="idDokter" value="${dokter.id}">
            <div>
                <label for="nama">Nama :</label>
                <input type="text" name="nama" id="nama" value="${dokter.nama}">
            </div>
            <div>
                <label for="spesialis">Spesialis :</label>
                <input type="text" name="spesialis" id="spesialis" value="${dokter.spesialis}">
            </div>
            <div>
                <button type="submit">Kirim</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </body>
</html>
