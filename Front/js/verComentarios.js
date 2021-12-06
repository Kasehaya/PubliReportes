
contador = 0;
function cargarDatos(){
    

    $.ajax({    
            url : 'http://129.151.116.109:8080/api/user/all',
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
                
              $("#TablaComentarios").empty();
                
                tabla = `<center><table class="table table-bordered">
                

                <thead class="table-secondary">
                <tr>
                  <th scope="col">Opinion</th>
                  <th scope="col">Opinion</th>
                  <th scope="col">Calificacion</th>
                  <th scope="col">Recomendacion</th>
                  <th scope="col">Fecha</th>

                </tr>
              </thead>
              <tbody>
              `
                for(i = 0;  i < json.length; i++){
                  
                  
                  tabla += `<tr>
                   <td>${json.items[i].idOpinion}
                   <td>${json.items[i].opinion}
                   <td>${json.items[i].calificacion}
                   <td>${json.items[i].recomendacion}
                   <td>${json.items[i].fecha}
                 
                 `
                
                }
                $("#TablaComentarios").append(tabla+"</table>")
                
                
            }
        });
}