function cargarDatosUsuarios(){
    

    $.ajax({    
            url : 'http://localhost:8080/api/usuarios/all',
        //  data : { id : 123 },
            type : 'GET',
            dataType : 'json',
            
            error : function(xhr, status) {
                alert('ha sucedido un problema, '+xhr.status);
            },
            complete : function(xhr, status) {
               // alert('Petición realizada, '+xhr.status);
            },
            success : function(json) {
              console.log(jason)
              $("#Table").empty();
                
                tabla = `<center><table class="table table-bordered">
                

                <thead class="table-secondary">
                <tr>
                  <th scope="col">Identificacion</th>
                  <th scope="col">Nombre</th>
                  <th scope="col">Email</th>
                  <th scope="col">Contraseña</th>
                  <th scope="col">Direccion</th>
                  <th scope="col">Edad</th>
                  <th scope="col">Sexo</th>
                  <th scope="col">Localidad</th>
                  <th scope="col">Ocupacion</th>
                  <th scope="col">Accion</th>

                </tr>
              </thead>
              <tbody>
              `
              let contador = 0;
                for(i = 0;  i < json.length; i++){
                  
                tabla += `<tr>
                   <td>${json[i].items[i].idUsuario}  
                   <td>${json[i].items[i].name}
                   <td>${json[i].items[i].email}
                   <td>${json[i].items[i].contraseña}
                   <td>${json[i].items[i].direccion}
                   <td>${json[i].items[i].edad}
                   <td>${json[i].items[i].sexo}
                   <td>${json[i].items[i].localidad}
                   <td>${json[i].items[i].ocupacion}
                   <td>
                   <button id="btnGroupDrop1" type="button" class="btn btn-dark dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                     Seleccione
                   </button>
                   <ul class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                     <li><a class="dropdown-item" onclick="inhabilitarUsuario(${json[i].items[i].idUsuario})">Inhabilitar Usuario</a></li>
                     <li>
                     <div><button type="button" class="btn btn-light" data-bs-toggle="modal" data-bs-target="#menuEdicionUsuario" onclick="ObtenerDatosUsuario(${json[contador].idUsuario})">
                     Editar Usuario           
                     </button>
                     </div>
                     </li>
                   </ul>
                 `
                   contador += 1;
                }
                $("#Table").append(tabla+"</table>")
                
                
            }
        });
}


function inhabilitarUsuario(){



}

function ObtenerDatosUsuario(){



}