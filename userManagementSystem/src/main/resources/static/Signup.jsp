<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="col-md-6 mx-auto">

        <div class="card shadow">

            <div class="card-header bg-primary text-white text-center">
                <h3>Create Account</h3>
            </div>

            <div class="card-body">

                <form action="${pageContext.request.contextPath}/signup"
                      method="post">

                    <h3>${message}</h3>

                    <label class="form-label">User ID</label>
                    <input type="text"
                           name="userId"
                           class="form-control mb-3"
                           placeholder="Enter User ID"
                           required>

                    <label class="form-label">Email</label>
                    <input type="email"
                           name="email"
                           class="form-control mb-3"
                           placeholder="Enter Email"
                           required>

                    <label class="form-label">Password</label>
                    <input type="password"
                           name="password"
                           class="form-control mb-3"
                           placeholder="Enter Password"
                           required>

                    <label class="form-label">Confirm Password</label>
                    <input type="password"
                           name="confirmPassword"
                           class="form-control mb-3"
                           placeholder="Confirm Password"
                           required>

                    <button type="submit"
                            class="btn btn-primary w-100">
                        Signup
                    </button>

                </form>

                <div class="text-center mt-3">
                    Already have an account?
                    <a href="${pageContext.request.contextPath}/SignIn.jsp">
                        Sign In
                    </a>
                </div>

                <div class="text-center mt-2">
                    <a href="${pageContext.request.contextPath}/index.html">
                        Back to Home
                    </a>
                </div>

                <div class="text-center mt-2">
                    <a href="${pageContext.request.contextPath}/readAllSignup">
                        Read All Signup
                    </a>
                </div>

            </div>
        </div>

    </div>

</div>

</body>
</html>