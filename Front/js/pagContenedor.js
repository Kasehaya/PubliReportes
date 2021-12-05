function pagComentarios() {
    $("#cont").load("http://127.0.0.1:8887/Front/comentario.html", function (data) {
    $(this).html(data);

    })
}

function pagVerComentarios() {
    $("#cont").load("http://127.0.0.1:8887/Front/verComentarios.html", function (data) {
    $(this).html(data);

    })
}