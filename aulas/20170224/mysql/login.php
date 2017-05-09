<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>PHP</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="col-sm-6">
                <form action="login_create.php" method="post">
                    <div class="form-group">
                        <label>
                            Usuário:
                        </label>
                        <input type="text" name="username" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>
                            Senha:
                        </label>
                        <input type="password" name="password" class="form-control">
                        <label>
                    </div>
                    <div class="form-group">
                        <input type="submit" name="enviar" class="btn btn-primary btn-block" value="Enviar">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
