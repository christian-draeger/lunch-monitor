package it.skrape

import assertk.assertThat
import assertk.assertions.isEqualTo
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.junit.Test

class ApplicationTest {

    @Test
    fun testRoot() {
        withTestApplication {
            handleRequest(HttpMethod.Get, "/").apply {
                assertThat(response.status()).isEqualTo(HttpStatusCode.OK)
                response.content?.let {
                    skrape(it) {
                        assertThat(title()).isEqualTo("Lunch Monitor")
                    }
                }
            }
        }
    }
}

