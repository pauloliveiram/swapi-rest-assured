import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BuscarFilmeEspecificoTest {
    @Test
    public void testQuandoBuscoUmFilmeEspecificoEntaoObtenhoStatusCode200EOsDadosDaResposta() {
        baseURI = "https://swapi.dev";
        basePath = "/api";

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/films/1")
        .then()
            .assertThat()
                .statusCode(200)
                .body("title", isA(String.class))
                .body("episode_id", isA(Number.class))
                .body("opening_crawl", isA(String.class))
                .body("director", isA(String.class))
                .body("producer", isA(String.class))
                .body("release_date", isA(String.class))
                .body("characters", isA(List.class))
                .body("characters[0]", isA(String.class))
                .body("planets", isA(List.class))
                .body("planets[0]", isA(String.class))
                .body("starships", isA(List.class))
                .body("starships[0]", isA(String.class))
                .body("vehicles", isA(List.class))
                .body("vehicles[0]", isA(String.class))
                .body("species", isA(List.class))
                .body("species[0]", isA(String.class))
                .body("created", isA(String.class))
                .body("edited", isA(String.class))
                .body("url", containsString("https://swapi.dev/api/films/"));
    }
}
