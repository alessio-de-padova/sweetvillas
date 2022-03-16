package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpecServiceTest {

    @Autowired
    private SpecService specService;

    @Test
    public void create_spec() {
        SpecEntity spec = new SpecEntity();

        String id = "ARC";
        List<TextEntity> texts = new ArrayList<>();

        TextEntity enText = new TextEntity();
        TextEntity itText = new TextEntity();

        LangEntity enLang = new LangEntity();
        LangEntity itLang = new LangEntity();

        enLang.setId("en");
        itLang.setId("it");

        enText.setText("Archeology");
        enText.setLang(enLang);
        itText.setText("Archeologia");
        itText.setLang(itLang);

        texts.add(itText);
        texts.add(enText);

        spec.setId(id);
        spec.setTexts(texts);

        SpecEntity createdSpec = specService.save(spec);
        SpecEntity newSpec = specService.get(createdSpec.getId()).get();

        assertThat(newSpec.getId())
                .isEqualTo(spec.getId());

        specService.delete(newSpec.getId());
    }

    @Test
    public void update_spec() {
        SpecEntity spec = new SpecEntity();

        String id = "ARC";
        List<TextEntity> texts = new ArrayList<>();

        TextEntity enText = new TextEntity();
        TextEntity itText = new TextEntity();

        LangEntity enLang = new LangEntity();
        LangEntity itLang = new LangEntity();

        enLang.setId("en");
        itLang.setId("it");

        enText.setText("Archeology");
        enText.setLang(enLang);
        itText.setText("Archeologia");
        itText.setLang(itLang);

        texts.add(itText);
        texts.add(enText);

        spec.setId(id);
        spec.setTexts(texts);

        SpecEntity createdSpec = specService.save(spec);
        SpecEntity newSpec = specService.get(createdSpec.getId()).get();


        newSpec.setTexts(new ArrayList<>());

        SpecEntity updatedSpec = specService.save(newSpec);

        assertThat(updatedSpec.getId())
                .isEqualTo(spec.getId());

        assertThat(updatedSpec.getTexts().size() == 0);

        specService.delete(newSpec.getId());
    }
}