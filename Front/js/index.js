function validarVacios(){

    let cedula = $("#CedulaC").val();
    let nombre = $("#NombreC").val();
    let email = $("#EmailC").val();
    let direccion = $("#DireccionC").val();
    let contraseña = $("#contraseñaC").val();
    let contraseña2 = $("#contraseñaC2").val();
    let edad = $("#Edad").val();
    let sexo = $("#Sexo").val();
    let localidad = $("#Localidad").val();
    let ocupacion = $("#Ocupacion").val();
    
    if (ocupacion == 0){ 
        ocupacion = "";
    }
    if (localidad == 0){ 
        localidad = "";
    }
    if (sexo == 0){ 
        sexo = "";
    }

    let cedulaC = document.getElementById("CedulaC")
    let nombreC = document.getElementById("NombreC")
    let emailC = document.getElementById("EmailC")
    let direccionC = document.getElementById("DireccionC")
    let contraseñaC = document.getElementById("contraseñaC")
    let contraseñaC2 = document.getElementById("contraseñaC2")
    let edadC = document.getElementById("Edad")
    let sexoC = document.getElementById("Sexo")
    let localidadC = document.getElementById("Localidad")
    let ocupacionC = document.getElementById("Ocupacion")
    let AlertaContraseña = document.getElementById("AlertaContraseña")
    let AlertClase = document.getElementsByClassName("")
    let AlertaEdad = document.getElementById("AlertaEdad")
    let AlertaCedula = document.getElementById("AlertaCedula")


    if(cedula == "" || nombre == "" || email == "" ||
    direccion == "" || contraseña == "" || contraseña2 == "" ||
    edad == "" || sexo == "" || localidad == "" || ocupacion == ""){
        
        if(cedula ==""){
            cedulaC.className="form-control is-invalid";
        }else{
            if (cedula.length < 10){
                cedulaC.className="form-control is-invalid";
                AlertaCedula.style.display="inline"
                AlertaCedula.innerHTML="";
                let alertaC = document.createElement("div") 
                alertaC.innerHTML="";
                alertaC.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">Minimo 10 caracteres<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
                AlertaCedula.append(alertaC)
            }else{
                cedulaC.className="form-control";
            }
            }
        
        if(nombre ==""){
            nombreC.className="form-control is-invalid";
        }else{
            nombreC.className="form-control";
        }
        
        if(email ==""){
            emailC.className="form-control is-invalid";
        }else{
            emailC.className="form-control";
        }

        if(direccion ==""){
            direccionC.className="form-control is-invalid";
        }else{
            direccionC.className="form-control";
        }

        if(contraseña =="" || contraseña2 == ""){
            contraseñaC.className="form-control is-invalid";
            contraseñaC2.className="form-control is-invalid";
            
        }else{
            contraseñaC.className="form-control";
            contraseñaC2.className="form-control";
                        
            }
        
        if(edad == ""){
            edadC.className="form-control is-invalid";

        }else{
            if(edad<15){
                edadC.className="form-control is-invalid";
                AlertaEdad.style.display="inline"
                AlertaEdad.innerHTML="";
                let alertaE = document.createElement("div") 
                alertaE.innerHTML="";
                alertaE.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">Debe ser mayor de 15 años<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
                AlertaEdad.append(alertaE)
            }else{
                edadC.className="form-control";
                AlertaEdad.style.display="inline"
                }
        }
        if(sexo == ""){
            sexoC.className="form-control is-invalid"

        }else{
            sexoC.className="form-control"
        }

        if(ocupacion == ""){
            ocupacionC.className="form-control is-invalid" 

        }else{
            ocupacionC.className="form-control"

        }

        if(localidad == ""){
            localidadC.className="form-control is-invalid"
            
        }else{
            localidadC.className="form-control"

        }
                
        let alertaCrear = document.getElementById("AlertaCrear")
        alertaCrear.innerHTML="";
        let alertaC = document.createElement("div") 
        alertaC.innerHTML="";
        alertaC.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">Ingrese todos los datos solicitados<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
        alertaCrear.append(alertaC)
        }
    else{
        if (cedula.length < 10){
            cedulaC.className="form-control is-invalid";
        }else{
            cedulaC.className="form-control";
        }

        if(contraseña.length < 6 ){
            contraseñaC.className="form-control is-invalid";
            contraseñaC2.className="form-control is-invalid";
            AlertaContraseña.style.display="inline"
            AlertaContraseña.innerHTML="";
            let alertaContra = document.createElement("div") 
            alertaContra.innerHTML="";
            alertaContra.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">Cntraseña debe ser mayor a 10 caracteres<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
            AlertaContraseña.append(alertaContra)
        }else{
            
            AlertaContraseña.innerHTML="";
            contraseñaC.className="form-control";
            contraseñaC2.className="form-control";
            AlertaContraseña.style.display="none"
            if (contraseña!=contraseña2){
                contraseñaC.className="form-control is-invalid";
                contraseñaC2.className="form-control is-invalid";
                AlertaContraseña.style.display="inline"
                AlertaContraseña.innerHTML="";
                let alertaContra = document.createElement("div") 
                alertaContra.innerHTML="";
                alertaContra.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">Las contraseñas deben ser iguales<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
                AlertaContraseña.append(alertaContra)
            }else{
                contraseñaC.className="form-control";
                contraseñaC2.className="form-control";
                AlertaContraseña.style.display="none"
                }}
        if(edad<15){
            console.log(edad)
            edadC.className="form-control is-invalid";
            AlertaEdad.style.display="inline"
            AlertaEdad.innerHTML="";
            let alertaE = document.createElement("div") 
            alertaE.innerHTML="";
            alertaE.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">Debe ser mayor de 15 años<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
            AlertaEdad.append(alertaE)
        }else{
            edadC.className="form-control";
            AlertaEdad.style.display="inline"
            }

        if(AlertClase.length = 0){

        let alertaCrear = document.getElementById("AlertaCrear")
        alertaCrear.innerHTML="";
        alert("pero que ha pasao")
        }
    }

}



function validarVaciosLog(){

    let email = $("#email").val();
    let contraseña = $("#contraseña").val();

    let cEmail = document.getElementById("email");
    let cContraseña = document.getElementById("contraseña");
    

    if(email == "" || contraseña == ""){

        cEmail.className="form-control is-invalid";
        cContraseña.className=cEmail.className="form-control is-invalid";
        let alertaLog = document.getElementById("AlertaLog")
        let alertaC = document.createElement("div") 
        alertaC.innerHTML="";
        alertaC.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert"> Correo o contraseña incorrectos <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
        alertaLog.appendChild(alertaC)

    }
}
    function verEmail() {
    
    
        if(!eregi("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$", $email)){
        alert("PORONGAA")
    }else{
        alert("PORON");
    }



}