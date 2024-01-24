<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2>Register</h2>
<form action="/home/register" method="POST">
    <div>
        <label>Username</label>
        <input name="username" type="text" />
    </div>

    <div>
        <label>Password</label>
        <input name="password" type="password" />
    </div>

    <button>Register</button>
</form>