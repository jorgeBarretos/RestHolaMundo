/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restholamundo;

import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 *
 * @author sb
 */
@Stateless
@Path("/servicio")
public class ServicioRest {
    @GET
    @Path("/sumar")
    public String sumarNumerosGet(@QueryParam("msg") long msg, @QueryParam("msg2") long msg2) {
        return Long.toString($sumarNumerosGet(msg, msg2));
    }

    long $sumarNumerosGet(long msg, long msg2) {
        return msg + msg2;
    }
    
    @GET
    @Path("/saludar")
    public String saludo() {
        return "Hola... XD";
    }
}
