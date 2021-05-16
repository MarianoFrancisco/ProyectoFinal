/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaArchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import manejadorArchivosAeropuerto.Distancia;

/**
 *
 * @author Mariano
 */
public class CargarDistanciaBinario {
    public ArrayList<Distancia> cargarDistanciaBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Distancia> distancias = new ArrayList<>();//indicamos un array list de Distancia para leer los archivos
        String[]  archivos=GuardarDistanciaBinario.archivosDistancia.list();//lista de las Distancias
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarDistanciaBinario.archivosDistancia+"/"+archivo));
            Distancia distance =(Distancia)leerArchivo.readObject();//leemos el objeto y lo casteamos a Distancia
            distancias.add(distance);//añadimos una Distancia
            leerArchivo.close();//cerramos el lector
        }
        return distancias;
    }
}
