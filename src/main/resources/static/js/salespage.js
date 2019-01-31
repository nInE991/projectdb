$(document).ready(function () {
    var date = new Date();
    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();

    if (month < 10) month = "0" + month;
    if (day < 10) day = "0" + day;

    $('#date').val(year + "-" + month + "-" + day);

    $('.total').change(function () {
        if ($('#count').val() < 0) {
            $('#count').val(0);
        }
        if ($('#price').val() < 0) {
            $('#price').val(0);
        }
        $('#total').val($('#count').val() * $('#price').val());
    });
    $('.products').change(function () {
        $.ajax({
            type: 'GET',
            url: '/products/price/' + $(this).val(),
            dataType: 'json',
            success: function (data) {
                $('#price').val(data);
            },
            error: function () {
                alert("Запись не добавлена!")
            }
        });
    });
    $('.button_sales').on('click', function () {
        $.ajax({
            type: 'POST',
            url: '/sales/add',
            data: {

                date: $('#date').val(),
                count: $('#count').val(),
                price: $('#price').val(),
                counterp: $('.comp').val(),
                products: $('.products').val()
            },
            success: function () {
                document.location.replace("/sales");
            },
            error: function () {
                alert("Продажа не добавлена!")
            }
        });
    });
});
