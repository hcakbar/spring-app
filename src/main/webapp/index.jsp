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
<html:form action="/loan-calculation-action.do" method="post">
    <table>
        <tr>
            <td>Enter Email:</td>
            <td><html:text property="email"/></td>
            <td><html:errors property="email_e"/></td>
        </tr>
        <tr>
            <td>Enter Loan Amount:</td>
            <td><html:text property="loanAmount"/></td>
            <td><html:errors property="loan_e"/></td>
        </tr>
        <tr>
            <td>Enter Interest Rate:</td>
            <td><html:text property="loanRate"/></td>
            <td><html:errors property="rate_e"/></td>
        </tr>
        <tr>
            <td>Enter Loan Terms (years):</td>
            <td><html:text property="loanTermYear"/></td>
            <td><html:errors property="term_e"/></td>
        </tr>
        <tr>
            <td>Enter Taxes (yearly):</td>
            <td><html:text property="taxes"/></td>
        </tr>
        <tr>
            <td>Enter Insurance (yearly):</td>
            <td><html:text property="insurance"/></td>
        </tr>
        <tr>
            <td><html:submit value="Calculate"/></td>
        </tr>
    </table>
</html:form>
<div>
    <p>Monthly Payment: $<bean:write name="loanCal" property="totalMonthlyPayment" format="0000.00"/></p>
</div>
<footer>
    <p>Spring/Struts example app for mentoring program</p>
</footer>
</body>
</html>