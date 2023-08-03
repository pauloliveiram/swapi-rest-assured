import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListarFilmesTest {

    @Test
    public void testQuandoListoOsFilmesEntaoObtenhoStatusCode200EOsDadosDaResposta() {
        baseURI = "https://swapi.dev";
        basePath = "/api";

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/films")
        .then()
            .assertThat()
                .statusCode(200)
                .body("count", isA(Integer.class))
                .body("next", nullValue())
                .body("previous", nullValue())
                .body("results", isA(List.class))
                .body("results[0].title", isA(String.class))
                .body("results[0].episode_id", isA(Number.class))
                .body("results[0].opening_crawl", isA(String.class))
                .body("results[0].director", isA(String.class))
                .body("results[0].producer", isA(String.class))
                .body("results[0].release_date", isA(String.class))
                .body("results[0].characters", isA(List.class))
                .body("results[0].characters[0]", isA(String.class))
                .body("results[0].planets", isA(List.class))
                .body("results[0].planets[0]", isA(String.class))
                .body("results[0].starships", isA(List.class))
                .body("results[0].starships[0]", isA(String.class))
                .body("results[0].vehicles", isA(List.class))
                .body("results[0].vehicles[0]", isA(String.class))
                .body("results[0].species", isA(List.class))
                .body("results[0].species[0]", isA(String.class))
                .body("results[0].created", isA(String.class))
                .body("results[0].edited", isA(String.class))
                .body("results[0].url", containsString("https://swapi.dev/api/films/"));
    }
}
