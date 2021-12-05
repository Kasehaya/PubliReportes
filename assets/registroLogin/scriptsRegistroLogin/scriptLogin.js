const inputUsuario = document.getElementById("usuario")
const inputContraseña = document.getElementById("contraseña")
const btnLogin = document.getElementById("botonLog")
const verMail = document.getElementById("verEmail")
const verPass = document.getElementById("verPassw")

const iniciarSesion = () => {
    usuario = inputUsuario.value
    contraseña = inputContraseña.value
    console.log("Usuario: " + usuario, "Contraseña:" + contraseña)
    verMail.innerHTML = "El Email es un valor requerido"
    verPass.innerHTML = "La Contraseña es un valor requerido"
}

btnLogin.addEventListener("click", iniciarSesion)
