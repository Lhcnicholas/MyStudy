package com.niczo.resttemplate;

import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MimeTypeUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lhc
 */
@RestController
@RequestMapping
@Slf4j
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("hello")
    public String hello2() {
        return restTemplate.getForObject("http://localhost:8080", String.class);
    }

    @PostMapping("upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        return file.getOriginalFilename();
    }

    @GetMapping("doUpload")
    public String doUpload() {
        File file = new File("./a.txt");
        FileUtil.writeBytes("Hello World".getBytes(StandardCharsets.UTF_8), file);
        HttpHeaders headers = new HttpHeaders();
        byte[] boundary = MimeTypeUtils.generateMultipartBoundary();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("boundary", new String(boundary, StandardCharsets.US_ASCII));
        MediaType mediaType = new MediaType(MediaType.MULTIPART_FORM_DATA, parameters);
        headers.setContentType(mediaType);

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
        parts.add("file",new FileSystemResource(file));
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(parts, headers);
        return restTemplate.postForObject("http://localhost:8080/upload", httpEntity, String.class);
    }
}
