var main = {
    init : function() {
        var _this = this;
        $("#btn-save").on('click', function() {
            _this.join();
        });
    },

    join : function() {
        var data = {
            name: $("#name").val(),
            userId: $("#userId").val(),
            pwd: $("#pwd").val(),
            checkPwd: $("#checkPwd").val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/join',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert("가입 완료");
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });
    }
};
main.init();