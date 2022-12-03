import com.example.plugins.configureRouting
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.testing.*
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;
class ApplicationTest {

    @Test
    fun testDegree() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/convert/degree?degrees=23")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Seconds are 82800", response.bodyAsText())

        response = client.get("/convert/degree?degrees=1")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Seconds are 3600", response.bodyAsText())
    }

    @Test
    fun testMinute() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/convert/minute?minutes=50")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Seconds are 3000", response.bodyAsText())

        response = client.get("/convert/minute?minutes=2")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Seconds are 120", response.bodyAsText())
    }

    @Test
    fun testRad() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/convert/radians?degrees=17")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Radians are 0.29670597284", response.bodyAsText())

        response = client.get("/convert/radians?degrees=4")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Radians are 0.06981317008", response.bodyAsText())
    }

    @Test
    fun testT() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/convert/radians?minutes=17")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("ERROR EMPTY PARAMETER", response.bodyAsText())

        response = client.get("/convert/minute?degrees=2")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("ERROR EMPTY PARAMETER", response.bodyAsText())
    }
}