package com.swapi;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BuscarEspaconaveEspecificaTest {
    @Test
    public void testQuandoListoAsEspaconavesEntaoObtenhoStatusCode200EOsDadosDaResposta() {
        baseURI = "https://swapi.dev";
        basePath = "/api";

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/starships/2")
        .then()
            .assertThat()
                .statusCode(200)
                .body("name", isA(String.class))
                .body("model", isA(String.class))
                .body("manufacturer", isA(String.class))
                .body("cost_in_credits", isA(String.class))
                .body("length", isA(String.class))
                .body("max_atmosphering_speed", isA(String.class))
                .body("crew", isA(String.class))
                .body("passengers", isA(String.class))
                .body("cargo_capacity", isA(String.class))
                .body("consumables", isA(String.class))
                .body("hyperdrive_rating", isA(String.class))
                .body("MGLT", isA(String.class))
                .body("starship_class", isA(String.class))
                .body("pilots", isA(List.class))
                .body("films", isA(List.class))
                .body("films[0]", isA(String.class))
                .body("created", isA(String.class))
                .body("edited", isA(String.class))
                .body("url", containsString("https://swapi.dev/api/starships/"));
    }
}
