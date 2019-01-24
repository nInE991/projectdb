$(document).ready(function () {
    $('.button_send').on('click', function () {
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
                alert("Запись добавлена!");
                document.location.replace("/counterparties");
            },
            error: function () {
                alert("Запись не добавлена!")
            }
        });
    });
});
