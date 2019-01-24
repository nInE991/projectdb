$(document).ready(function () {
    $('.button_send_parties').on('click', function () {
        $.ajax({
            type: 'POST',
            url: '/counterparties/add',
            data: {
                name: $('#name').val(),
                director: $('#director').val(),
                telephone: $('#telephone').val(),
                address: $('#address').val()
            },

            success: function () {
                document.location.replace("/counterparties");
            },
            error: function () {
                alert("Запись не добавлена!")
            }
        });
    });
    $('.button_edit_parties').on('click',function () {
        document.location.replace("/counterparties/"+ $(this).data('id'));
    });
    $('.button_del_parties').on('click', function () {
        $.ajax({
            type: 'DELETE',
            url: '/counterparties',
            data: {
                id: $(this).data('id')
            },
            success: function () {
                location.reload();
                alert("Запись удалена!");
            },
            error: function () {
                alert("Запись не удалена!")
            }
        });
    });
    $('.button_edit_send_parties').on('click',function () {
        $.ajax({
            type: 'POST',
            url: '/counterparties/edit',
            data: {
                id:$(this).data('id'),
                name: $('#name').val(),
                director: $('#director').val(),
                telephone: $('#telephone').val(),
                address: $('#address').val()
            },

            success: function () {
                document.location.replace("/counterparties");
            },
            error: function () {
                alert("Запись не изменена!")
            }
        });
    });
});
