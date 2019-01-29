$(document).ready(function () {
    var date = new Date();

    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();

    if (month < 10) month = "0" + month;
    if (day < 10) day = "0" + day;

    $('#date').val(year + "-" + month + "-" + day);
    $('.button_buy').on('click', function () {
        $.ajax({
            type: 'POST',
            url: '/orders/buy/add',
            data: {
                compid: $('.comp').val(),
                date: $('#date').val(),
                countid: $('.counter').val(),
                count: $('#count').val(),
                price: $('#price').val(),
                note: $('#note').val()
            },
            success: function () {
                document.location.replace("/orders");
            },
            error: function () {
                alert("Запись не удалена!")
            }
        });
    })
});