$(function() {
    $('a[href^="#"]').click(function () {
        elementClick = $(this).attr('href');
        destination = $(elementClick).offset().top;
        $('body').animate( { scrollTop: destination }, 500 );
        $('html').animate( { scrollTop: destination }, 500 );
        return false;
    });
});
