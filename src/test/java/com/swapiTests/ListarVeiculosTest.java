package com.swapiTests;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListarVeiculosTest {
    @Test
    public void testQuandoListoOsVeiculosEntaoObtenhoStatusCode200EOsDadosDaResposta() {
        baseURI = "https://swapi.dev";
        basePath = "/api";

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/vehicles")
        .then()
            .assertThat()
                .statusCode(200)
                .body("count", isA(Integer.class))
                .body("next", containsString("https://swapi.dev/api/vehicles/?page="))
                .body("previous", nullValue())
                .body("results", isA(List.class))
                .body("results[0].name", isA(String.class))
                .body("results[0].model", isA(String.class))
                .body("results[0].manufacturer", isA(String.class))
                .body("results[0].cost_in_credits", isA(String.class))
                .body("results[0].length", isA(String.class))
                .body("results[0].max_atmosphering_speed", isA(String.class))
                .body("results[0].crew", isA(String.class))
                .body("results[0].passengers", isA(String.class))
                .body("results[0].cargo_capacity", isA(String.class))
                .body("results[0].consumables", isA(String.class))
                .body("results[0].vehicle_class", isA(String.class))
                .body("results[0].pilots", isA(List.class))
                .body("results[0].films", isA(List.class))
                .body("results[0].films[0]", isA(String.class))
                .body("results[0].created", isA(String.class))
                .body("results[0].edited", isA(String.class))
                .body("results[0].url", containsString("https://swapi.dev/api/vehicles/"));
    }
}
