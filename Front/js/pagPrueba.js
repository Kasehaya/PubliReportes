function cargarTabla(){

    $.ajax({    

        url: 'http://localhost:8080/api/usuarios/all',
        
        type: 'GET',
        dataType : 'JSON',
        contentType:'application/json',
        
        
        success : function(json, textStatus, xhr) {
           
            $("#tabla").empty();

            tabla = `<center><table class="table table-bordered">
                

            <thead class="table-secondary">
            <tr>
              <th scope="col">id_usuario</th>
              <th scope="col">Nombre</th>
              <th scope="col">Email</th>
              <th scope="col">Contraseña</th>
              <th scope="col">Direccion</th>
              <th scope="col">Edad</th>
              <th scope="col">Sexo</th>
              <th scope="col">Ocupacion</th>
              <th scope="col">Accion</th>

            </tr>
          </thead>
          <tbody>
          `
            for(i = 0;  i < json.length; i++){
              
              
              tabla += `<tr>
               <td>${json[i].id_usuario}  
               <td>${json[i].nombre}
               <td>${json[i].email}
               <td>${json[i].contraseña}
               <td>${json[i].direccion}
               <td>${json[i].edad}
               <td>${json[i].sexo}
               <td>${json[i].ocupacion}
               <td>
               <button id="btnGroupDrop1" type="button" class="btn btn-dark dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                 Seleccione
               </button>
               <ul class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                 <li><a class="dropdown-item" onclick="borrarUsuario(${json[contador].id_usuario})">Borrar Usuario</a></li>
                 <li>
                 <div><button type="button" class="btn btn-light" data-bs-toggle="modal" data-bs-target="#menuEdicionUsuario" onclick="ObtenerDatos(${json[contador].id_usuario})">
                 Editar Usuario           
                 </button>
                 </div>
                 </li>
               </ul>
             `
               
            }
            $("#tabla").append(tabla+"</table>")
            
            

},
        
                complete : function(xhr, status) {
                //alert('Petición realizada '+xhr.status);
    
    
            }
    });
}
