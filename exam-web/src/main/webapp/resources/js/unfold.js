(function($){
    $.fn.unfold = function(opts){
        var settings= $.extend({
            selectedClz:"selected",
            titleTagName:"h3"
        },opts||{});
        var titleNode=(this).find("ul>"+settings.titleTagName);
        var selectedNode=(this).find("ul."+settings.selectedClz+">"+settings.titleTagName);
        titleNode.css("cursor","pointer");
        titleNode.nextAll().css("display","none");
        selectedNode.nextAll().css("display","block");

        titleNode.click(function () {
            var checked = $(this).parent().hasClass(settings.selectedClz);
            if (checked) {
                $(this).parent().removeClass(settings.selectedClz);
                $(this).nextAll().slideUp().fadeOut();
            } else {
                $(this).parent().addClass(settings.selectedClz);
                $(this).nextAll().css("list-style","none").slideDown().fadeIn();
            }
        });
    };
})(jQuery);