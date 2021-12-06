function verificarVaciosC(){

    let alertaComentario = document.getElementById("alertaComentario")
    let opinionC = document.getElementById("Opinion")
    let calificacionC = document.getElementById("Calificacion")
    let recomendacionC = document.getElementById("Recomendacion")

    let opinion = $("#Opinion").val()
    let calificacion = $("#Calificacion").val()
    let recomendacion = $("#Recomendacion").val()

    

    if (opinion == "" || calificacion == "" || recomendacion == ""){

        opinionC.className="form-control is-invalid";
        calificacionC.className="form-control is-invalid";
        recomendacionC.className="form-control is-invalid";
        
        let alertaCom = document.createElement("div") 
        alertaCom.innerHTML="";
        alertaCom.innerHTML = '<div class="alert alert-danger alert-dismissible" role="alert"> Debe llenar todos los espacios Solicitados <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
        alertaComentario.appendChild(alertaCom)

    }
    else{

        guardarUsuario();

    }

}




function guardarUsuario(){
   
    let alertaComentario = document.getElementById("alertaComentario")
    let opinionC = document.getElementById("Opinion")
    let calificacionC = document.getElementById("Calificacion")
    let recomendacionC = document.getElementById("Recomendacion")

    let var2 = {
        idUsuario: window.idUsuario,
        opinion: $("#Opinion").val(),
        calificacion: $("#Calificacion").val(),
        recomendacion: $("#Recomendacion").val()
       
    };
    
    $.ajax({
        type:'POST',
        contentType:"application/json; charset=utf-8",
        dataType: 'JSON',
        data: JSON.stringify(var2),
        url:"http://localhost:8080/api/Usuarios/new",
        success:function() {
            
            opinionC.className="form-control";
            calificacionC.className="form-control";
            recomendacionC.className="form-control";
            
            let alertaCom = document.createElement("div") 
            alertaCom.innerHTML="";
            alertaCom.innerHTML = '<div class="alert alert-success alert-dismissible" role="alert">Se ha guardado Correctamente <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>'
            alertaComentario.appendChild(alertaCom)

        },
        error:function(){
            
            
            alert("No se guardó correctamente");
        }
    });

}