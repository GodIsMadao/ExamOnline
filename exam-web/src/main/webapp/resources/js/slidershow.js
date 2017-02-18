$(function(){
    $("#slidershow").carousel({
        interval:2000
    });
    $("#slidershow a.left").click(function(){
        $(".carousel").carousel("prev");
    });
    $("#slidershow a.right").click(function(){
        $(".carousel").carousel("next");
    });
});