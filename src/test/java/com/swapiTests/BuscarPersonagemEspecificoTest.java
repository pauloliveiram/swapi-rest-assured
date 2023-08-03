import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BuscarPersonagemEspecificoTest {

    @Test
    public void testQuandoBuscoUmPersonagemEspecificoEntaoObtenhoStatusCode200EOsDadosDaResposta() {
        baseURI = "https://swapi.dev";
        basePath = "/api";

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/people/1")
        .then()
            .assertThat()
                .statusCode(200)
                .body("name", isA(String.class))
                .body("height", isA(String.class))
                .body("mass", isA(String.class))
                .body("hair_color", isA(String.class))
                .body("skin_color", isA(String.class))
                .body("eye_color", isA(String.class))
                .body("birth_year", isA(String.class))
                .body("gender", isA(String.class))
                .body("films", isA(List.class))
                .body("films[0]", isA(String.class))
                .body("species", isA(List.class))
                .body("vehicles", isA(List.class))
                .body("vehicles[0]", isA(String.class))
                .body("starships", isA(List.class))
                .body("starships[0]", isA(String.class))
                .body("created", isA(String.class))
                .body("edited", isA(String.class))
                .body("url", containsString("https://swapi.dev/api/people/"));
    }
}
