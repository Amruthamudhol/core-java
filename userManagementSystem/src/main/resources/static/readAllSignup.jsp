<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

    <title>All Signup Details</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #e0f2fe, #f3e8ff);
            min-height: 100vh;
        }

        .page-title {
            color: #4f46e5;
            font-weight: bold;
        }

        .card {
            border: none;
            border-radius: 15px;
            overflow: hidden;
        }

        .table thead th {
            background-color: #4f46e5;
            color: white;
            text-align: center;
            padding: 14px;
        }

        .table tbody td {
            vertical-align: middle;
            padding: 12px;
        }

        .table tbody tr:hover {
            background-color: #eef2ff;
        }

        .password {
            color: #dc3545;
            font-weight: 500;
        }

        .btn-back {
            background-color: #4f46e5;
            color: white;
            border: none;
        }

        .btn-back:hover {
            background-color: #3730a3;
            color: white;
        }
    </style>

</head>

<body>

<div class="container mt-5">

    <h1 class="text-center page-title mb-4">
        All Signup Details
    </h1>

    <div class="card shadow-lg">

        <div class="card-body p-0">

            <div class="table-responsive">

                <table class="table table-bordered table-hover mb-0">

                    <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Email</th>
                        <th>Password</th>
                        <th>Confirm Password</th>
                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach items="${signupList}" var="signup">

                        <tr>
                            <td class="fw-bold">
                                ${signup.userId}
                            </td>

                            <td>
                                ${signup.email}
                            </td>

                            <td class="password">
                                ${signup.password}
                            </td>

                            <td class="password">
                                ${signup.confirmPassword}
                            </td>
                        </tr>

                    </c:forEach>

                    </tbody>

                </table>

            </div>

        </div>
    </div>

    <div class="text-center mt-4">

        <a href="${pageContext.request.contextPath}/Signup.jsp"
           class="btn btn-back px-4 py-2">
            ← Back to Signup
        </a>

    </div>

</div>

</body>
</html>