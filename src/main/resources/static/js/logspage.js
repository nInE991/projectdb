$(document).ready(function () {
    $('.button_add_logs').on('click', function () {
        $.ajax({
            type: 'POST',
            url: '/logs/add',
            data: {
                id: $('.namecomp').val(),
                count: $('#count').val(),
                note: $('#note').val()
            },

            success: function () {
                document.location.replace("/logs");
            },
            error: function () {
                alert("Запись не изменена!")
            }
        });
    });
});
