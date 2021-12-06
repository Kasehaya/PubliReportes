function GuardarT(){

    let email = $("#email").val();
    let contraseña = $("#contraseña").val();
    let confirmar = false;

    $.ajax({    

        url: 'http://localhost:8080/api/Usuarios/all',
        
        type: 'GET',
        dataType : 'JSON',
        contentType:'application/json',
        
        
        success : function(json, textStatus, xhr) {
            
            for(i = 0; i< json.length; i++){
                
                if(email == json.items[i].email ){
                    if(contraseña == json.items[i].contraseña){
                        location.href= "http://localhost:8080/pagPrueba.html";
                        window.idUsuario = json.items[i].idUsuario;
                        window.name = json.items[i].name;
                        window.rol = json.items[i].rol;
                    }

                }

            }    
},
        
                complete : function(xhr, status) {
                //alert('Petición realizada '+xhr.status);
    
    
            }
    });
}