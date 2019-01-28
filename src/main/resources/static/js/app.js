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

    $('.trlinklog').on('click',function () {
        document.location.replace("/logs/"+ $(this).data('id'));
    });

    $.ajax({
        type: 'GET',
        url: '/balance',
        dataType: 'json',
        success: function (data) {
            $('.balance').text($('.balance').text()+ data+" ");
        }
    });

    $('.button_add_components').on('click',function () {
        $.ajax({
            type: 'POST',
            url: '/components/add',
            data: {
                name: $('#name').val(),
                units: $('.units').val()
            },

            success: function () {
                document.location.replace("/components");
            },
            error: function () {
                alert("Запись не добавлена!")
            }
        });
        });

    $('.button_del_components').on('click',function () {
        $.ajax({
            type: 'DELETE',
            url: '/components/delete',
            data: {
               id: $(this).data('id')
            },

            success: function () {
                document.location.replace("/components");
            },
            error: function () {
                alert("Запись не удалена!")
            }
        });
    });

    $('.button_edit_components').on('click',function () {
        document.location.replace("/components/"+ $(this).data('id'));
    });

    $('.besc').on('click',function () {
        $.ajax({
        type: 'POST',
            url: '/components/edit',
            data: {
                id: $(this).data('id'),
                name: $('#name').val(),
                units: $('.units').val()
        },

        success: function () {
            document.location.replace("/components");
        },
        error: function () {
            alert("Запись не изменена!")
        }
        });
    });

});
