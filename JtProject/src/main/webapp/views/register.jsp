<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <link href="../css/index.css" rel="stylesheet" type="text/css">
    <title>Document</title>
</head>
<body>

<section class="userlogin-main">
    <div class="container my-3">
        <div class="row">
            <div class="col-lg-12">
                <div class="userlogin-inner">
                    <div class="text-center pb-2">
                    <h3 style="margin-top: 10px">Sign Up Now</h3>
                    <p>Please fill out this to register</p>
                    </div>
                    <form action="newuserregister" method="post">
                        <div class="form-group mb-1 mb-lg-2">
                            <label for="firstName">User Name</label>
                            <input type="text" name="username" id="firstName" required placeholder="Your Username*" required class="form-control form-control-lg">
                        </div>
                        <div class="form-group mb-1 mb-lg-2">
                            <label for="email">Email address</label>
                            <input type="email" class="form-control form-control-lg" required minlength="6" placeholder="Email*" required name="email" id="email"
                                   aria-describedby="emailHelp">
                            <small id="emailHelp" class="form-text text-muted">We'll never share your email with
                                anyone else.</small>
                        </div>
                        <div class="form-group mb-1 mb-lg-2">
                            <label for="password">Password</label>
                            <input type="password" class="form-control form-control-lg" required placeholder="Password*" required name="password"
                                   id="password">
                        </div>
                        <div class="form-group mb-1 mb-lg-2">
                            <label for="Address">Address</label>
                            <textarea class="form-control form-control-lg" rows="3" placeholder="Enter Your Address" name="address"></textarea>
                        </div>
                        <span style="margin-top: 10px">Already have an account <a class="linkControl" href="/">Login here</a></span>
                        <div class="mt-3">
                            <button type="submit"  class="btn common-btn btn-block">Register</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</section>














<div class="container">
    <div class="col-sm-6">


    </div>
</div>


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>