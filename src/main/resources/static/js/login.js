function login() {
    let username = document.querySelector('#username').value;
    let password = document.querySelector('#psw').value;
    let sendData = "username=" + username + "&password=" + password;
    $.ajax({
        url: 'login',
        type: 'POST',
        data: sendData,
        success: function (data) {
            /* TODO: 登录功能.返回数据处理 */
        }
    })
}