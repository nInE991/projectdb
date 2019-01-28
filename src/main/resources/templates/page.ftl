<#macro basis>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Производство</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <link href="/open-iconic/font/css/open-iconic-bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <a class="navbar-brand" href="/">Главная</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse mt-1" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ">
                <a class="nav-link" href="/orders">Заказы</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/products">Продукция</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/components">Компоненты</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/logs">Склад</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/counterparties">Контрагенты</a>
            </li>
        </ul>
        <span class="navbar-text balance">Balance : </span>
    </div>
</nav>
<#nested>
</body>
</html>
</#macro>