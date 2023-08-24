package com.nimesia.sweetvillas.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimesia.sweetvillas.dto.LoginDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLogin_ValidCredentials_ReturnsToken() throws Exception {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail("alessio.degiorgi@gmail.com");
        loginDTO.setPwd("Lollo1995!");

        mockMvc.perform(post("/public/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(loginDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.user").exists())
                .andExpect(cookie().exists("token"));
    }

    @Test
    public void testLogin_InvalidCredentials_ReturnsUnauthorized() throws Exception {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail("invalid@example.com");
        loginDTO.setPwd("invalid");

        mockMvc.perform(post("/public/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(loginDTO)))
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$.type").value("InvalidLogin"));
    }
}