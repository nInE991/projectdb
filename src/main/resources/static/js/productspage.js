$(document).ready(function () {

    $('.button_add_products').on('click', function () {
        window.name = $('#name').val();
        window.price = $('#price').val();
        document.location.replace("/products/page2");
    });

});
