<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>Payments</h3>

<c:forEach items="${payments}" var="payment">

    <p>
        <label>${payment.title}: </label>
        <label>${payment.sum}</label>
    </p>

</c:forEach>
