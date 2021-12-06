function pagCrearRutas() {
    $("#containerPag").load("http://127.0.0.1:8887/Front/pagPrueba.html", function (data) {
    $(this).html(data);

    let menu1 = document.getElementById("menu1")
    let menu2 = document.getElementById("menu2")
    let menu3 = document.getElementById("menu3")
    let menu4 = document.getElementById("menu4")
    let menu5 = document.getElementById("menu5")
    let contain = document.getElementById("contain")
    
    menu1.className = "nav-link active";

    menu2.className = "nav-link";
    menu3.className = "nav-link";
    menu4.className = "nav-link";
    menu5.className = "nav-link";
    
    contain.style.backgroundColor= "#031633";

    })
}

function pagRutas() {
    $("#containerPag").load("http://127.0.0.1:8887/Front/comentario.html", function (data) {
    $(this).html(data);

    let menu1 = document.getElementById("menu1")
    let menu2 = document.getElementById("menu2")
    let menu3 = document.getElementById("menu3")
    let menu4 = document.getElementById("menu4")
    let menu5 = document.getElementById("menu5")
    
    let contain = document.getElementById("contain")

    menu2.className = "nav-link active";

    menu1.className = "nav-link";
    menu3.className = "nav-link";
    menu4.className = "nav-link";
    menu5.className = "nav-link";
    
    contain.style.backgroundColor= "#031633";

    })
}

function pagComentarios() {
    $("#containerPag").load("http://127.0.0.1:8887/Front/comentario.html", function (data) {
    $(this).html(data);

    let menu1 = document.getElementById("menu1")
    let menu2 = document.getElementById("menu2")
    let menu3 = document.getElementById("menu3")
    let menu4 = document.getElementById("menu4")
    let menu5 = document.getElementById("menu5")

    let contain = document.getElementById("contain")

    menu3.className = "nav-link active";

    menu1.className = "nav-link";
    menu2.className = "nav-link";
    menu4.className = "nav-link";
    menu5.className = "nav-link";
    contain.style.backgroundColor= "#031633";

    })
}

function pagVerComentarios() {
    $("#containerPag").load("http://127.0.0.1:8887/Front/verComentarios.html", function (data) {
    $(this).html(data);

    let menu1 = document.getElementById("menu1")
    let menu2 = document.getElementById("menu2")
    let menu3 = document.getElementById("menu3")
    let menu4 = document.getElementById("menu4")
    let menu5 = document.getElementById("menu5")
    let contain = document.getElementById("contain")

    menu4.className = "nav-link active";

    menu1.className = "nav-link";
    menu2.className = "nav-link";
    menu3.className = "nav-link";
    menu5.className = "nav-link";
    
    contain.style.backgroundColor= "#031633";

})
}

function pagUsuarios() {
    $("#containerPag").load("http://127.0.0.1:8887/Front/pagUsuarios.html", function (data) {
    $(this).html(data);

    let menu1 = document.getElementById("menu1")
    let menu2 = document.getElementById("menu2")
    let menu3 = document.getElementById("menu3")
    let menu4 = document.getElementById("menu4")
    let menu5 = document.getElementById("menu5")
    let contain = document.getElementById("contain")

    menu5.className = "nav-link active";

    menu1.className = "nav-link";
    menu2.className = "nav-link";
    menu3.className = "nav-link";
    menu4.className = "nav-link";
    
    contain.style.backgroundColor= "#031633";

})
}

function Salir(){
    localStorage.removeItem('identificacion');
    localStorage.removeItem('name');
    localStorage.removeItem('rol');
    location.href="http://127.0.0.1:8887/Front/index.html"

}

function nombreUs(){
    
    let identUsuario = document.getElementById("identificacionUsuario")
    let titulo = localStorage.getItem("name")
    let rol = localStorage.getItem("rol")
    identUsuario.innerHTML = "Bienvenido "+titulo+" tiene un rol de "+rol;

}

function pagCrearTransporte(){



}