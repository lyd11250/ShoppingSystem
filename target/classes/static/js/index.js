function login() {
    let form = document.getElementById('userForm');
    let username = form.username.value;
    let password = form.password.value;
    let sendData = "name=" + username + "&password=" + password;
    $.ajax({
        url:"login",
        type:"POST",
        data:sendData,
        success:function (d) {
            console.log(d);
        }
    })
}