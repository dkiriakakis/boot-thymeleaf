package main.controller.rest;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class PartialsController {

    @RequestMapping(value = "/partials", method = RequestMethod.GET)
    public String getPartial(@RequestParam(required = true, value = "partial") String partial) throws IOException, URISyntaxException {
        return new String(Files.readAllBytes(
                Paths.get(getClass().getClassLoader().getResource("static/templates/" + partial).toURI())), "UTF-8");
    }


}
