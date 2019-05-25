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
    <input name="email" type="text" placeholder="ex. abc@abc.com" property="email_e">

    <label>Enter Loan Amount:</label>
    <input name="loanAmount" type="text" placeholder="ex. 100000" property="loan_e">

    <label>Enter Interest Rate:</label>
    <input name="loanRate" type="text" placeholder="ex. 3.5" property="rate_e">

    <label>Enter Loan Terms (year):</label>
    <input name="loanTermYear" type="text" placeholder="ex. 20" property="term_e">

    <label>Enter Taxes (yearly):</label>
    <input name="taxes" type="text" placeholder="ex. 4000">

    <label>Enter Insurance (yearly):</label>
    <input name="insurance" type="text" placeholder="ex. 2000">

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