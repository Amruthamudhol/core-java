<!DOCTYPE html>
<html>
<head>
    <title>Feedback</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="col-md-6 mx-auto">

        <div class="card shadow">

            <div class="card-header bg-success text-white text-center">
                <h3>Feedback Form</h3>
            </div>

            <div class="card-body">

                <form action="feedback" method="post">
                <h3>${message}</h3>

                    <label class="form-label">Email</label>
                    <input type="email"
                           name="email"
                           class="form-control mb-3"
                           placeholder="Enter Email"
                           required>

                    <label class="form-label">Name</label>
                    <input type="text"
                           name="name"
                           class="form-control mb-3"
                           placeholder="Enter Name"
                           required>

                    <label class="form-label">Mobile</label>
                    <input type="tel"
                           name="mobile"
                           class="form-control mb-3"
                           placeholder="Enter Mobile Number"
                           pattern="[0-9]{10}"
                           required>

                    <label class="form-label">Comment</label>
                    <textarea name="comment"
                              class="form-control mb-3"
                              rows="4"
                              placeholder="Enter your comment"
                              required></textarea>

                    <button type="submit" class="btn btn-success w-100">
                        Submit Feedback
                    </button>

                </form>

                <div class="text-center mt-3">
                    <a href="index.html">Back to Home</a>
                </div>

            </div>
        </div>

    </div>

</div>

</body>
</html>