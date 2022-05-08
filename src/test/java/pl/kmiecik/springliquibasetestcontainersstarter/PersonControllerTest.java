package pl.kmiecik.springliquibasetestcontainersstarter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;



@AutoConfigureMockMvc
public class PersonControllerTest extends BaseForIntegrationTest{

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getPeopleTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/")
                        .contentType("/application/json"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(5)));


    }

}