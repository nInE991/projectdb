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
                price: $('#price').val()
            },
            success: function () {
                document.location.replace("/orders");
            },
            error: function () {
                alert("Заказ не добавлен!")
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
    $('.button_ordersid').on('click', function () {
        document.location.replace("/orders/" + $(this).data('id'));
    });
    $('.button_del_ordersid').on('click', function () {
        $.ajax({
            type: 'DELETE',
            url: '/orders/delete',
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