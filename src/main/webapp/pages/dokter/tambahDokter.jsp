<%-- 
    Document   : tambahDokter
    Created on : 08-Oct-2017, 09:29:58
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Dokter</title>
    </head>
    <body>
        <form action="${pageContext.servletContext.contextPath}/dokter/new" method="post">
            <div>
                <label for="judulBuku">Nama :</label>
                <input type="text" name="nama" id="nama">
            </div>
            <div>
                <label for="tahunTerbit">Spesialis :</label>
                <input type="text" name="spesialis" id="spesialis">
            </div>
            <div>
                <button type="submit">Kirim</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </body>
</html>
