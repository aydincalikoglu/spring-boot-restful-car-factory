package com.aydincalikoglu.factory;

import com.aydincalikoglu.factory.controller.CarController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class FactoryApplicationTests {

    @Autowired
    private CarController carController;

    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(carController).build();
    }

    @Test
    public void testCarController() throws Exception {

        this.mockMvc.perform(post("/v1/cars")
                .content("{\"type\":\"cabrio\"}")
                .accept(MediaType.TEXT_PLAIN)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("Cabrio Car has produced."));

        this.mockMvc.perform(post("/v1/cars")
                .content("{\"type\":\"Sedan\"}")
                .accept(MediaType.TEXT_PLAIN)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("Sedan Car has produced."));

        this.mockMvc.perform(post("/v1/cars")
                .content("{\"type\":\"Hatchback\"}")
                .accept(MediaType.TEXT_PLAIN)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("Hatchback Car has produced."));

        this.mockMvc.perform(post("/v1/cars")
                .content("{\"type\":\"SHAPELESS\"}")
                .accept(MediaType.TEXT_PLAIN)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

    }

}
