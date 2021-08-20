function carregaInfo() {
    var userSTR = localStorage.getItem("userDASH");
    if (!userSTR) {
        window.location = "index.html"
    }
    
    var user = JSON.parse(userSTR);

    document.getElementById("fotoUser").innerHTML = `<img src="${user.link_foto}"  width="100%">`;
    document.getElementById("bioUser").innerHTML = `<h4> ${user.nome} </h4>
    <hr>
    <b> RACF: </b> ${user.racf} <br>
    <b> Email: </b> ${user.email} <br>
    <b> Departamento: </B> ${user.departamento} <br>
    <button type="button" class="btn btn-primary" onclick="logout()">Logout</button>`;
}

function logout() {
    localStorage.removeItem("userDASH");
    window.location = "index.html"
}

