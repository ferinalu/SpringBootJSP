
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Region List</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>
      <h1>Region List</h1>
        <table border="2">
            <tr>
                <th>
                    Region ID
                </th>
                <th>
                    Region Name
                </th>
            </tr>
            <c:forEach var="region" items="${regions}">
            <tr>
                <td>
                    <c:out value="${region.getRegionId()}"></c:out>
                </td>
                <td>
                    <c:out value="${region.getRegionName()}"></c:out>
                </td>
            </tr>
            </c:forEach>
        </table>
   </body>
   
</html>