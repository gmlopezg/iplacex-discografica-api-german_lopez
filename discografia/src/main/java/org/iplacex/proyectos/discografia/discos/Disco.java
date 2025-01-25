package org.iplacex.proyectos.discografia.discos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Disco {
    public String _id;
    public String idArtista;
    public String nombre;
    public int anioLanzamiento;
    public String canciones;
}
