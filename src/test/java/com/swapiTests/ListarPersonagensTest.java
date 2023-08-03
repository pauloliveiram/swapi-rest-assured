import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListarPersonagensTest {
    @Test
    public void testQuandoListoOsPersonagensEntaoObtenhoStatusCode200EOsDadosDaResposta() {
        baseURI = "https://swapi.dev";
        basePath = "/api";

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/people")
        .then()
            .assertThat()
                .statusCode(200)
                .body("count", isA(Integer.class))
                .body("next", containsString("https://swapi.dev/api/people/?page="))
                .body("previous", nullValue())
                .body("results", isA(List.class))
                .body("results[0].name", isA(String.class))
                .body("results[0].height", isA(String.class))
                .body("results[0].mass", isA(String.class))
                .body("results[0].hair_color", isA(String.class))
                .body("results[0].skin_color", isA(String.class))
                .body("results[0].eye_color", isA(String.class))
                .body("results[0].birth_year", isA(String.class))
                .body("results[0].gender", isA(String.class))
                .body("results[0].films", isA(List.class))
                .body("results[0].films[0]", isA(String.class))
                .body("results[0].species", isA(List.class))
                .body("results[0].vehicles", isA(List.class))
                .body("results[0].vehicles[0]", isA(String.class))
                .body("results[0].starships", isA(List.class))
                .body("results[0].starships[0]", isA(String.class))
                .body("results[0].created", isA(String.class))
                .body("results[0].edited", isA(String.class))
                .body("results[0].url", containsString("https://swapi.dev/api/people/"));
    }
}
