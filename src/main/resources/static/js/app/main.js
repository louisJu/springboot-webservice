var main = {
    init : function (){
        var _this = this;
        $('#btn-save').on('click', function(){
            _this.save();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            content: $('#content').val(),
            author: $('#author').val()
        };

        $.ajax({
            type: 'POST',
            data: JSON.parse(data),
            url: '/posts',
            dataType:'json',
            contentType:'application/json; charset=utf-8'
        }).done(function(){
            alert('SUCCESS');
            location.reload();
        }).fail(function(error) {
            alert(error);
        });
    }
};

main.init();