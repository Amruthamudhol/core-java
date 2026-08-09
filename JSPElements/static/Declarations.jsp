<html>
<body>

<%!
    int number = 100;

    public int square(int n) {
        return n * n;
    }
%>

<p>Number = <%= number %></p>

<p>Square = <%= square(5) %></p>

</body>
</html>