<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head><title>Account Info</title>
<link rel="stylesheet"
      href="./css/styles.css"
      type="text/css"/>
</head>
<body>
<div align="center">
<table border="5">
  <tr><th class="title">Account Info</th></tr>
</table>
<p/>
<ul>
  <li>Customer ID: ${customer.customerID}</li>
  <li>First name:  ${customer.firstName}</li>
  <li>Last name:   ${customer.lastName}</li>
  <li>Balance:     ${customer.formattedBalance}</li>
</ul>
</div></body></html>