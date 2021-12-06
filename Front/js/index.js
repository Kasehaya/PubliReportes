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
    let AlertClase = document.getElementsByClassName("AlertaCrear")
    let AlertaEdad = document.getElementById("AlertaEdad")
    let AlertaCedula = document.getElementById("AlertaCedula")
    let AlertaEmail = document.getElementById("AlertaEmail")
    let var1 = 0;
    let var2 = 1;
    let confirmarEmail = 0;
    let confirmarPunto = 0;
    let fechaDeNacimiento = new Date(edad);
    let hoy = new Date();
    let edadN = parseInt((hoy - fechaDeNacimiento) / (1000*60*60*24*365));
    

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
            emailC.className="form-control"
            for(i = 0 ; i < email.length; i++){
    
                var confirmar = email.substring(var1,var2);  
                var1 += 1;
                var2 += 1;
            
                if (confirmar == "@"){
                    confirmarEmail +=1; 
                }
        
                if (confirmar == "."){
              confirmarPunto +=1; 
                }
            }if(confirmarEmail!=1 || confirmarPunto<1){
        
                    emailC.className="form-control is-invalid";
                    AlertaEmail.style.display="inline"
                    AlertaEmail.innerHTML="";
                    let alertaEm = document.createElement("div") 
                    alertaEm.innerHTML="";
                    alertaEm.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">El Email no es Valido<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
                    AlertaEmail.append(alertaEm)
        
                }else{
                    emailC.className="form-control"
                    AlertaEmail.innerHTML="";
                    AlertaEmail.style.display="none"
                }
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
            if(edadN<15){
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

        
        console.log("ejecutar confirmar");
         for(i = 0 ; i < email.length; i++){
    
        var confirmar = email.substring(var1,var2);  
        var1 += 1;
        var2 += 1;
    
        if (confirmar == "@"){
            confirmarEmail +=1; 
        }

        if (confirmar == "."){
      confirmarPunto +=1; 
        }
    }
  

        if(confirmarEmail!=1 || confirmarPunto<1){

            emailC.className="form-control is-invalid";
            AlertaEmail.style.display="inline"
            AlertaEmail.innerHTML="";
            let alertaEm = document.createElement("div") 
            alertaEm.innerHTML="";
            alertaEm.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert">El Email no es Valido<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
            AlertaEmail.append(alertaEm)

        }else{
            emailC.className="form-control"

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

        if(AlertClase.value == null){

        let alertaCrear = document.getElementById("AlertaCrear")
        alertaCrear.innerHTML="";
        alert("pero que ha pasao")
        guardarUsuario();
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
    else{
        ingreso();

    }
}
    var datosjson
function ingreso(){

    let email = $("#email").val();
    let contraseña = $("#contraseña").val();
    let confirmar = false;

    $.ajax({    

        url: 'http://localhost:8080/api/usuarios/all',
        
        type: 'GET',
        dataType : 'JSON',
        contentType:'application/json',
        
        
        success : function(json, textStatus, xhr) {
            console.log(json)
            datosjson = json;
            for(i = 0; i< json.length; i++){
                
                if(email == json[i].email ){
                    if(contraseña == json[i].contraseña){
                        location.href= "http://127.0.0.1:8887/Front/pagContenedor.html";
                        idUsuario = json[i].idUsuario;
                        name = json[i].name;
                        rol = json[i].rol;
                        localStorage.setItem('ident', idUsuario);
                        localStorage.setItem('name', name);
                        localStorage.setItem('rol', rol);
                    }

                }

            }    
},
        
                complete : function(xhr, status) {
                //alert('Petición realizada '+xhr.status);
    
    
            }
    });
}

function guardarUsuario(){

    console.log("se ejecuta guardar")
    let edad= $("#Edad").val()
    
    let fechaDeNacimiento = new Date(edad);
    let hoy = new Date();
    let edadN = parseInt((hoy - fechaDeNacimiento) / (1000*60*60*24*365));
    

    let var2 = {
        idUsuario: $("#CedulaC").val(),
        name: $("#NombreC").val(),
        email: $("#EmailC").val(),
        contraseña: $("#contraseñaC").val(),
        direccion: $("#DireccionC").val(),
        edad: edadN,
        sexo: $("#Sexo").val(),
        localidad: $("#Localidad").val(),
        ocupacion: $("#Ocupacion").val()
        
    };
    
    $.ajax({
        type:'POST',
        contentType:"application/json; charset=utf-8",
        dataType: 'JSON',
        data: JSON.stringify(var2),
        url:"http://localhost:8080/api/usuarios/save",
        success:function() {
            alert("Guardó correctamente");
                let modal = document.getElementById("staticBackdrop");
                 modal.style.display="none";

                 $('.modal-backdrop').remove();

        },
        error:function(){
            
            
            alert("No se guardó correctamente");
        }
    });

}