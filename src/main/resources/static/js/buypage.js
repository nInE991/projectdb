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
            url: '/buy/add',
            data: {
                id: $('.comp').val(),
                date: $('#date').val(),
                count: $('#count').val(),
                price: $('#price').val()
            },
            success: function () {
                document.location.replace("/buy");
            },
            error: function () {
                alert("Закупка не добавлена!")
            }
        });
    });

    $('.total').change(function () {
        if ($('#count').val() < 0) {
            $('#count').val(0);
        }
        if ($('#price').val() < 0) {
            $('#price').val(0);
        }
        $('#total').val($('#count').val() * $('#price').val());
    });


    $('.button_del_ordersid').on('click', function () {
        $.ajax({
            type: 'DELETE',
            url: '/buy/delete',
            data: {
                id: $(this).data('id')
            },
            success: function () {
                location.reload();
            },
            error: function () {
                alert("Заказ не удален!")
            }
        });
    })
});