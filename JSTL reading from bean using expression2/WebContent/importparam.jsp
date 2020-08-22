<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/include/header.jsp">
<c:param name="title" value="New title goes here"></c:param>
</c:import>

Main content goes here
<br>
<a href="<c:url value="/foreach.jsp"/>">Foreach page</a>
<br>
<%-- <c:redirect url="/foreach.jsp" /> --%>
<c:catch>
used to catch exception in page
</c:catch>
<c:import url="/include/footer.jsp"></c:import>