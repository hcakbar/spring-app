<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--<%@taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>--%>
<html>
<head>
    <title>Spring App</title>
    <link rel="stylesheet" type="text/css" href="main.css">
</head>

<body>
<h1>Loan Calculation</h1>
<form class="calculate-form" action="/loan-calculation-action.do" method="post">
    <label>Enter Email:</label>
    <input name="email" type="text" placeholder="ex. abc@abc.com">

    <label>Enter Loan Amount:</label>
    <input name="loanAmount" type="text" placeholder="ex. 100000">

    <label>Enter Interest Rate:</label>
    <input name="loanRate" type="text" placeholder="ex. 0.05">

    <label>Enter Loan Terms (months):</label>
    <input name="loanTermMonth" type="text" placeholder="ex. 180">

    <label>Enter Taxes:</label>
    <input name="taxes" type="text" placeholder="ex. 300">

    <label>Enter Insurance:</label>
    <input name="insurance" type="text" placeholder="ex. 50">

    <button name="totalMonthlyPayment" type="submit">Calculate</button>

</form>
<div>
    <p>Total Monthly Payment: <bean:write name="loanCal" property="totalMonthlyPayment" format="0000.00"/></p>
</div>
<footer>
    <p>Spring/Struts example app for mentoring program</p>
</footer>
</body>
</html>