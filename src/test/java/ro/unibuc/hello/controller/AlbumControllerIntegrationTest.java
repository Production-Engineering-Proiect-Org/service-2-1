package ro.unibuc.hello.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import ro.unibuc.hello.data.AlbumEntity;
import ro.unibuc.hello.service.AlbumService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
class AlbumControllerIntegrationTest {

    @Mock
    private AlbumService albumService;

    @InjectMocks
    private AlbumController albumController;

    private MockMvc mockMvc;

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(albumController).build();
        objectMapper = new ObjectMapper();
    }


    @Test
    void testGetAllAlbums() throws Exception {
        List<AlbumEntity> albumEntities = new ArrayList<>();
        albumEntities.add(new AlbumEntity(1, "Album 1", "Artist 1", 2021, 9.99));
        albumEntities.add(new AlbumEntity(2, "Album 2", "Artist 2", 2022, 19.99));

        Mockito.when(albumService.getAllAlbums()).thenReturn(albumEntities);

        mockMvc.perform(get("/album"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].title", is("Album 1")))
                .andExpect(jsonPath("$[0].artist", is("Artist 1")))
                .andExpect(jsonPath("$[1].id", is(2)))
                .andExpect(jsonPath("$[1].title", is("Album 2")))
                .andExpect(jsonPath("$[1].artist", is("Artist 2")))
                .andDo(mvcResult -> {
                    String response = mvcResult.getResponse().getContentAsString();
                    System.out.println("Response*******************: " + response);
                    System.out.println("JSON path value: " + JsonPath.read(response, "$[0].title"));
                });
    }          
}
