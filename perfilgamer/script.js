function mostrarSeccion(seccionId) {
    // Ocultar todas las secciones
    const secciones = document.querySelectorAll('.seccion');
    secciones.forEach(seccion => seccion.style.display = 'none');

    // Mostrar solo la sección seleccionada
    const seccionMostrar = document.getElementById(seccionId);
    if(seccionMostrar) {
        seccionMostrar.style.display = 'block';
    }
}
