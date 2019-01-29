$(document).ready(function () {
    $('.button_add_products').on('click', function () {
        $.ajax({
            type: 'POST',
            url: '/products/add',
            data: {
                id: $(this).data('id'),
                name: $('#name').val(),
                price: $('#price').val(),
            },
            success: function (data) {
                document.location.replace("/products/" + data + "/components");
            },
            error: function () {
                alert("Запись не добавлена!")
            }
        });
    });
    $('.button_add_comp').on('click', function () {
        $('#Modal').modal('show');
    });
    $('.button_delete_products').on('click', function () {
        $.ajax({
            type: 'DELETE',
            url: '/products/delete',
            data: {
                id: $(this).data('id')
            },
            success: function (data) {
                document.location.replace("/products");
            },
            error: function () {
                alert("Запись не удалена!")
            }
        });
    });
    $('#buttonModal').on('click', function () {
        $.ajax({
            type: 'POST',
            url: '/products/' + $(this).data('id') + '/components',
            data: {
                id: $('.compname').val(),
                count: $('#editCount').val()
            },
            success: function (data) {
                location.reload();
            },
            error: function () {
                alert("Запись не удалена!")
            }
        });
    });
    $('.but_delete_prodstruct').on('click', function () {
        $.ajax({
            type: 'DELETE',
            url: '/products/components/delete',
            data: {
                id: $(this).data('id')
            },
            success: function () {
                location.reload();
            },
            error: function () {
                alert("Запись не удалена!")
            }
        });
    });
    $('.but_edit_prod').on('click', function () {
        document.location.replace("/products/" + $(this).data('id'));
    });
    $('.but_see_struct').on('click', function () {
        document.location.replace("/products/" + $(this).data('id') + "/components");
    })
});
